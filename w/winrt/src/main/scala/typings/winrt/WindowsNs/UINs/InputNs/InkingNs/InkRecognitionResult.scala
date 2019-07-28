package typings.winrt.WindowsNs.UINs.InputNs.InkingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkRecognitionResult")
@js.native
class InkRecognitionResult () extends IInkRecognitionResult {
  /* CompleteClass */
  override var boundingRect: Rect = js.native
  /* CompleteClass */
  override def getStrokes(): IVectorView[InkStroke] = js.native
  /* CompleteClass */
  override def getTextCandidates(): IVectorView[String] = js.native
}

