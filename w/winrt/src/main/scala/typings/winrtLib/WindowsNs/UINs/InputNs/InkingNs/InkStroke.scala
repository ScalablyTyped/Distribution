package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkStroke")
@js.native
class InkStroke () extends IInkStroke {
  /* CompleteClass */
  override var boundingRect: winrtLib.WindowsNs.FoundationNs.Rect = js.native
  /* CompleteClass */
  override var drawingAttributes: InkDrawingAttributes = js.native
  /* CompleteClass */
  override var recognized: scala.Boolean = js.native
  /* CompleteClass */
  override var selected: scala.Boolean = js.native
  /* CompleteClass */
  override def getRenderingSegments(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStrokeRenderingSegment] = js.native
}

