package typings.winrtUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabAlignment extends js.Object

/** Alignment options for tab positions. */
@JSGlobal("Windows.UI.Text.TabAlignment")
@js.native
object TabAlignment extends js.Object {
  /** A vertical bar is positioned at the tab position. Text is not affected. Alignment bars on nearby lines at the same position form a continuous vertical line. */
  @js.native
  sealed trait bar extends TabAlignment
  
  /** Text is centered on the tab position. */
  @js.native
  sealed trait center extends TabAlignment
  
  /** The decimal point is set at the tab position. This is useful for aligning a column of decimal numbers. */
  @js.native
  sealed trait decimal extends TabAlignment
  
  /** Text is left justified from the tab position. This is the default. */
  @js.native
  sealed trait left extends TabAlignment
  
  /** Text is right justified from the tab position. */
  @js.native
  sealed trait right extends TabAlignment
  
}

