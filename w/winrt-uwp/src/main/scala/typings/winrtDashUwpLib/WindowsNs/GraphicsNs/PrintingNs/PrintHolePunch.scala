package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintHolePunch extends js.Object

/** Specifies the hole punch option. */
@JSGlobal("Windows.Graphics.Printing.PrintHolePunch")
@js.native
object PrintHolePunch extends js.Object {
  /** The option to indicate that hole punching required along the bottom edges of the sheets. */
  @js.native
  sealed trait bottomEdge
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  /** The default hole punch option. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  /** The option to indicate that hole punching required along the left edges of the sheets. */
  @js.native
  sealed trait leftEdge
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  /** The option to indicate that hole punching is not required. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  /** An unsupported hole punch option. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  /** A custom hole punch option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  /** The option to indicate that hole punching required along the right edges of the sheets. */
  @js.native
  sealed trait rightEdge
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  /** The option to indicate that hole punching required along the top edges of the sheets. */
  @js.native
  sealed trait topEdge
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  /* 7 */ val bottomEdge: bottomEdge with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 4 */ val leftEdge: leftEdge with scala.Double = js.native
  /* 3 */ val none: none with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  /* 5 */ val rightEdge: rightEdge with scala.Double = js.native
  /* 6 */ val topEdge: topEdge with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch with scala.Double] = js.native
}

