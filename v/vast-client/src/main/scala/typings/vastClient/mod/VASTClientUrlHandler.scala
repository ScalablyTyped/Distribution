package typings.vastClient.mod

import typings.vastClient.anon.FnCall
import typings.vastClient.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VASTClientUrlHandler extends js.Object {
  def get(url: String, options: Timeout, cb: FnCall): Unit = js.native
}

object VASTClientUrlHandler {
  @scala.inline
  def apply(get: (String, Timeout, FnCall) => Unit): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
  @scala.inline
  implicit class VASTClientUrlHandlerOps[Self <: VASTClientUrlHandler] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, Timeout, FnCall) => Unit): Self = this.set("get", js.Any.fromFunction3(value))
  }
  
}

