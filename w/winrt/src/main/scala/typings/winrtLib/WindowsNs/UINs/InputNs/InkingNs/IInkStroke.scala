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

