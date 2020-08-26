package typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts

import typings.std.Record
import typings.wordpressComponents.wordpressComponentsStrings.keydown
import typings.wordpressComponents.wordpressComponentsStrings.keypress
import typings.wordpressComponents.wordpressComponentsStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProps extends js.Object {
  /**
    * By default, a callback will not be invoked if the key combination
    * occurs in an editable field. Pass `bindGlobal` as `true` if the key
    * events should be observed globally, including within editable fields.
    */
  var bindGlobal: js.UndefOr[Boolean] = js.native
  /**
    * By default, a callback is invoked in response to the `keydown` event.
    * To override this, pass `eventName` with the name of a specific keyboard
    * event.
    */
  var eventName: js.UndefOr[keydown | keypress | keyup] = js.native
  /**
    * An object of shortcut bindings, where each key is a keyboard
    * combination, the value of which is the callback to be invoked when
    * the key combination is pressed.
    *
    * NOTE: The value of each shortcut should be a consistent function
    * reference, not an anonymous function. Otherwise, the callback will
    * not be correctly unbound when the component unmounts.
    *
    * NOTE: The `KeyboardShortcuts` component will not update to reflect a
    * changed `shortcuts` prop. If you need to change shortcuts, mount a
    * separate `KeyboardShortcuts` element, which can be achieved by
    * assigning a unique `key` prop.
    */
  var shortcuts: Record[String, js.Function0[Unit]] = js.native
}

object BaseProps {
  @scala.inline
  def apply(shortcuts: Record[String, js.Function0[Unit]]): BaseProps = {
    val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
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
    def setShortcuts(value: Record[String, js.Function0[Unit]]): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindGlobal(value: Boolean): Self = this.set("bindGlobal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindGlobal: Self = this.set("bindGlobal", js.undefined)
    @scala.inline
    def setEventName(value: keydown | keypress | keyup): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
  }
  
}

