package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods to manage one or more InkRecognizer objects used for handwriting recognition. */
trait InkRecognizerContainer extends StObject {
  
  /**
    * Gets the collection of installed handwriting recognizers.
    * @return The installed handwriting recognizers as a collection of InkRecognizer objects.
    */
  def getRecognizers(): IVectorView[InkRecognizer]
  
  /**
    * Performs handwriting recognition on one or more InkStroke objects.
    * @param strokeCollection The set of strokes on which recognition is performed.
    * @param recognitionTarget One of the values from the InkRecognitionTarget enumeration.
    * @return The results of the recognition as a collection of InkRecognitionResult objects.
    */
  def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): IPromiseWithIAsyncOperation[IVectorView[js.Any]]
  
  /**
    * Sets the default InkRecognizer used for handwriting recognition.
    * @param recognizer The InkRecognizer .
    */
  def setDefaultRecognizer(recognizer: InkRecognizer): Unit
}
object InkRecognizerContainer {
  
  inline def apply(
    getRecognizers: () => IVectorView[InkRecognizer],
    recognizeAsync: (InkStrokeContainer, InkRecognitionTarget) => IPromiseWithIAsyncOperation[IVectorView[js.Any]],
    setDefaultRecognizer: InkRecognizer => Unit
  ): InkRecognizerContainer = {
    val __obj = js.Dynamic.literal(getRecognizers = js.Any.fromFunction0(getRecognizers), recognizeAsync = js.Any.fromFunction2(recognizeAsync), setDefaultRecognizer = js.Any.fromFunction1(setDefaultRecognizer))
    __obj.asInstanceOf[InkRecognizerContainer]
  }
  
  extension [Self <: InkRecognizerContainer](x: Self) {
    
    inline def setGetRecognizers(value: () => IVectorView[InkRecognizer]): Self = StObject.set(x, "getRecognizers", js.Any.fromFunction0(value))
    
    inline def setRecognizeAsync(
      value: (InkStrokeContainer, InkRecognitionTarget) => IPromiseWithIAsyncOperation[IVectorView[js.Any]]
    ): Self = StObject.set(x, "recognizeAsync", js.Any.fromFunction2(value))
    
    inline def setSetDefaultRecognizer(value: InkRecognizer => Unit): Self = StObject.set(x, "setDefaultRecognizer", js.Any.fromFunction1(value))
  }
}
