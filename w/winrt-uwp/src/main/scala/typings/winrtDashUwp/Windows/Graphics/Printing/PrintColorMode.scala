package typings.winrtDashUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintColorMode extends js.Object

/** Specifies the color mode option. */
@JSGlobal("Windows.Graphics.Printing.PrintColorMode")
@js.native
object PrintColorMode extends js.Object {
  /** An option to indicate that the printed output will be in color. */
  @js.native
  sealed trait color extends PrintColorMode
  
  /** The default color mode option. */
  @js.native
  sealed trait default extends PrintColorMode
  
  /** An option to indicate that the printed output will be in shades of gray. */
  @js.native
  sealed trait grayscale extends PrintColorMode
  
  /** An option to indicate that the printed output will be in one shade of a single color. */
  @js.native
  sealed trait monochrome extends PrintColorMode
  
  /** An unsupported color mode option. */
  @js.native
  sealed trait notAvailable extends PrintColorMode
  
  /** A custom color mode option that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintColorMode
  
  /* 3 */ val color: typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.color with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.default with Double = js.native
  /* 4 */ val grayscale: typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.grayscale with Double = js.native
  /* 5 */ val monochrome: typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.monochrome with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.printerCustom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintColorMode with Double] = js.native
}

