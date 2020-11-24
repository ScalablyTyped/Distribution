package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInkRecognitionResult extends js.Object {
  
  var boundingRect: Rect = js.native
  
  def getStrokes(): IVectorView[InkStroke] = js.native
  
  def getTextCandidates(): IVectorView[String] = js.native
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
  implicit class IInkRecognitionResultOps[Self <: IInkRecognitionResult] (val x: Self) extends AnyVal {
    
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
    def setBoundingRect(value: Rect): Self = this.set("boundingRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStrokes(value: () => IVectorView[InkStroke]): Self = this.set("getStrokes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextCandidates(value: () => IVectorView[String]): Self = this.set("getTextCandidates", js.Any.fromFunction0(value))
  }
}
