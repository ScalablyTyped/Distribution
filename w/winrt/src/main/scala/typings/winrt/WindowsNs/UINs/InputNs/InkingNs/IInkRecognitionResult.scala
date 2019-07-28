package typings.winrt.WindowsNs.UINs.InputNs.InkingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRecognitionResult extends js.Object {
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
    val __obj = js.Dynamic.literal(boundingRect = boundingRect, getStrokes = js.Any.fromFunction0(getStrokes), getTextCandidates = js.Any.fromFunction0(getTextCandidates))
  
    __obj.asInstanceOf[IInkRecognitionResult]
  }
}

