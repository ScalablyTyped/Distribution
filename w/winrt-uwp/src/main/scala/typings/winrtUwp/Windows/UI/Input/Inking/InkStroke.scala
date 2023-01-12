package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typings.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single ink stroke, including the Bézier curve parameters used for final rendering of the stroke. */
trait InkStroke extends StObject {
  
  /** Gets the bounding box for the InkStroke . */
  var boundingRect: Rect
  
  /** Gets or sets the properties associated with an InkStroke . */
  var drawingAttributes: InkDrawingAttributes
  
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
  
  /** Gets or sets an affine transformation matrix to apply to the InkStroke object. */
  var pointTransform: Matrix3x2
  
  /** Gets whether the stroke is recognized. */
  var recognized: Boolean
  
  /** Gets whether the stroke is selected. */
  var selected: Boolean
}
object InkStroke {
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InkStroke] (val x: Self) extends AnyVal {
    
    inline def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    inline def setDrawingAttributes(value: InkDrawingAttributes): Self = StObject.set(x, "drawingAttributes", value.asInstanceOf[js.Any])
    
    inline def setGetInkPoints(value: () => IVectorView[InkPoint]): Self = StObject.set(x, "getInkPoints", js.Any.fromFunction0(value))
    
    inline def setGetRenderingSegments(value: () => IVectorView[InkStrokeRenderingSegment]): Self = StObject.set(x, "getRenderingSegments", js.Any.fromFunction0(value))
    
    inline def setPointTransform(value: Matrix3x2): Self = StObject.set(x, "pointTransform", value.asInstanceOf[js.Any])
    
    inline def setRecognized(value: Boolean): Self = StObject.set(x, "recognized", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
