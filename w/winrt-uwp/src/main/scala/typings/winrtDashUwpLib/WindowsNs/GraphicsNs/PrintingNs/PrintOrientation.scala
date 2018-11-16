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
  
  val default: default with java.lang.String = js.native
  val landscape: landscape with java.lang.String = js.native
  val landscapeFlipped: landscapeFlipped with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val portrait: portrait with java.lang.String = js.native
  val portraitFlipped: portraitFlipped with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation with java.lang.String
  ] = js.native
}

