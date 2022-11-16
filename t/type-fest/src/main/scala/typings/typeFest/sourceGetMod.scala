package typings.typeFest

import typings.typeFest.sourceSplitMod.Split
import typings.typeFest.typeFestBooleans.`true`
import typings.typeFest.typeFestStrings.Dot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceGetMod {
  
  /**
  Returns true if `LongString` is made up out of `Substring` repeated 0 or more times.
  @example
  ```
  ConsistsOnlyOf<'aaa', 'a'> //=> true
  ConsistsOnlyOf<'ababab', 'ab'> //=> true
  ConsistsOnlyOf<'aBa', 'a'> //=> false
  ConsistsOnlyOf<'', 'a'> //=> true
  ```
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    LongString extends '' ? true : LongString extends / * template literal string: ${Substring}${inferTail} * / string ? type-fest.type-fest/source/get.ConsistsOnlyOf</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tail * / any, Substring> : false
    }}}
    */
  type ConsistsOnlyOf[LongString /* <: String */, Substring /* <: String */] = `true`
  
  /**
  Replaces square-bracketed dot notation with dots, for example, `foo[0].bar` -> `foo.0.bar`.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Path extends / * template literal string: [${inferHead}]${inferTail} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tail * / any extends / * template literal string: [${string} * / string ? / * template literal string: ${Head}.${FixPathSquareBrackets<Tail>} * / string : / * template literal string: ${Head}${FixPathSquareBrackets<Tail>} * / string : Path extends / * template literal string: ${inferHead}[${inferMiddle}]${inferTail} * / string ? / * template literal string: ${Head}.${FixPathSquareBrackets<[${Middle}]${Tail}>} * / string : Path
    }}}
    */
  type FixPathSquareBrackets[Path /* <: String */] = Path
  
  type Get[BaseType, Path /* <: String | js.Array[String] */, Options /* <: GetOptions */] = GetWithPath[
    BaseType, 
    /* import warning: importer.ImportType#apply Failed type conversion: Path extends string ? type-fest.type-fest/source/get.ToPath<Path> : Path */ js.Any, 
    Options
  ]
  
  trait GetOptions extends StObject {
    
    /**
    	Include `undefined` in the return type when accessing properties.
    	Setting this to `false` is not recommended.
    	@default true
    	*/
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object GetOptions {
    
    inline def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
    
    extension [Self <: GetOptions](x: Self) {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /**
  Like the `Get` type but receives an array of strings as a path parameter.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Keys extends [] ? BaseType : Keys extends [infer Head, ...infer Tail] ? type-fest.type-fest/source/get.GetWithPath<type-fest.type-fest/source/get.PropertyOf<BaseType, std.Extract<Head, string>, Options>, std.Extract<Tail, std.Array<string>>, Options> : never
    }}}
    */
  type GetWithPath[BaseType, Keys /* <: js.Array[String] */, Options /* <: GetOptions */] = BaseType
  
  /**
  Get a property of an object or array. Works when indexing arrays using number-literal-strings, for example, `PropertyOf<number[], '0'> = number`, and when indexing objects with number keys.
  Note:
  - Returns `unknown` if `Key` is not a property of `BaseType`, since TypeScript uses structural typing, and it cannot be guaranteed that extra properties unknown to the type system will exist at runtime.
  - Returns `undefined` from nullish values, to match the behaviour of most deep-key libraries like `lodash`, `dot-prop`, etc.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    BaseType extends null | undefined ? undefined : Key extends keyof BaseType ? type-fest.type-fest/source/get.StrictPropertyOf<BaseType, Key, Options> : BaseType extends [] | [unknown, ...std.Array<unknown>] ? unknown : BaseType extends {[n: number] : infer Item,   length :number} ? type-fest.type-fest/source/get.ConsistsOnlyOf<Key, type-fest.type-fest/source/internal.StringDigit> extends true ? type-fest.type-fest/source/get.Strictify<Item, Options> : unknown : Key extends keyof type-fest.type-fest/source/get.WithStringKeys<BaseType> ? type-fest.type-fest/source/get.StrictPropertyOf<type-fest.type-fest/source/get.WithStringKeys<BaseType>, Key, Options> : unknown
    }}}
    */
  type PropertyOf[BaseType, Key /* <: String */, Options /* <: GetOptions */] = Unit
  
  /**
  If `Options['strict']` is `true`, includes `undefined` in the returned type when accessing properties on `Record<string, any>`.
  Known limitations:
  - Does not include `undefined` in the type on object types with an index signature (for example, `{a: string; [key: string]: string}`).
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    std.Record<string, any> extends BaseType ? string extends keyof BaseType ? type-fest.type-fest/source/get.Strictify<BaseType[Key], Options> : BaseType[Key] : BaseType[Key]
    }}}
    */
  type StrictPropertyOf[BaseType, Key /* <: /* keyof BaseType */ String */, Options /* <: GetOptions */] = js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: BaseType[Key] */ js.Any
  ]
  
  /**
  Adds `undefined` to `Type` if `strict` is enabled.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Options['strict'] extends false ? Type : Type | undefined
    }}}
    */
  type Strictify[Type, Options /* <: GetOptions */] = Type
  
  /**
  Splits a dot-prop style path into a tuple comprised of the properties in the path. Handles square-bracket notation.
  @example
  ```
  ToPath<'foo.bar.baz'>
  //=> ['foo', 'bar', 'baz']
  ToPath<'foo[0].bar.baz'>
  //=> ['foo', '0', 'bar', 'baz']
  ```
  */
  type ToPath[S /* <: String */] = Split[FixPathSquareBrackets[S], Dot]
  
  /**
  Perform a `T[U]` operation if `T` supports indexing.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    [T] extends [std.Record<string | number, any>] ? T[U] : never
    }}}
    */
  @js.native
  trait UncheckedIndex[T, U /* <: String | Double */] extends StObject
  
  /**
  Convert a type which may have number keys to one with string keys, making it possible to index using strings retrieved from template types.
  @example
  ```
  type WithNumbers = {foo: string; 0: boolean};
  type WithStrings = WithStringKeys<WithNumbers>;
  type WithNumbersKeys = keyof WithNumbers;
  //=> 'foo' | 0
  type WithStringsKeys = keyof WithStrings;
  //=> 'foo' | '0'
  ```
  */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in type-fest.type-fest/source/string-key-of.StringKeyOf<BaseType> ]: type-fest.type-fest/source/get.UncheckedIndex<BaseType, Key>}
    }}}
    */
  @js.native
  trait WithStringKeys[BaseType] extends StObject
}
