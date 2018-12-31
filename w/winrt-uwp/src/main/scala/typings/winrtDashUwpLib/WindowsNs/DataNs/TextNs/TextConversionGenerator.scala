package typings
package winrtDashUwpLib.WindowsNs.DataNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Converts input phonetic characters into a collection of corresponding ideographic characters (Chinese characters). */
@JSGlobal("Windows.Data.Text.TextConversionGenerator")
@js.native
class TextConversionGenerator protected () extends js.Object {
  /**
    * Constructs a TextConversionGenerator object based on a specific BCP-47 language tag.
    * @param languageTag The BCP-47 language tag of the language in which the words are to be projected. Japanese ("ja") and Simplified Chinese ("zh-Hans") are supported.
    */
  def this(languageTag: java.lang.String) = this()
  /** Determines if the language tag specified is available for conversions, but is not installed on the user's device. */
  var languageAvailableButNotInstalled: scala.Boolean = js.native
  /** Gets the language tag of the successfully created TextConversionGenerator object. */
  var resolvedLanguage: java.lang.String = js.native
  /**
    * Asynchronously gets a list of candidate words based on the provided phonetic characters.
    * @param input The phonetic characters of the words to be returned.
    * @return An asynchronous operation to return an IVectorView of the list of candidate words.
    */
  def getCandidatesAsync(input: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Asynchronously gets a list of candidate words, up to a maximum count, based on the provided phonetic characters.
    * @param input The phonetic characters of the words to be returned.
    * @param maxCandidates The maximum number of candidate words to return.
    * @return An asynchronous operation to return an IVectorView of the list of candidate words.
    */
  def getCandidatesAsync(input: java.lang.String, maxCandidates: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

