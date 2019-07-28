package typings.atWordpressData

import typings.atWordpressData.atWordpressDataMod.SelectorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var select: js.Function1[/* key */ String, SelectorMap]
}

object Anon_Key {
  @scala.inline
  def apply(select: /* key */ String => SelectorMap): Anon_Key = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[Anon_Key]
  }
}

