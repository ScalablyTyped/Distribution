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
  
  /* 3 */ val active: active with scala.Double = js.native
  /* 1 */ val atEndOfLine: atEndOfLine with scala.Double = js.native
  /* 2 */ val overtype: overtype with scala.Double = js.native
  /* 4 */ val replace: replace with scala.Double = js.native
  /* 0 */ val startActive: startActive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.SelectionOptions with scala.Double] = js.native
}

