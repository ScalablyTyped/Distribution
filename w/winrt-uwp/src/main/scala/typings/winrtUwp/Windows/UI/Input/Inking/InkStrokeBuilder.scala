package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builds strokes from raw pointer input. */
@js.native
trait InkStrokeBuilder extends StObject {
  
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
object InkStrokeBuilder {
  
  @scala.inline
  def apply(
    appendToStroke: PointerPoint => PointerPoint,
    beginStroke: PointerPoint => Unit,
    createStroke: IIterable[Point] => InkStroke,
    createStrokeFromInkPoints: (IIterable[InkPoint], Matrix3x2) => InkStroke,
    endStroke: PointerPoint => InkStroke,
    setDefaultDrawingAttributes: InkDrawingAttributes => Unit
  ): InkStrokeBuilder = {
    val __obj = js.Dynamic.literal(appendToStroke = js.Any.fromFunction1(appendToStroke), beginStroke = js.Any.fromFunction1(beginStroke), createStroke = js.Any.fromFunction1(createStroke), createStrokeFromInkPoints = js.Any.fromFunction2(createStrokeFromInkPoints), endStroke = js.Any.fromFunction1(endStroke), setDefaultDrawingAttributes = js.Any.fromFunction1(setDefaultDrawingAttributes))
    __obj.asInstanceOf[InkStrokeBuilder]
  }
  
  @scala.inline
  implicit class InkStrokeBuilderMutableBuilder[Self <: InkStrokeBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendToStroke(value: PointerPoint => PointerPoint): Self = StObject.set(x, "appendToStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginStroke(value: PointerPoint => Unit): Self = StObject.set(x, "beginStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateStroke(value: IIterable[Point] => InkStroke): Self = StObject.set(x, "createStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateStrokeFromInkPoints(value: (IIterable[InkPoint], Matrix3x2) => InkStroke): Self = StObject.set(x, "createStrokeFromInkPoints", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndStroke(value: PointerPoint => InkStroke): Self = StObject.set(x, "endStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultDrawingAttributes(value: InkDrawingAttributes => Unit): Self = StObject.set(x, "setDefaultDrawingAttributes", js.Any.fromFunction1(value))
  }
}
