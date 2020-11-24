package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single ink stroke, including the Bézier curve parameters used for final rendering of the stroke. */
@js.native
trait InkStroke extends js.Object {
  
  /** Gets the bounding box for the InkStroke . */
  var boundingRect: Rect = js.native
  
  /** Gets or sets the properties associated with an InkStroke . */
  var drawingAttributes: InkDrawingAttributes = js.native
  
  /**
    * Gets the collection of InkPoint objects used to construct the InkStroke .
    * @return The collection of InkPoint objects used to construct the InkStroke .
    */
  def getInkPoints(): IVectorView[InkPoint] = js.native
  
  /**
    * Gets the rendering segments of the stroke.
    * @return The collection of InkStrokeRenderingSegment objects.
    */
  def getRenderingSegments(): IVectorView[InkStrokeRenderingSegment] = js.native
  
  /** Gets or sets an affine transformation matrix to apply to the InkStroke object. */
  var pointTransform: Matrix3x2 = js.native
  
  /** Gets whether the stroke is recognized. */
  var recognized: Boolean = js.native
  
  /** Gets whether the stroke is selected. */
  var selected: Boolean = js.native
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
  
  @scala.inline
  implicit class InkStrokeOps[Self <: InkStroke] (val x: Self) extends AnyVal {
    
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
    def setGetInkPoints(value: () => IVectorView[InkPoint]): Self = this.set("getInkPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRenderingSegments(value: () => IVectorView[InkStrokeRenderingSegment]): Self = this.set("getRenderingSegments", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPointTransform(value: Matrix3x2): Self = this.set("pointTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognized(value: Boolean): Self = this.set("recognized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
