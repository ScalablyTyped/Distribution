package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Graphics.Printing.PrintCollation.collated
import typings.winrt.Windows.Graphics.Printing.PrintCollation.default
import typings.winrt.Windows.Graphics.Printing.PrintCollation.notAvailable
import typings.winrt.Windows.Graphics.Printing.PrintCollation.printerCustom
import typings.winrt.Windows.Graphics.Printing.PrintCollation.uncollated
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

