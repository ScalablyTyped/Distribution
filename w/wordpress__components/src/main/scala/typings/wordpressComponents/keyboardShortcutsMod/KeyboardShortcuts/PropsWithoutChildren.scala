package typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts

import typings.std.Record
import typings.wordpressComponents.wordpressComponentsBooleans.`true`
import typings.wordpressComponents.wordpressComponentsStrings.keydown
import typings.wordpressComponents.wordpressComponentsStrings.keypress
import typings.wordpressComponents.wordpressComponentsStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsWithoutChildren
  extends BaseProps
     with Props {
  @JSName("bindGlobal")
  var bindGlobal_PropsWithoutChildren: `true`
}

object PropsWithoutChildren {
  @scala.inline
  def apply(
    bindGlobal: `true`,
    shortcuts: Record[String, js.Function0[Unit]],
    eventName: keydown | keypress | keyup = null
  ): PropsWithoutChildren = {
    val __obj = js.Dynamic.literal(bindGlobal = bindGlobal.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithoutChildren]
  }
}

