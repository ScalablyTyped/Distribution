package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A segmenter class that is able to segment provided text into units appropriate for selecting text by words. */
@JSGlobal("Windows.Data.Text.SelectableWordsSegmenter")
@js.native
class SelectableWordsSegmenter protected () extends js.Object {
  /**
    * Creates a SelectableWordsSegmenter object. See the introduction in SelectableWordsSegmenter for a description of how the language supplied to this constructor is used.
    * @param language A BCP-47 language tag.
    */
  def this(language: String) = this()
  /** Gets the language of the rules used by this SelectableWordsSegmenter object. */
  var resolvedLanguage: String = js.native
  /**
    * Determines and returns the selectable word which contains or follows a specified index into the provided text.
    * @param text Provided text in which a word is to be selected.
    * @param startIndex A zero-based index into text. It must be less than the length of text.
    * @return A SelectableWordSegment that represents the selected word.
    */
  def getTokenAt(text: String, startIndex: Double): SelectableWordSegment = js.native
  /**
    * Determines and returns all of the selectable words in the provided text.
    * @param text Provided text containing words to be selected.
    * @return A collection of SelectableWordSegment objects that represent the selectable words.
    */
  def getTokens(text: String): IVectorView[SelectableWordSegment] = js.native
  /**
    * Calls the provided handler with two iterators that iterate through the selectable words prior to and following a given index into the provided text.
    * @param text Provided text containing words to be selected.
    * @param startIndex A zero-based index into text. It must be less than the length of text.
    * @param handler The function that receives the iterators.
    */
  def tokenize(text: String, startIndex: Double, handler: SelectableWordSegmentsTokenizingHandler): Unit = js.native
}

