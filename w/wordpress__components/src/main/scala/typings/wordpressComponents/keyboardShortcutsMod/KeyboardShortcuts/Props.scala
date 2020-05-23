package typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts

import typings.react.mod.ReactNode
import typings.std.Record
import typings.wordpressComponents.wordpressComponentsBooleans.`true`
import typings.wordpressComponents.wordpressComponentsStrings.keydown
import typings.wordpressComponents.wordpressComponentsStrings.keypress
import typings.wordpressComponents.wordpressComponentsStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithChildren
  - typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithoutChildren
*/
trait Props extends js.Object

object Props {
  @scala.inline
  def PropsWithChildren(
    shortcuts: Record[String, js.Function0[Unit]],
    bindGlobal: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    eventName: keydown | keypress | keyup = null
  ): Props = {
    val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(bindGlobal)) __obj.updateDynamic("bindGlobal")(bindGlobal.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def PropsWithoutChildren(
    bindGlobal: `true`,
    shortcuts: Record[String, js.Function0[Unit]],
    eventName: keydown | keypress | keyup = null
  ): Props = {
    val __obj = js.Dynamic.literal(bindGlobal = bindGlobal.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

