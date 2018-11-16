package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintCollation extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintCollation")
@js.native
object PrintCollation extends js.Object {
  @js.native
  sealed trait collated
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation
  
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation
  
  @js.native
  sealed trait notAvailable
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation
  
  @js.native
  sealed trait printerCustom
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation
  
  @js.native
  sealed trait uncollated
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation
  
  val collated: collated with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  val uncollated: uncollated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintCollation with java.lang.String] = js.native
}

