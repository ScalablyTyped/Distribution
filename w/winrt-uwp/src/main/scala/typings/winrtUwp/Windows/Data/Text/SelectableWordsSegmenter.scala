package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A segmenter class that is able to segment provided text into units appropriate for selecting text by words. */
@js.native
trait SelectableWordsSegmenter extends js.Object {
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
  @scala.inline
  implicit class SelectableWordsSegmenterOps[Self <: SelectableWordsSegmenter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetTokenAt(value: (String, Double) => SelectableWordSegment): Self = this.set("getTokenAt", js.Any.fromFunction2(value))
    @scala.inline
    def setGetTokens(value: String => IVectorView[SelectableWordSegment]): Self = this.set("getTokens", js.Any.fromFunction1(value))
    @scala.inline
    def setResolvedLanguage(value: String): Self = this.set("resolvedLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenize(value: (String, Double, SelectableWordSegmentsTokenizingHandler) => Unit): Self = this.set("tokenize", js.Any.fromFunction3(value))
  }
  
}

