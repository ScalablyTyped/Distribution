package typings.typeFest

import typings.std.Lowercase
import typings.std.Uncapitalize
import typings.typeFest.internalMod.WordSeparators
import typings.typeFest.splitMod.Split
import typings.typeFest.typeFestStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camelCaseMod {
  
  type CamelCase[K] = K | (CamelCaseStringArray[Split[K | Lowercase[K], WordSeparators]])
  
  /**
  Starts fusing the output of `Split<>`, an array literal of strings, into a camel-cased string literal.
  It's separate from `InnerCamelCaseStringArray<>` to keep a clean API outwards to the rest of the code.
  @see Split
  */
  type CamelCaseStringArray[Parts /* <: js.Array[String] */] = Uncapitalize[
    /* template literal string: ${FirstPart}${InnerCamelCaseStringArray<RemainingParts,FirstPart>} */ String
  ]
  
  /**
  Step by step takes the first item in an array literal, formats it and adds it to a string literal, and then recursively appends the remainder.
  Only to be used by `CamelCaseStringArray<>`.
  @see CamelCaseStringArray
  */
  type InnerCamelCaseStringArray[Parts /* <: js.Array[Any] */, PreviousPart] = _empty | (/* template literal string: ${PreviousPartextends?FirstPart:Capitalize<FirstPart>}${InnerCamelCaseStringArray<RemainingParts,FirstPart>} */ String)
}
