package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintCollation extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintCollation")
@js.native
object PrintCollation extends js.Object {
  @js.native
  sealed trait collated extends PrintCollation
  
  @js.native
  sealed trait default extends PrintCollation
  
  @js.native
  sealed trait notAvailable extends PrintCollation
  
  @js.native
  sealed trait printerCustom extends PrintCollation
  
  @js.native
  sealed trait uncollated extends PrintCollation
  
  /* 3 */ val collated: typings.winrt.Windows.Graphics.Printing.PrintCollation.collated with Double = js.native
  /* 0 */ val default: typings.winrt.Windows.Graphics.Printing.PrintCollation.default with Double = js.native
  /* 1 */ val notAvailable: typings.winrt.Windows.Graphics.Printing.PrintCollation.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrt.Windows.Graphics.Printing.PrintCollation.printerCustom with Double = js.native
  /* 4 */ val uncollated: typings.winrt.Windows.Graphics.Printing.PrintCollation.uncollated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintCollation with Double] = js.native
}

