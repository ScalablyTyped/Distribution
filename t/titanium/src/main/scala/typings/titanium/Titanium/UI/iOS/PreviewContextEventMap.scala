package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewContextEventMap extends ProxyEventMap {
  var peek: PreviewContextPeekEvent = js.native
  var pop: PreviewContextPopEvent = js.native
}

object PreviewContextEventMap {
  @scala.inline
  def apply(peek: PreviewContextPeekEvent, pop: PreviewContextPopEvent): PreviewContextEventMap = {
    val __obj = js.Dynamic.literal(peek = peek.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewContextEventMap]
  }
  @scala.inline
  implicit class PreviewContextEventMapOps[Self <: PreviewContextEventMap] (val x: Self) extends AnyVal {
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
    def setPeek(value: PreviewContextPeekEvent): Self = this.set("peek", value.asInstanceOf[js.Any])
    @scala.inline
    def setPop(value: PreviewContextPopEvent): Self = this.set("pop", value.asInstanceOf[js.Any])
  }
  
}

