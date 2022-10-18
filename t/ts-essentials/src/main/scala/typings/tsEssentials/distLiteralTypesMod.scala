package typings.tsEssentials

import typings.std.Capitalize
import typings.std.Uncapitalize
import typings.tsEssentials.tsEssentialsStrings._empty
import typings.tsEssentials.tsEssentialsStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteralTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [infer First, ...infer Tail] ? ts-essentials.ts-essentials/dist/literal-types.PascalCapitalizer<Tail, [First]> : []
    }}}
    */
  @js.native
  trait CamelCapitalizer[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-essentials.ts-essentials/dist/literal-types.IsStringLiteral<T> extends true ? ts-essentials.ts-essentials/dist/literal-types.Join<ts-essentials.ts-essentials/dist/literal-types.CamelCapitalizer<ts-essentials.ts-essentials/dist/literal-types.SplitAnyCase<T>>, ''> : T
    }}}
    */
  @js.native
  trait CamelCase[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends '' ? Result : T extends / * template literal string: ${WordInCamelCase<T&string>}${inferTail} * / string ? T extends / * template literal string: ${inferWord}${Tail} * / string ? ts-essentials.ts-essentials/dist/literal-types.CamelCaseParser<std.Uncapitalize</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tail * / any>, [...Result, std.Lowercase</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Word * / any>]> : never : never
    }}}
    */
  @js.native
  trait CamelCaseParser[T, Result /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Record<string, unknown> ? {[ K in keyof T as ts-essentials.ts-essentials/dist/literal-types.CamelCase<K> ]: ts-essentials.ts-essentials/dist/literal-types.DeepCamelCaseProperties<T[K]>} : T
    }}}
    */
  @js.native
  trait DeepCamelCaseProperties[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends / * template literal string: ${string}${Separator}${string} * / string ? true : false
    }}}
    */
  @js.native
  trait IncludesSeparator[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Uncapitalize<T & string> ? true : false
    }}}
    */
  @js.native
  trait IsCamelCase[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Lowercase<T & string> ? true : T extends std.Uppercase<T & string> ? true : false
    }}}
    */
  @js.native
  trait IsOneWord[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Capitalize<T & string> ? true : false
    }}}
    */
  @js.native
  trait IsPascalCase[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends string ? string extends T ? false : true : false
    }}}
    */
  @js.native
  trait IsStringLiteral[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [infer Head, ...infer Tail] ? Head extends string ? ts-essentials.ts-essentials/dist/literal-types.Join<Tail, / * template literal string: ${Result}${Head} * / string> : ts-essentials.ts-essentials/dist/literal-types.Join<Tail, ''> : Result
    }}}
    */
  @js.native
  trait Join[T, Result /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [infer Head, ...infer Tail] ? Head extends string ? ts-essentials.ts-essentials/dist/literal-types.PascalCapitalizer<Tail, [...Result, std.Capitalize<Head>]> : ts-essentials.ts-essentials/dist/literal-types.PascalCapitalizer<Tail, Result> : Result
    }}}
    */
  @js.native
  trait PascalCapitalizer[T, Result /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends '' ? Result : T extends / * template literal string: ${WordInPascalCase<T&string>}${inferTail} * / string ? T extends / * template literal string: ${inferWord}${Tail} * / string ? ts-essentials.ts-essentials/dist/literal-types.PascalCaseParser</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tail * / any, [...Result, std.Lowercase</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Word * / any>]> : never : never
    }}}
    */
  @js.native
  trait PascalCaseParser[T, Result /* <: js.Array[Any] */] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsStrings._underscore
    - typings.tsEssentials.tsEssentialsStrings.`-_`
  */
  trait Separator extends StObject
  object Separator {
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
    
    inline def _underscore: typings.tsEssentials.tsEssentialsStrings._underscore = "_".asInstanceOf[typings.tsEssentials.tsEssentialsStrings._underscore]
  }
  
  /** snake_case, CONSTANT_CASE, kebab-case or COBOL-CASE */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends / * template literal string: ${inferWord}${Separator}${inferTail} * / string ? ts-essentials.ts-essentials/dist/literal-types.SeparatorCaseParser</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tail * / any, [...Result, std.Lowercase</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Word * / any>]> : T extends / * template literal string: ${inferWord} * / string ? [...Result, std.Lowercase</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Word * / any>] : Result
    }}}
    */
  @js.native
  trait SeparatorCaseParser[T, Result /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-essentials.ts-essentials/dist/literal-types.IncludesSeparator<T> extends true ? ts-essentials.ts-essentials/dist/literal-types.SeparatorCaseParser<T, []> : ts-essentials.ts-essentials/dist/literal-types.IsOneWord<T> extends true ? [std.Lowercase<T & string>] : ts-essentials.ts-essentials/dist/literal-types.IsCamelCase<T> extends true ? ts-essentials.ts-essentials/dist/literal-types.CamelCaseParser<T, []> : ts-essentials.ts-essentials/dist/literal-types.IsPascalCase<T> extends true ? ts-essentials.ts-essentials/dist/literal-types.PascalCaseParser<T, []> : []
    }}}
    */
  @js.native
  trait SplitAnyCase[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends / * template literal string: ${Ch}${inferNextCh}${infer_} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NextCh * / any extends std.Capitalize</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NextCh * / any> ? Ch : ts-essentials.ts-essentials/dist/literal-types.WordInCamelCase<T, / * template literal string: ${Ch}${NextCh} * / string> : Ch
    }}}
    */
  @js.native
  trait WordInCamelCase[T, Ch /* <: String */] extends StObject
  
  type WordInPascalCase[T] = Capitalize[WordInCamelCase[Uncapitalize[T & String], _empty]]
}
