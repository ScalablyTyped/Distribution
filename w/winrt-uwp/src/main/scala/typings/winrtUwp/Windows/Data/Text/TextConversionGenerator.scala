package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Converts input phonetic characters into a collection of corresponding ideographic characters (Chinese characters). */
@js.native
trait TextConversionGenerator extends js.Object {
  /** Determines if the language tag specified is available for conversions, but is not installed on the user's device. */
  var languageAvailableButNotInstalled: Boolean = js.native
  /** Gets the language tag of the successfully created TextConversionGenerator object. */
  var resolvedLanguage: String = js.native
  /**
    * Asynchronously gets a list of candidate words based on the provided phonetic characters.
    * @param input The phonetic characters of the words to be returned.
    * @return An asynchronous operation to return an IVectorView of the list of candidate words.
    */
  def getCandidatesAsync(input: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously gets a list of candidate words, up to a maximum count, based on the provided phonetic characters.
    * @param input The phonetic characters of the words to be returned.
    * @param maxCandidates The maximum number of candidate words to return.
    * @return An asynchronous operation to return an IVectorView of the list of candidate words.
    */
  def getCandidatesAsync(input: String, maxCandidates: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

