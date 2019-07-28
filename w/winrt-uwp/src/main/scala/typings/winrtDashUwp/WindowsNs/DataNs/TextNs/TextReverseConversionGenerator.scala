package typings.winrtDashUwp.WindowsNs.DataNs.TextNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reverse-converts a Japanese string which is mix of phonetic and ideographic characters, to a string of phonetic characters. */
@JSGlobal("Windows.Data.Text.TextReverseConversionGenerator")
@js.native
class TextReverseConversionGenerator protected () extends js.Object {
  /**
    * Constructs a TextReverseConversionGenerator object based on a specific BCP-47 language tag.
    * @param languageTag The BCP-47 language tag of the language in which the words are to be reverse-converted. Only Japanese ("ja") is supported.
    */
  def this(languageTag: String) = this()
  /** Determines if the language tag specified is available for reverse conversions, but is not installed on the user's device. */
  var languageAvailableButNotInstalled: Boolean = js.native
  /** Gets the language tag of the successfully created TextReverseConversionGenerator object. */
  var resolvedLanguage: String = js.native
  /**
    * Asynchronously reverse-converts a string which contains ideographic characters to a phonetic expression.
    * @param input The string containing ideographic characters to be reverse-converted.
    * @return An asynchronous operation to return the phonetic expression.
    */
  def convertBackAsync(input: String): IPromiseWithIAsyncOperation[String] = js.native
}

