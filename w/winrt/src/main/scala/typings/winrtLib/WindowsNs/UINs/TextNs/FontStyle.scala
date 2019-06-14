package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("Windows.UI.Text.FontStyle")
@js.native
object FontStyle extends js.Object {
  @js.native
  sealed trait italic
    extends winrtLib.WindowsNs.UINs.TextNs.FontStyle
  
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.UINs.TextNs.FontStyle
  
  @js.native
  sealed trait oblique
    extends winrtLib.WindowsNs.UINs.TextNs.FontStyle
  
  /* 2 */ val italic: italic with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 1 */ val oblique: oblique with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.FontStyle with scala.Double] = js.native
}

