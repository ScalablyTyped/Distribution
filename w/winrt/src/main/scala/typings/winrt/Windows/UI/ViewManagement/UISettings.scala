package typings.winrt.Windows.UI.ViewManagement

import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ViewManagement.UISettings")
@js.native
class UISettings () extends IUISettings {
  /* CompleteClass */
  override var animationsEnabled: Boolean = js.native
  /* CompleteClass */
  override var caretBlinkRate: Double = js.native
  /* CompleteClass */
  override var caretBrowsingEnabled: Boolean = js.native
  /* CompleteClass */
  override var caretWidth: Double = js.native
  /* CompleteClass */
  override var cursorSize: Size = js.native
  /* CompleteClass */
  override var doubleClickTime: Double = js.native
  /* CompleteClass */
  override var handPreference: HandPreference = js.native
  /* CompleteClass */
  override var messageDuration: Double = js.native
  /* CompleteClass */
  override var mouseHoverTime: Double = js.native
  /* CompleteClass */
  override var scrollBarArrowSize: Size = js.native
  /* CompleteClass */
  override var scrollBarSize: Size = js.native
  /* CompleteClass */
  override var scrollBarThumbBoxSize: Size = js.native
  /* CompleteClass */
  override def uIElementColor(desiredElement: UIElementType): Color = js.native
}

