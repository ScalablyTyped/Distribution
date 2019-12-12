package typings.winrtDashUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.color
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.default
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.grayscale
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.monochrome
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.notAvailable
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintColorMode.printerCustom
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintColorMode with Double] = js.native
  /* 3 */ @js.native
  object color extends TopLevel[color with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 4 */ @js.native
  object grayscale extends TopLevel[grayscale with Double]
  
  /* 5 */ @js.native
  object monochrome extends TopLevel[monochrome with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
}

