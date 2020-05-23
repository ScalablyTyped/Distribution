package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A segmenter class that is able to segment provided text into units appropriate for selecting text by words. */
trait SelectableWordsSegmenter extends js.Object {
  /** Gets the language of the rules used by this SelectableWordsSegmenter object. */
  var resolvedLanguage: String
  /**
    * Determines and returns the selectable word which contains or follows a specified index into the provided text.
    * @param text Provided text in which a word is to be selected.
    * @param startIndex A zero-based index into text. It must be less than the length of text.
    * @return A SelectableWordSegment that represents the selected word.
    */
  def getTokenAt(text: String, startIndex: Double): SelectableWordSegment
  /**
    * Determines and returns all of the selectable words in the provided text.
    * @param text Provided text containing words to be selected.
    * @return A collection of SelectableWordSegment objects that represent the selectable words.
    */
  def getTokens(text: String): IVectorView[SelectableWordSegment]
  /**
    * Calls the provided handler with two iterators that iterate through the selectable words prior to and following a given index into the provided text.
    * @param text Provided text containing words to be selected.
    * @param startIndex A zero-based index into text. It must be less than the length of text.
    * @param handler The function that receives the iterators.
    */
  def tokenize(text: String, startIndex: Double, handler: SelectableWordSegmentsTokenizingHandler): Unit
}

object SelectableWordsSegmenter {
  @scala.inline
  def apply(
    getTokenAt: (String, Double) => SelectableWordSegment,
    getTokens: String => IVectorView[SelectableWordSegment],
    resolvedLanguage: String,
    tokenize: (String, Double, SelectableWordSegmentsTokenizingHandler) => Unit
  ): SelectableWordsSegmenter = {
    val __obj = js.Dynamic.literal(getTokenAt = js.Any.fromFunction2(getTokenAt), getTokens = js.Any.fromFunction1(getTokens), resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3(tokenize))
    __obj.asInstanceOf[SelectableWordsSegmenter]
  }
}

