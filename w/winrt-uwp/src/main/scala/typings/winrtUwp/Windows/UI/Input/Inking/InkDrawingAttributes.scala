package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties associated with the drawing of an InkStroke . */
@js.native
trait InkDrawingAttributes extends js.Object {
  
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
  implicit class InkDrawingAttributesOps[Self <: InkDrawingAttributes] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawAsHighlighter(value: Boolean): Self = this.set("drawAsHighlighter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitToCurve(value: Boolean): Self = this.set("fitToCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePressure(value: Boolean): Self = this.set("ignorePressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPenTip(value: PenTipShape): Self = this.set("penTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPenTipTransform(value: Matrix3x2): Self = this.set("penTipTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
