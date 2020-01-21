package typings.wordpressData

import typings.wordpressData.mod.SelectorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var select: js.Function1[/* key */ String, SelectorMap]
}

object AnonKey {
  @scala.inline
  def apply(select: /* key */ String => SelectorMap): AnonKey = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[AnonKey]
  }
}

