package typings.wordpressBlockEditor.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClick extends js.Object {
  var onClick: MouseEventHandler[HTMLButtonElement]
  var title: ReactNode
}

object OnClick {
  @scala.inline
  def apply(onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit, title: ReactNode = null): OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClick]
  }
}

