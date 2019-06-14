package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOrientation extends js.Object

/** Specifies the orientation options for the printed output. */
@JSGlobal("Windows.Graphics.Printing.PrintOrientation")
@js.native
object PrintOrientation extends js.Object {
  /** The default orientation option. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  /** The Landscape orientation option. */
  @js.native
  sealed trait landscape
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  /** The LandscapeFlipped orientation option. */
  @js.native
  sealed trait landscapeFlipped
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  /** An orientaiton option that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  /** The Portrait orientation option. */
  @js.native
  sealed trait portrait
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  /** The PortraitFlipped orientation option. */
  @js.native
  sealed trait portraitFlipped
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  /** A custom orientation that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 5 */ val landscape: landscape with scala.Double = js.native
  /* 6 */ val landscapeFlipped: landscapeFlipped with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 3 */ val portrait: portrait with scala.Double = js.native
  /* 4 */ val portraitFlipped: portraitFlipped with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation with scala.Double
  ] = js.native
}

