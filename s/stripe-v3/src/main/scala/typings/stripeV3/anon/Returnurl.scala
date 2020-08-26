package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Returnurl extends js.Object {
  var return_url: String = js.native
}

object Returnurl {
  @scala.inline
  def apply(return_url: String): Returnurl = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Returnurl]
  }
  @scala.inline
  implicit class ReturnurlOps[Self <: Returnurl] (val x: Self) extends AnyVal {
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
    def setReturn_url(value: String): Self = this.set("return_url", value.asInstanceOf[js.Any])
  }
  
}

