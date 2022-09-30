package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.typeFest.splitMod.Split
import typings.typeFest.typeFestStrings.Dot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMod {
  
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
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestBooleans.`false`
    - typings.typeFest.typeFestBooleans.`true`
  */
  trait ConsistsOnlyOf[LongString /* <: String */, Substring /* <: String */] extends StObject
  
  /**
  Replaces square-bracketed dot notation with dots, for example, `foo[0].bar` -> `foo.0.bar`.
  */
  type FixPathSquareBrackets[Path /* <: String */] = Path | (/* template literal string: ${Head}.${FixPathSquareBrackets<[${Middle}]${Tail}>} */ String)
  
  type Get[BaseType, Path /* <: String | js.Array[String] */, Options /* <: GetOptions */] = GetWithPath[BaseType, Path | ToPath[Path], Options]
  
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
  type GetWithPath[BaseType, Keys /* <: js.Array[String] */, Options /* <: GetOptions */] = Any | BaseType
  
  /**
  Get a property of an object or array. Works when indexing arrays using number-literal-strings, for example, `PropertyOf<number[], '0'> = number`, and when indexing objects with number keys.
  Note:
  - Returns `unknown` if `Key` is not a property of `BaseType`, since TypeScript uses structural typing, and it cannot be guaranteed that extra properties unknown to the type system will exist at runtime.
  - Returns `undefined` from nullish values, to match the behaviour of most deep-key libraries like `lodash`, `dot-prop`, etc.
  */
  type PropertyOf[BaseType, Key /* <: String */, Options /* <: GetOptions */] = js.UndefOr[
    Any | (StrictPropertyOf[BaseType | WithStringKeys[BaseType], Key, Options]) | (Strictify[Any, Options])
  ]
  
  /**
  If `Options['strict']` is `true`, includes `undefined` in the returned type when accessing properties on `Record<string, any>`.
  Known limitations:
  - Does not include `undefined` in the type on object types with an index signature (for example, `{a: string; [key: string]: string}`).
  */
  type StrictPropertyOf[BaseType, Key /* <: /* keyof BaseType */ String */, Options /* <: GetOptions */] = (/* import warning: importer.ImportType#apply Failed type conversion: BaseType[Key] */ js.Any) | (Strictify[
    /* import warning: importer.ImportType#apply Failed type conversion: BaseType[Key] */ js.Any, 
    Options
  ])
  
  /**
  Adds `undefined` to `Type` if `strict` is enabled.
  */
  type Strictify[Type, Options /* <: GetOptions */] = js.UndefOr[Type]
  
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
  type UncheckedIndex[T, U /* <: String | Double */] = /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any
  
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
  type WithStringKeys[BaseType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in type-fest.type-fest/source/string-key-of.StringKeyOf<BaseType> ]: type-fest.type-fest/source/get.UncheckedIndex<BaseType, Key>}
    */ typings.typeFest.typeFestStrings.WithStringKeys & TopLevel[Any]
}
