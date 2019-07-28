package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs

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
  sealed trait bottomEdge extends PrintHolePunch
  
  /** The default hole punch option. */
  @js.native
  sealed trait default extends PrintHolePunch
  
  /** The option to indicate that hole punching required along the left edges of the sheets. */
  @js.native
  sealed trait leftEdge extends PrintHolePunch
  
  /** The option to indicate that hole punching is not required. */
  @js.native
  sealed trait none extends PrintHolePunch
  
  /** An unsupported hole punch option. */
  @js.native
  sealed trait notAvailable extends PrintHolePunch
  
  /** A custom hole punch option that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintHolePunch
  
  /** The option to indicate that hole punching required along the right edges of the sheets. */
  @js.native
  sealed trait rightEdge extends PrintHolePunch
  
  /** The option to indicate that hole punching required along the top edges of the sheets. */
  @js.native
  sealed trait topEdge extends PrintHolePunch
  
  /* 7 */ val bottomEdge: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.bottomEdge with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.default with Double = js.native
  /* 4 */ val leftEdge: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.leftEdge with Double = js.native
  /* 3 */ val none: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.none with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.printerCustom with Double = js.native
  /* 5 */ val rightEdge: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.rightEdge with Double = js.native
  /* 6 */ val topEdge: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.topEdge with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintHolePunch with Double] = js.native
}

