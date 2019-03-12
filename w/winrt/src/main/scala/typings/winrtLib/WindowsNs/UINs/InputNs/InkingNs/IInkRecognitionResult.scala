package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRecognitionResult extends js.Object {
  var boundingRect: winrtLib.WindowsNs.FoundationNs.Rect
  def getStrokes(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke]
  def getTextCandidates(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
}

object IInkRecognitionResult {
  @scala.inline
  def apply(
    boundingRect: winrtLib.WindowsNs.FoundationNs.Rect,
    getStrokes: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke],
    getTextCandidates: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  ): IInkRecognitionResult = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect, getStrokes = js.Any.fromFunction0(getStrokes), getTextCandidates = js.Any.fromFunction0(getTextCandidates))
  
    __obj.asInstanceOf[IInkRecognitionResult]
  }
}

