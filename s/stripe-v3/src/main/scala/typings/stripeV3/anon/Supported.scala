package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Supported extends js.Object {
  var supported: js.UndefOr[Boolean] = js.native
}

object Supported {
  @scala.inline
  def apply(): Supported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Supported]
  }
  @scala.inline
  implicit class SupportedOps[Self <: Supported] (val x: Self) extends AnyVal {
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
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupported: Self = this.set("supported", js.undefined)
  }
  
}

