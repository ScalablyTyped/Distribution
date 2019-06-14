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
  
  /* 2 */ val italic: italic with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 1 */ val oblique: oblique with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.FontStyle with scala.Double] = js.native
}

