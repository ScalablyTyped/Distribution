package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpStack extends js.Object {
  def createRequest(method: String, url: String): HttpRequest = js.native
  def getName(): String = js.native
}

object HttpStack {
  @scala.inline
  def apply(createRequest: (String, String) => HttpRequest, getName: () => String): HttpStack = {
    val __obj = js.Dynamic.literal(createRequest = js.Any.fromFunction2(createRequest), getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[HttpStack]
  }
  @scala.inline
  implicit class HttpStackOps[Self <: HttpStack] (val x: Self) extends AnyVal {
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
    def setCreateRequest(value: (String, String) => HttpRequest): Self = this.set("createRequest", js.Any.fromFunction2(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
  }
  
}

