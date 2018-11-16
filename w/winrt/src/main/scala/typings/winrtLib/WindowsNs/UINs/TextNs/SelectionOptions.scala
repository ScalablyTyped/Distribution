package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionOptions extends js.Object

@JSGlobal("Windows.UI.Text.SelectionOptions")
@js.native
object SelectionOptions extends js.Object {
  @js.native
  sealed trait active
    extends winrtLib.WindowsNs.UINs.TextNs.SelectionOptions
  
  @js.native
  sealed trait atEndOfLine
    extends winrtLib.WindowsNs.UINs.TextNs.SelectionOptions
  
  @js.native
  sealed trait overtype
    extends winrtLib.WindowsNs.UINs.TextNs.SelectionOptions
  
  @js.native
  sealed trait replace
    extends winrtLib.WindowsNs.UINs.TextNs.SelectionOptions
  
  @js.native
  sealed trait startActive
    extends winrtLib.WindowsNs.UINs.TextNs.SelectionOptions
  
  val active: active with java.lang.String = js.native
  val atEndOfLine: atEndOfLine with java.lang.String = js.native
  val overtype: overtype with java.lang.String = js.native
  val replace: replace with java.lang.String = js.native
  val startActive: startActive with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.SelectionOptions with java.lang.String] = js.native
}

