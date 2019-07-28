package typings.winrt.WindowsNs.UINs.InputNs.InkingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkStroke extends js.Object {
  var boundingRect: Rect
  var drawingAttributes: InkDrawingAttributes
  var recognized: Boolean
  var selected: Boolean
  def getRenderingSegments(): IVectorView[InkStrokeRenderingSegment]
}

object IInkStroke {
  @scala.inline
  def apply(
    boundingRect: Rect,
    clone: () => InkStroke,
    drawingAttributes: InkDrawingAttributes,
    getRenderingSegments: () => IVectorView[InkStrokeRenderingSegment],
    recognized: Boolean,
    selected: Boolean
  ): IInkStroke = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect, clone = js.Any.fromFunction0(clone), drawingAttributes = drawingAttributes, getRenderingSegments = js.Any.fromFunction0(getRenderingSegments), recognized = recognized, selected = selected)
  
    __obj.asInstanceOf[IInkStroke]
  }
}

