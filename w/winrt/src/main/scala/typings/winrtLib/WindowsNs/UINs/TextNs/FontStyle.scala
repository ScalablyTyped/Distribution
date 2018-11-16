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
  
  val italic: italic with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val oblique: oblique with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.FontStyle with java.lang.String] = js.native
}

