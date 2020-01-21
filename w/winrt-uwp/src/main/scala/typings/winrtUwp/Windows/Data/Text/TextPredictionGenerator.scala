package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Predicts Japanese words based on a phonetic characters prefix. */
@JSGlobal("Windows.Data.Text.TextPredictionGenerator")
@js.native
class TextPredictionGenerator protected () extends js.Object {
  /**
    * Constructs a TextPredictionGenerator object based on a specific BCP-47 language tag.
    * @param languageTag The BCP-47 language tag of the language in which the words are to be projected. Only Japanese ("ja") is supported.
    */
  def this(languageTag: String) = this()
  /** Determines if the language tag specified is available for generating predictions, but is not installed on the user's device. */
  var languageAvailableButNotInstalled: Boolean = js.native
  /** Gets the language tag of the successfully created TextPredictionGenerator object. */
  var resolvedLanguage: String = js.native
  /**
    * Asynchronously gets a list of candidate words based on the provided phonetic characters prefix.
    * @param input The beginning phonetic characters of the words to be returned.
    * @return An asynchronous operation to return an IVectorView of the list of predicted words.
    */
  def getCandidatesAsync(input: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously gets a list of candidate words, up to a maximum count, based on the provided phonetic characters prefix.
    * @param input The beginning phonetic characters of the words to be returned.
    * @param maxCandidates The maximum number of predicted words to return.
    * @return An asynchronous operation to return an IVectorView of the list of predicted words.
    */
  def getCandidatesAsync(input: String, maxCandidates: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

