package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkRecognitionResult")
@js.native
class InkRecognitionResult () extends IInkRecognitionResult {
  /* CompleteClass */
  override var boundingRect: winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override def getStrokes(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStroke] = js.native
  /* CompleteClass */
  override def getTextCandidates(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
}

