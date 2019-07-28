package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs

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
  sealed trait collated extends PrintCollation
  
  /** The default collation option. */
  @js.native
  sealed trait default extends PrintCollation
  
  /** An unsupported collation option. */
  @js.native
  sealed trait notAvailable extends PrintCollation
  
  /** A custom collation option that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintCollation
  
  /** An option to specify that collation has not been selected for the printed output. */
  @js.native
  sealed trait uncollated extends PrintCollation
  
  /* 3 */ val collated: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintCollation.collated with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintCollation.default with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintCollation.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintCollation.printerCustom with Double = js.native
  /* 4 */ val uncollated: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintCollation.uncollated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintCollation with Double] = js.native
}

