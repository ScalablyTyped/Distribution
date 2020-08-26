package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkStroke extends js.Object {
  var boundingRect: Rect = js.native
  var drawingAttributes: InkDrawingAttributes = js.native
  var recognized: Boolean = js.native
  var selected: Boolean = js.native
  def getRenderingSegments(): IVectorView[InkStrokeRenderingSegment] = js.native
}

object IInkStroke {
  @scala.inline
  def apply(
    boundingRect: Rect,
    drawingAttributes: InkDrawingAttributes,
    getRenderingSegments: () => IVectorView[InkStrokeRenderingSegment],
    recognized: Boolean,
    selected: Boolean
  ): IInkStroke = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], drawingAttributes = drawingAttributes.asInstanceOf[js.Any], getRenderingSegments = js.Any.fromFunction0(getRenderingSegments), recognized = recognized.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkStroke]
  }
  @scala.inline
  implicit class IInkStrokeOps[Self <: IInkStroke] (val x: Self) extends AnyVal {
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
    def setDrawingAttributes(value: InkDrawingAttributes): Self = this.set("drawingAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRenderingSegments(value: () => IVectorView[InkStrokeRenderingSegment]): Self = this.set("getRenderingSegments", js.Any.fromFunction0(value))
    @scala.inline
    def setRecognized(value: Boolean): Self = this.set("recognized", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
  
}

