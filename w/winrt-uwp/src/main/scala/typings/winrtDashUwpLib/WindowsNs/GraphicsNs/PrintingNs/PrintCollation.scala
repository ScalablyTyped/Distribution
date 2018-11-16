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
  
  val collated: collated with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  val uncollated: uncollated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation with java.lang.String
  ] = js.native
}

