package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single ink stroke, including the Bézier curve parameters used for final rendering of the stroke. */
@JSGlobal("Windows.UI.Input.Inking.InkStroke")
@js.native
abstract class InkStroke () extends js.Object {
  /** Gets the bounding box for the InkStroke . */
  var boundingRect: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /** Gets or sets the properties associated with an InkStroke . */
  var drawingAttributes: InkDrawingAttributes = js.native
  /** Gets or sets an affine transformation matrix to apply to the InkStroke object. */
  var pointTransform: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Matrix3x2 = js.native
  /** Gets whether the stroke is recognized. */
  var recognized: scala.Boolean = js.native
  /** Gets whether the stroke is selected. */
  var selected: scala.Boolean = js.native
  /**
                       * Gets the collection of InkPoint objects used to construct the InkStroke .
                       * @return The collection of InkPoint objects used to construct the InkStroke .
                       */
  def getInkPoints(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkPoint] = js.native
  /**
                       * Gets the rendering segments of the stroke.
                       * @return The collection of InkStrokeRenderingSegment objects.
                       */
  def getRenderingSegments(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkStrokeRenderingSegment] = js.native
}

