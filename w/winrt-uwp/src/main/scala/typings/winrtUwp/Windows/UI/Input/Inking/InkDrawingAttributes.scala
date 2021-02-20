package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties associated with the drawing of an InkStroke . */
@js.native
trait InkDrawingAttributes extends StObject {
  
  /** Gets or sets a value that indicates the color of an InkStroke . */
  var color: Color = js.native
  
  /** Gets or sets a value that indicates whether the InkStroke is rendered as a highlighter overlay. The stroke is typically set to a bright color, such as yellow. */
  var drawAsHighlighter: Boolean = js.native
  
  /** Gets or sets a value that indicates whether a Bezier curve or a collection of straight line segments is used to draw an InkStroke . */
  var fitToCurve: Boolean = js.native
  
  /** Gets or sets a value that indicates whether the pressure of the contact on the digitizer surface is ignored when you draw an InkStroke . */
  var ignorePressure: Boolean = js.native
  
  /** Gets or sets a value that indicates the shape of the pen tip when you draw an InkStroke . */
  var penTip: PenTipShape = js.native
  
  /** Gets or sets an affine transformation matrix applied to the PenTipShape used for an InkStroke . */
  var penTipTransform: Matrix3x2 = js.native
  
  /** Gets or sets a value that indicates the dimensions of the pen tip ( PenTip ) when you draw an InkStroke . */
  var size: Size = js.native
}
object InkDrawingAttributes {
  
  @scala.inline
  def apply(
    color: Color,
    drawAsHighlighter: Boolean,
    fitToCurve: Boolean,
    ignorePressure: Boolean,
    penTip: PenTipShape,
    penTipTransform: Matrix3x2,
    size: Size
  ): InkDrawingAttributes = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], drawAsHighlighter = drawAsHighlighter.asInstanceOf[js.Any], fitToCurve = fitToCurve.asInstanceOf[js.Any], ignorePressure = ignorePressure.asInstanceOf[js.Any], penTip = penTip.asInstanceOf[js.Any], penTipTransform = penTipTransform.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkDrawingAttributes]
  }
  
  @scala.inline
  implicit class InkDrawingAttributesMutableBuilder[Self <: InkDrawingAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawAsHighlighter(value: Boolean): Self = StObject.set(x, "drawAsHighlighter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitToCurve(value: Boolean): Self = StObject.set(x, "fitToCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePressure(value: Boolean): Self = StObject.set(x, "ignorePressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPenTip(value: PenTipShape): Self = StObject.set(x, "penTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPenTipTransform(value: Matrix3x2): Self = StObject.set(x, "penTipTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
