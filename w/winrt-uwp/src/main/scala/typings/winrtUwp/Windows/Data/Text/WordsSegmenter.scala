package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A segmenter class that is able to segment provided text into words. */
trait WordsSegmenter extends StObject {
  
  /**
    * Determines and returns the word which contains or follows a specified index into the provided text.
    * @param text Provided text from which the word is to be returned.
    * @param startIndex A zero-based index into text. It must be less than the length of text.
    * @return A WordSegment that represents the word.
    */
  def getTokenAt(text: String, startIndex: Double): WordSegment
  
  /**
    * Determines and returns all of the words in the provided text.
    * @param text Provided text containing words to be returned.
    * @return A collection of WordSegment objects that represent the words.
    */
  def getTokens(text: String): IVectorView[WordSegment]
  
  /** Gets the language of the rules used by this WordsSegmenter object. */
  var resolvedLanguage: String
  
  /**
    * Calls the provided handler with two iterators that iterate through the words prior to and following a given index into the provided text.
    * @param text Provided text containing words to be returned.
    * @param startIndex A zero-based index into text. It must be less than the length of text.
    * @param handler The function that receives the iterators.
    */
  def tokenize(text: String, startIndex: Double, handler: WordSegmentsTokenizingHandler): Unit
}
object WordsSegmenter {
  
  inline def apply(
    getTokenAt: (String, Double) => WordSegment,
    getTokens: String => IVectorView[WordSegment],
    resolvedLanguage: String,
    tokenize: (String, Double, WordSegmentsTokenizingHandler) => Unit
  ): WordsSegmenter = {
    val __obj = js.Dynamic.literal(getTokenAt = js.Any.fromFunction2(getTokenAt), getTokens = js.Any.fromFunction1(getTokens), resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3(tokenize))
    __obj.asInstanceOf[WordsSegmenter]
  }
  
  extension [Self <: WordsSegmenter](x: Self) {
    
    inline def setGetTokenAt(value: (String, Double) => WordSegment): Self = StObject.set(x, "getTokenAt", js.Any.fromFunction2(value))
    
    inline def setGetTokens(value: String => IVectorView[WordSegment]): Self = StObject.set(x, "getTokens", js.Any.fromFunction1(value))
    
    inline def setResolvedLanguage(value: String): Self = StObject.set(x, "resolvedLanguage", value.asInstanceOf[js.Any])
    
    inline def setTokenize(value: (String, Double, WordSegmentsTokenizingHandler) => Unit): Self = StObject.set(x, "tokenize", js.Any.fromFunction3(value))
  }
}
