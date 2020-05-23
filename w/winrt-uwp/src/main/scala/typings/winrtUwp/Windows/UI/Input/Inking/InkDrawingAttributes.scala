package typings.winrtUwp.Windows.UI.Input.Inking

import typings.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties associated with the drawing of an InkStroke . */
trait InkDrawingAttributes extends js.Object {
  /** Gets or sets a value that indicates the color of an InkStroke . */
  var color: Color
  /** Gets or sets a value that indicates whether the InkStroke is rendered as a highlighter overlay. The stroke is typically set to a bright color, such as yellow. */
  var drawAsHighlighter: Boolean
  /** Gets or sets a value that indicates whether a Bezier curve or a collection of straight line segments is used to draw an InkStroke . */
  var fitToCurve: Boolean
  /** Gets or sets a value that indicates whether the pressure of the contact on the digitizer surface is ignored when you draw an InkStroke . */
  var ignorePressure: Boolean
  /** Gets or sets a value that indicates the shape of the pen tip when you draw an InkStroke . */
  var penTip: PenTipShape
  /** Gets or sets an affine transformation matrix applied to the PenTipShape used for an InkStroke . */
  var penTipTransform: Matrix3x2
  /** Gets or sets a value that indicates the dimensions of the pen tip ( PenTip ) when you draw an InkStroke . */
  var size: Size
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
}

