package typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts

import typings.std.Record
import typings.wordpressComponents.wordpressComponentsBooleans.`true`
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
  def PropsWithChildren(shortcuts: Record[String, js.Function0[Unit]]): Props = {
    val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def PropsWithoutChildren(bindGlobal: `true`, shortcuts: Record[String, js.Function0[Unit]]): Props = {
    val __obj = js.Dynamic.literal(bindGlobal = bindGlobal.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

