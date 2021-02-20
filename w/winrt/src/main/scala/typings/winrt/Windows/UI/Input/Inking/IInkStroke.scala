package typings.winrt.Windows.UI.Input.Inking

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInkStroke extends StObject {
  
  var boundingRect: Rect = js.native
  
  var drawingAttributes: InkDrawingAttributes = js.native
  
  def getRenderingSegments(): IVectorView[InkStrokeRenderingSegment] = js.native
  
  var recognized: Boolean = js.native
  
  var selected: Boolean = js.native
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
  implicit class IInkStrokeMutableBuilder[Self <: IInkStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawingAttributes(value: InkDrawingAttributes): Self = StObject.set(x, "drawingAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRenderingSegments(value: () => IVectorView[InkStrokeRenderingSegment]): Self = StObject.set(x, "getRenderingSegments", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecognized(value: Boolean): Self = StObject.set(x, "recognized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
