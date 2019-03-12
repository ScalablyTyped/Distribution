package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkStroke extends js.Object {
  var boundingRect: winrtLib.WindowsNs.FoundationNs.Rect
  var drawingAttributes: InkDrawingAttributes
  var recognized: scala.Boolean
  var selected: scala.Boolean
  def getRenderingSegments(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStrokeRenderingSegment]
}

object IInkStroke {
  @scala.inline
  def apply(
    boundingRect: winrtLib.WindowsNs.FoundationNs.Rect,
    clone: () => InkStroke,
    drawingAttributes: InkDrawingAttributes,
    getRenderingSegments: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStrokeRenderingSegment],
    recognized: scala.Boolean,
    selected: scala.Boolean
  ): IInkStroke = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect, clone = js.Any.fromFunction0(clone), drawingAttributes = drawingAttributes, getRenderingSegments = js.Any.fromFunction0(getRenderingSegments), recognized = recognized, selected = selected)
  
    __obj.asInstanceOf[IInkStroke]
  }
}

