package typings.winrtDashUwp.Windows.UI.Input.Inking

import typings.winrtDashUwp.Windows.Foundation.Numerics.Matrix3x2
import typings.winrtDashUwp.Windows.Foundation.Size
import typings.winrtDashUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties associated with the drawing of an InkStroke . */
@JSGlobal("Windows.UI.Input.Inking.InkDrawingAttributes")
@js.native
/** Creates a new InkDrawingAttributes object that is used to specify InkStroke attributes. */
class InkDrawingAttributes () extends js.Object {
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

