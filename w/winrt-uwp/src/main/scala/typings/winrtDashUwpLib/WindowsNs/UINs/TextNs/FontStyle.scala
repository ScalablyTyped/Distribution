package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

/** Represents the style of a font face (for example, normal or italic). */
@JSGlobal("Windows.UI.Text.FontStyle")
@js.native
object FontStyle extends js.Object {
  /** Represents an italic font style. */
  @js.native
  sealed trait italic
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStyle
  
  /** Represents a normal font style. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStyle
  
  /** Represents an oblique font style. */
  @js.native
  sealed trait oblique
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStyle
  
  val italic: italic with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val oblique: oblique with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStyle with java.lang.String] = js.native
}

