package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOrientation extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintOrientation")
@js.native
object PrintOrientation extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait landscape
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait landscapeFlipped
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait notAvailable
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait portrait
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait portraitFlipped
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait printerCustom
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 5 */ val landscape: landscape with scala.Double = js.native
  /* 6 */ val landscapeFlipped: landscapeFlipped with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 3 */ val portrait: portrait with scala.Double = js.native
  /* 4 */ val portraitFlipped: portraitFlipped with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation with scala.Double] = js.native
}

