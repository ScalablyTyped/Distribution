package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeGravity extends js.Object

@JSGlobal("Windows.UI.Text.RangeGravity")
@js.native
object RangeGravity extends js.Object {
  @js.native
  sealed trait backward
    extends winrtLib.WindowsNs.UINs.TextNs.RangeGravity
  
  @js.native
  sealed trait forward
    extends winrtLib.WindowsNs.UINs.TextNs.RangeGravity
  
  @js.native
  sealed trait inward
    extends winrtLib.WindowsNs.UINs.TextNs.RangeGravity
  
  @js.native
  sealed trait outward
    extends winrtLib.WindowsNs.UINs.TextNs.RangeGravity
  
  @js.native
  sealed trait uIBehavior
    extends winrtLib.WindowsNs.UINs.TextNs.RangeGravity
  
  val backward: backward with java.lang.String = js.native
  val forward: forward with java.lang.String = js.native
  val inward: inward with java.lang.String = js.native
  val outward: outward with java.lang.String = js.native
  val uIBehavior: uIBehavior with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.RangeGravity with java.lang.String] = js.native
}

