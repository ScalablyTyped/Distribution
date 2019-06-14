package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintCollation extends js.Object

/** Specifies the collation option. */
@JSGlobal("Windows.Graphics.Printing.PrintCollation")
@js.native
object PrintCollation extends js.Object {
  /** An option to specify that collation has been selected for the printed output. */
  @js.native
  sealed trait collated
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation
  
  /** The default collation option. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation
  
  /** An unsupported collation option. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation
  
  /** A custom collation option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation
  
  /** An option to specify that collation has not been selected for the printed output. */
  @js.native
  sealed trait uncollated
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation
  
  /* 3 */ val collated: collated with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  /* 4 */ val uncollated: uncollated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation with scala.Double] = js.native
}

