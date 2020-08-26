package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expire extends js.Object {
  var expire: js.UndefOr[Double] = js.native
  var forceAccount: js.UndefOr[Boolean] = js.native
  var immutable: js.UndefOr[Boolean] = js.native
  var multisign: js.UndefOr[Boolean] = js.native
  var return_url: js.UndefOr[App] = js.native
  var submit: js.UndefOr[Boolean] = js.native
}

object Expire {
  @scala.inline
  def apply(): Expire = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expire]
  }
  @scala.inline
  implicit class ExpireOps[Self <: Expire] (val x: Self) extends AnyVal {
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
    def setExpire(value: Double): Self = this.set("expire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpire: Self = this.set("expire", js.undefined)
    @scala.inline
    def setForceAccount(value: Boolean): Self = this.set("forceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceAccount: Self = this.set("forceAccount", js.undefined)
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    @scala.inline
    def setMultisign(value: Boolean): Self = this.set("multisign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultisign: Self = this.set("multisign", js.undefined)
    @scala.inline
    def setReturn_url(value: App): Self = this.set("return_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_url: Self = this.set("return_url", js.undefined)
    @scala.inline
    def setSubmit(value: Boolean): Self = this.set("submit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
  }
  
}

