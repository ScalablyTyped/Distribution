package typings.winrtDashUwp.Windows.UI.Text

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
  sealed trait italic extends FontStyle
  
  /** Represents a normal font style. */
  @js.native
  sealed trait normal extends FontStyle
  
  /** Represents an oblique font style. */
  @js.native
  sealed trait oblique extends FontStyle
  
  /* 2 */ val italic: typings.winrtDashUwp.Windows.UI.Text.FontStyle.italic with Double = js.native
  /* 0 */ val normal: typings.winrtDashUwp.Windows.UI.Text.FontStyle.normal with Double = js.native
  /* 1 */ val oblique: typings.winrtDashUwp.Windows.UI.Text.FontStyle.oblique with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
}

