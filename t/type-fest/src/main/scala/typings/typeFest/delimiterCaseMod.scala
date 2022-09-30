package typings.typeFest

import typings.std.Lowercase
import typings.typeFest.internalMod.UpperCaseCharacters
import typings.typeFest.internalMod.WordSeparators
import typings.typeFest.typeFestBooleans.`true`
import typings.typeFest.typeFestStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delimiterCaseMod {
  
  type DelimiterCase[Value, Delimiter /* <: String */] = Value | (StringArrayToDelimiterCase[
    SplitIncludingDelimiters[Value, WordSeparators | UpperCaseCharacters], 
    `true`, 
    WordSeparators, 
    UpperCaseCharacters, 
    Delimiter
  ])
  
  type SplitIncludingDelimiters[Source /* <: String */, Delimiter /* <: String */] = SplitIncludingDelimiters_[UpperCaseToLowerCase[Source], Delimiter]
  
  // This implemntation does not supports SCREMAING_SNAKE_CASE, it used internaly by `SplitIncludingDelimiters`.
  type SplitIncludingDelimiters_[Source /* <: String */, Delimiter /* <: String */] = js.Array[Any | Source]
  
  /**
  Takes the result of a splitted string literal and recursively concatenates it together into the desired casing.
  It receives `UsedWordSeparators` and `UsedUpperCaseCharacters` as input to ensure it's fully encapsulated.
  @see SplitIncludingDelimiters
  */
  type StringArrayToDelimiterCase[Parts /* <: js.Array[Any] */, Start /* <: Boolean */, UsedWordSeparators /* <: String */, UsedUpperCaseCharacters /* <: String */, Delimiter /* <: String */] = _empty | String
  
  /**
  Format a specific part of the splitted string literal that `StringArrayToDelimiterCase<>` fuses together, ensuring desired casing.
  @see StringArrayToDelimiterCase
  */
  type StringPartToDelimiterCase[StringPart /* <: String */, Start /* <: Boolean */, UsedWordSeparators /* <: String */, UsedUpperCaseCharacters /* <: String */, Delimiter /* <: String */] = StringPart | (/* template literal string: ${Delimiter}${Lowercase<StringPart>} */ String) | Lowercase[StringPart] | Delimiter
  
  // Transforms a string that is fully uppercase into a fully lowercase version. Needed to add support for SCREMAING_SNAKE_CASE, see https://github.com/sindresorhus/type-fest/issues/385
  type UpperCaseToLowerCase[T /* <: String */] = T | Lowercase[T]
}
