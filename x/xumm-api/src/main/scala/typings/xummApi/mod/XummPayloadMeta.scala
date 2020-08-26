package typings.xummApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummPayloadMeta extends js.Object {
  var app_opened: Boolean = js.native
  var cancelled: Boolean = js.native
  var destination: String = js.native
  var exists: Boolean = js.native
  var expired: Boolean = js.native
  var forceAccount: js.UndefOr[Boolean] = js.native
  var immutable: js.UndefOr[Boolean] = js.native
  var multisign: Boolean = js.native
  var pushed: Boolean = js.native
  var resolved: Boolean = js.native
  var resolved_destination: String = js.native
  var return_url_app: String | Null = js.native
  var return_url_web: String | Null = js.native
  var signed: Boolean = js.native
  var submit: Boolean = js.native
  var uuid: String = js.native
}

object XummPayloadMeta {
  @scala.inline
  def apply(
    app_opened: Boolean,
    cancelled: Boolean,
    destination: String,
    exists: Boolean,
    expired: Boolean,
    multisign: Boolean,
    pushed: Boolean,
    resolved: Boolean,
    resolved_destination: String,
    signed: Boolean,
    submit: Boolean,
    uuid: String
  ): XummPayloadMeta = {
    val __obj = js.Dynamic.literal(app_opened = app_opened.asInstanceOf[js.Any], cancelled = cancelled.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], multisign = multisign.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], resolved_destination = resolved_destination.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPayloadMeta]
  }
  @scala.inline
  implicit class XummPayloadMetaOps[Self <: XummPayloadMeta] (val x: Self) extends AnyVal {
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
    def setApp_opened(value: Boolean): Self = this.set("app_opened", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setExists(value: Boolean): Self = this.set("exists", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpired(value: Boolean): Self = this.set("expired", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultisign(value: Boolean): Self = this.set("multisign", value.asInstanceOf[js.Any])
    @scala.inline
    def setPushed(value: Boolean): Self = this.set("pushed", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolved(value: Boolean): Self = this.set("resolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolved_destination(value: String): Self = this.set("resolved_destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubmit(value: Boolean): Self = this.set("submit", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceAccount(value: Boolean): Self = this.set("forceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceAccount: Self = this.set("forceAccount", js.undefined)
    @scala.inline
    def setImmutable(value: Boolean): Self = this.set("immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmutable: Self = this.set("immutable", js.undefined)
    @scala.inline
    def setReturn_url_app(value: String): Self = this.set("return_url_app", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturn_url_appNull: Self = this.set("return_url_app", null)
    @scala.inline
    def setReturn_url_web(value: String): Self = this.set("return_url_web", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturn_url_webNull: Self = this.set("return_url_web", null)
  }
  
}

