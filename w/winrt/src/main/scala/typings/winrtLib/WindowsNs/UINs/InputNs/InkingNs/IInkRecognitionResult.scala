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
    getStrokes: js.Function0[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke]],
    getTextCandidates: js.Function0[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]]
  ): IInkRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundingRect")(boundingRect)
    __obj.updateDynamic("getStrokes")(getStrokes)
    __obj.updateDynamic("getTextCandidates")(getTextCandidates)
    __obj.asInstanceOf[IInkRecognitionResult]
  }
}

