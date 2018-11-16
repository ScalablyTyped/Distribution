package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintDuplex extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintDuplex")
@js.native
object PrintDuplex extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  @js.native
  sealed trait notAvailable
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  @js.native
  sealed trait oneSided
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  @js.native
  sealed trait printerCustom
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  @js.native
  sealed trait twoSidedLongEdge
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  @js.native
  sealed trait twoSidedShortEdge
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  val default: default with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val oneSided: oneSided with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  val twoSidedLongEdge: twoSidedLongEdge with java.lang.String = js.native
  val twoSidedShortEdge: twoSidedShortEdge with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex with java.lang.String] = js.native
}

