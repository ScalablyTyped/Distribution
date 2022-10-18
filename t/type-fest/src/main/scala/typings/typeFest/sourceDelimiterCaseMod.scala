package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDelimiterCaseMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    string extends Value ? Value : Value extends string ? type-fest.type-fest/source/delimiter-case.StringArrayToDelimiterCase<type-fest.type-fest/source/delimiter-case.SplitIncludingDelimiters<Value, type-fest.type-fest/source/internal.WordSeparators | type-fest.type-fest/source/internal.UpperCaseCharacters>, true, type-fest.type-fest/source/internal.WordSeparators, type-fest.type-fest/source/internal.UpperCaseCharacters, Delimiter> : Value
    }}}
    */
  @js.native
  trait DelimiterCase[Value, Delimiter /* <: String */] extends StObject
  
  type SplitIncludingDelimiters[Source /* <: String */, Delimiter /* <: String */] = SplitIncludingDelimiters_[UpperCaseToLowerCase[Source], Delimiter]
  
  // This implemntation does not supports SCREMAING_SNAKE_CASE, it used internaly by `SplitIncludingDelimiters`.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Source extends '' ? [] : Source extends / * template literal string: ${inferFirstPart}${Delimiter}${inferSecondPart} * / string ? Source extends / * template literal string: ${FirstPart}${inferUsedDelimiter}${SecondPart} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsedDelimiter * / any extends Delimiter ? Source extends / * template literal string: ${inferFirstPart}${UsedDelimiter}${inferSecondPart} * / string ? [...type-fest.type-fest/source/delimiter-case.SplitIncludingDelimiters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstPart * / any, Delimiter>, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsedDelimiter * / any, ...type-fest.type-fest/source/delimiter-case.SplitIncludingDelimiters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SecondPart * / any, Delimiter>] : never : never : never : [Source]
    }}}
    */
  @js.native
  trait SplitIncludingDelimiters_[Source /* <: String */, Delimiter /* <: String */] extends StObject
  
  /**
  Takes the result of a splitted string literal and recursively concatenates it together into the desired casing.
  It receives `UsedWordSeparators` and `UsedUpperCaseCharacters` as input to ensure it's fully encapsulated.
  @see SplitIncludingDelimiters
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Parts extends [/ * template literal string: ${inferFirstPart} * / string, ...infer RemainingParts] ? / * template literal string: ${StringPartToDelimiterCase<FirstPart,Start,UsedWordSeparators,UsedUpperCaseCharacters,Delimiter>}${StringArrayToDelimiterCase<RemainingParts,false,UsedWordSeparators,UsedUpperCaseCharacters,Delimiter>} * / string : Parts extends [string] ? string : ''
    }}}
    */
  @js.native
  trait StringArrayToDelimiterCase[Parts /* <: js.Array[Any] */, Start /* <: Boolean */, UsedWordSeparators /* <: String */, UsedUpperCaseCharacters /* <: String */, Delimiter /* <: String */] extends StObject
  
  /**
  Format a specific part of the splitted string literal that `StringArrayToDelimiterCase<>` fuses together, ensuring desired casing.
  @see StringArrayToDelimiterCase
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    StringPart extends UsedWordSeparators ? Delimiter : Start extends true ? std.Lowercase<StringPart> : StringPart extends UsedUpperCaseCharacters ? / * template literal string: ${Delimiter}${Lowercase<StringPart>} * / string : StringPart
    }}}
    */
  @js.native
  trait StringPartToDelimiterCase[StringPart /* <: String */, Start /* <: Boolean */, UsedWordSeparators /* <: String */, UsedUpperCaseCharacters /* <: String */, Delimiter /* <: String */] extends StObject
  
  // Transforms a string that is fully uppercase into a fully lowercase version. Needed to add support for SCREMAING_SNAKE_CASE, see https://github.com/sindresorhus/type-fest/issues/385
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Uppercase<T> ? std.Lowercase<T> : T
    }}}
    */
  @js.native
  trait UpperCaseToLowerCase[T /* <: String */] extends StObject
}
