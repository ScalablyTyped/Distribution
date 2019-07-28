package typings.winrtDashUwp.WindowsNs.UINs.InputNs.InkingNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrtDashUwp.WindowsNs.FoundationNs.NumericsNs.Matrix3x2
import typings.winrtDashUwp.WindowsNs.FoundationNs.Point
import typings.winrtDashUwp.WindowsNs.UINs.InputNs.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Builds strokes from raw pointer input. */
@JSGlobal("Windows.UI.Input.Inking.InkStrokeBuilder")
@js.native
/** Creates a new InkStrokeBuilder object that is used to construct InkStroke objects. */
class InkStrokeBuilder () extends js.Object {
  /**
    * Adds a new segment to the ink stroke.
    * @param pointerPoint The end point of the new segment.
    * @return The previous end point. This end point can be used when rendering the stroke.
    */
  def appendToStroke(pointerPoint: PointerPoint): PointerPoint = js.native
  /**
    * Starts building the ink stroke.
    * @param pointerPoint The first point for the stroke.
    */
  def beginStroke(pointerPoint: PointerPoint): Unit = js.native
  /**
    * Creates a stroke from an array of Point coordinates.
    * @param points An array of Point coordinates.
    * @return The new stroke.
    */
  def createStroke(points: IIterable[Point]): InkStroke = js.native
  /**
    * Creates a stroke from collection of InkPoint objects.
    * @param inkPoints The collection of InkPoint objects.
    * @param transform A 2-D transformation matrix.
    * @return The ink stroke, including the Bézier curve parameters used for final rendering of the stroke.
    */
  def createStrokeFromInkPoints(inkPoints: IIterable[InkPoint], transform: Matrix3x2): InkStroke = js.native
  /**
    * Stops building the ink stroke.
    * @param pointerPoint The last point for the stroke.
    * @return The stroke built from the points.
    */
  def endStroke(pointerPoint: PointerPoint): InkStroke = js.native
  /**
    * Sets the default InkDrawingAttributes for all new ink strokes created after the current stroke.
    * @param drawingAttributes The default attributes.
    */
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit = js.native
}

