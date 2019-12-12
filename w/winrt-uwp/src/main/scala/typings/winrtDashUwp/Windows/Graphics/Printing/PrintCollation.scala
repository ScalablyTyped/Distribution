package typings.winrtDashUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintCollation.collated
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintCollation.default
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintCollation.notAvailable
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintCollation.printerCustom
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintCollation.uncollated
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintCollation with Double] = js.native
  /* 3 */ @js.native
  object collated extends TopLevel[collated with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
  /* 4 */ @js.native
  object uncollated extends TopLevel[uncollated with Double]
  
}

