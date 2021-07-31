package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkRecognitionResult extends StObject {
  
  var boundingRect: Rect
  
  def getStrokes(): IVectorView[InkStroke]
  
  def getTextCandidates(): IVectorView[String]
}
object IInkRecognitionResult {
  
  @scala.inline
  def apply(
    boundingRect: Rect,
    getStrokes: () => IVectorView[InkStroke],
    getTextCandidates: () => IVectorView[String]
  ): IInkRecognitionResult = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], getStrokes = js.Any.fromFunction0(getStrokes), getTextCandidates = js.Any.fromFunction0(getTextCandidates))
    __obj.asInstanceOf[IInkRecognitionResult]
  }
  
  @scala.inline
  implicit class IInkRecognitionResultMutableBuilder[Self <: IInkRecognitionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStrokes(value: () => IVectorView[InkStroke]): Self = StObject.set(x, "getStrokes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextCandidates(value: () => IVectorView[String]): Self = StObject.set(x, "getTextCandidates", js.Any.fromFunction0(value))
  }
}
