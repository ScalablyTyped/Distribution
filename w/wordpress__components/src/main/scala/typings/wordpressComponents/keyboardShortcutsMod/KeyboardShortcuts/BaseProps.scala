package typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts

import typings.std.Record
import typings.wordpressComponents.wordpressComponentsStrings.keydown
import typings.wordpressComponents.wordpressComponentsStrings.keypress
import typings.wordpressComponents.wordpressComponentsStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  /**
    * By default, a callback will not be invoked if the key combination
    * occurs in an editable field. Pass `bindGlobal` as `true` if the key
    * events should be observed globally, including within editable fields.
    */
  var bindGlobal: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, a callback is invoked in response to the `keydown` event.
    * To override this, pass `eventName` with the name of a specific keyboard
    * event.
    */
  var eventName: js.UndefOr[keydown | keypress | keyup] = js.undefined
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
  var shortcuts: Record[String, js.Function0[Unit]]
}

object BaseProps {
  @scala.inline
  def apply(
    shortcuts: Record[String, js.Function0[Unit]],
    bindGlobal: js.UndefOr[Boolean] = js.undefined,
    eventName: keydown | keypress | keyup = null
  ): BaseProps = {
    val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(bindGlobal)) __obj.updateDynamic("bindGlobal")(bindGlobal.get.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

