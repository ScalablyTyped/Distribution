package typings.tgfancy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RatelimitingOptions extends js.Object {
  var maxBackoff: js.UndefOr[Double] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  @JSName("notify")
  var notify_FRatelimitingOptions: js.UndefOr[js.Function2[/* methodName */ String, /* repeated */ js.Any, Unit]] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object RatelimitingOptions {
  @scala.inline
  def apply(): RatelimitingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RatelimitingOptions]
  }
  @scala.inline
  implicit class RatelimitingOptionsOps[Self <: RatelimitingOptions] (val x: Self) extends AnyVal {
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
    def setMaxBackoff(value: Double): Self = this.set("maxBackoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBackoff: Self = this.set("maxBackoff", js.undefined)
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setNotify(value: (/* methodName */ String, /* repeated */ js.Any) => Unit): Self = this.set("notify", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

