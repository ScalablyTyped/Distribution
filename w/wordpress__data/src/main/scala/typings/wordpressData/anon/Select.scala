package typings.wordpressData.anon

import typings.wordpressData.mod.SelectorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select extends js.Object {
  var select: js.Function1[/* key */ String, SelectorMap] = js.native
}

object Select {
  @scala.inline
  def apply(select: /* key */ String => SelectorMap): Select = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[Select]
  }
  @scala.inline
  implicit class SelectOps[Self <: Select] (val x: Self) extends AnyVal {
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
    def setSelect(value: /* key */ String => SelectorMap): Self = this.set("select", js.Any.fromFunction1(value))
  }
  
}

