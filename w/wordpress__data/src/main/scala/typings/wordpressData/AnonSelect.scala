package typings.wordpressData

import typings.wordpressData.mod.SelectorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelect extends js.Object {
  var select: js.Function1[/* key */ String, SelectorMap]
}

object AnonSelect {
  @scala.inline
  def apply(select: /* key */ String => SelectorMap): AnonSelect = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[AnonSelect]
  }
}

