package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOrientation extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintOrientation")
@js.native
object PrintOrientation extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait landscape
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait landscapeFlipped
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait notAvailable
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait portrait
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait portraitFlipped
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  @js.native
  sealed trait printerCustom
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation
  
  val default: default with java.lang.String = js.native
  val landscape: landscape with java.lang.String = js.native
  val landscapeFlipped: landscapeFlipped with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val portrait: portrait with java.lang.String = js.native
  val portraitFlipped: portraitFlipped with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation with java.lang.String] = js.native
}

