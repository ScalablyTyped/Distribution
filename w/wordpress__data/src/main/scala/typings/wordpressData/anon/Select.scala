package typings.wordpressData.anon

import typings.wordpressData.mod.SelectorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Select extends js.Object {
  var select: js.Function1[/* key */ String, SelectorMap]
}

object Select {
  @scala.inline
  def apply(select: /* key */ String => SelectorMap): Select = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[Select]
  }
}

