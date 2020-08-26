package typings.winrt.Windows.UI.ViewManagement

import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUISettings extends js.Object {
  var animationsEnabled: Boolean = js.native
  var caretBlinkRate: Double = js.native
  var caretBrowsingEnabled: Boolean = js.native
  var caretWidth: Double = js.native
  var cursorSize: Size = js.native
  var doubleClickTime: Double = js.native
  var handPreference: HandPreference = js.native
  var messageDuration: Double = js.native
  var mouseHoverTime: Double = js.native
  var scrollBarArrowSize: Size = js.native
  var scrollBarSize: Size = js.native
  var scrollBarThumbBoxSize: Size = js.native
  def uIElementColor(desiredElement: UIElementType): Color = js.native
}

object IUISettings {
  @scala.inline
  def apply(
    animationsEnabled: Boolean,
    caretBlinkRate: Double,
    caretBrowsingEnabled: Boolean,
    caretWidth: Double,
    cursorSize: Size,
    doubleClickTime: Double,
    handPreference: HandPreference,
    messageDuration: Double,
    mouseHoverTime: Double,
    scrollBarArrowSize: Size,
    scrollBarSize: Size,
    scrollBarThumbBoxSize: Size,
    uIElementColor: UIElementType => Color
  ): IUISettings = {
    val __obj = js.Dynamic.literal(animationsEnabled = animationsEnabled.asInstanceOf[js.Any], caretBlinkRate = caretBlinkRate.asInstanceOf[js.Any], caretBrowsingEnabled = caretBrowsingEnabled.asInstanceOf[js.Any], caretWidth = caretWidth.asInstanceOf[js.Any], cursorSize = cursorSize.asInstanceOf[js.Any], doubleClickTime = doubleClickTime.asInstanceOf[js.Any], handPreference = handPreference.asInstanceOf[js.Any], messageDuration = messageDuration.asInstanceOf[js.Any], mouseHoverTime = mouseHoverTime.asInstanceOf[js.Any], scrollBarArrowSize = scrollBarArrowSize.asInstanceOf[js.Any], scrollBarSize = scrollBarSize.asInstanceOf[js.Any], scrollBarThumbBoxSize = scrollBarThumbBoxSize.asInstanceOf[js.Any], uIElementColor = js.Any.fromFunction1(uIElementColor))
    __obj.asInstanceOf[IUISettings]
  }
  @scala.inline
  implicit class IUISettingsOps[Self <: IUISettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationsEnabled(value: Boolean): Self = this.set("animationsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaretBlinkRate(value: Double): Self = this.set("caretBlinkRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaretBrowsingEnabled(value: Boolean): Self = this.set("caretBrowsingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaretWidth(value: Double): Self = this.set("caretWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorSize(value: Size): Self = this.set("cursorSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubleClickTime(value: Double): Self = this.set("doubleClickTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandPreference(value: HandPreference): Self = this.set("handPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageDuration(value: Double): Self = this.set("messageDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseHoverTime(value: Double): Self = this.set("mouseHoverTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollBarArrowSize(value: Size): Self = this.set("scrollBarArrowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollBarSize(value: Size): Self = this.set("scrollBarSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollBarThumbBoxSize(value: Size): Self = this.set("scrollBarThumbBoxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setUIElementColor(value: UIElementType => Color): Self = this.set("uIElementColor", js.Any.fromFunction1(value))
  }
  
}

