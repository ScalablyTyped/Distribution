package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Predicts Japanese words based on a phonetic characters prefix. */
@js.native
trait TextPredictionGenerator extends StObject {
  
  /**
    * Asynchronously gets a list of candidate words based on the provided phonetic characters prefix.
    * @param input The beginning phonetic characters of the words to be returned.
    * @return An asynchronous operation to return an IVectorView of the list of predicted words.
    */
  def getCandidatesAsync(input: String): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  /**
    * Asynchronously gets a list of candidate words, up to a maximum count, based on the provided phonetic characters prefix.
    * @param input The beginning phonetic characters of the words to be returned.
    * @param maxCandidates The maximum number of predicted words to return.
    * @return An asynchronous operation to return an IVectorView of the list of predicted words.
    */
  def getCandidatesAsync(input: String, maxCandidates: Double): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  
  /** Determines if the language tag specified is available for generating predictions, but is not installed on the user's device. */
  var languageAvailableButNotInstalled: Boolean = js.native
  
  /** Gets the language tag of the successfully created TextPredictionGenerator object. */
  var resolvedLanguage: String = js.native
}
