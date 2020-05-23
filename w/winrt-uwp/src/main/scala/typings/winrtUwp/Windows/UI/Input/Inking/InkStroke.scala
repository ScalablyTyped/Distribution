package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single ink stroke, including the Bézier curve parameters used for final rendering of the stroke. */
trait InkStroke extends js.Object {
  /** Gets the bounding box for the InkStroke . */
  var boundingRect: Rect
  /** Gets or sets the properties associated with an InkStroke . */
  var drawingAttributes: InkDrawingAttributes
  /** Gets or sets an affine transformation matrix to apply to the InkStroke object. */
  var pointTransform: Matrix3x2
  /** Gets whether the stroke is recognized. */
  var recognized: Boolean
  /** Gets whether the stroke is selected. */
  var selected: Boolean
  /**
    * Gets the collection of InkPoint objects used to construct the InkStroke .
    * @return The collection of InkPoint objects used to construct the InkStroke .
    */
  def getInkPoints(): IVectorView[InkPoint]
  /**
    * Gets the rendering segments of the stroke.
    * @return The collection of InkStrokeRenderingSegment objects.
    */
  def getRenderingSegments(): IVectorView[InkStrokeRenderingSegment]
}

object InkStroke {
  @scala.inline
  def apply(
    boundingRect: Rect,
    drawingAttributes: InkDrawingAttributes,
    getInkPoints: () => IVectorView[InkPoint],
    getRenderingSegments: () => IVectorView[InkStrokeRenderingSegment],
    pointTransform: Matrix3x2,
    recognized: Boolean,
    selected: Boolean
  ): InkStroke = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], drawingAttributes = drawingAttributes.asInstanceOf[js.Any], getInkPoints = js.Any.fromFunction0(getInkPoints), getRenderingSegments = js.Any.fromFunction0(getRenderingSegments), pointTransform = pointTransform.asInstanceOf[js.Any], recognized = recognized.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkStroke]
  }
}

