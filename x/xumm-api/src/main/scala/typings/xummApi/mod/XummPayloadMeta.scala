package typings.xummApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummPayloadMeta extends js.Object {
  var app_opened: Boolean
  var cancelled: Boolean
  var destination: String
  var exists: Boolean
  var expired: Boolean
  var multisign: Boolean
  var pushed: Boolean
  var resolved: Boolean
  var resolved_destination: String
  var return_url_app: String | Null
  var return_url_web: String | Null
  var signed: Boolean
  var submit: Boolean
  var uuid: String
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
    uuid: String,
    return_url_app: String = null,
    return_url_web: String = null
  ): XummPayloadMeta = {
    val __obj = js.Dynamic.literal(app_opened = app_opened.asInstanceOf[js.Any], cancelled = cancelled.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], multisign = multisign.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], resolved_destination = resolved_destination.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (return_url_app != null) __obj.updateDynamic("return_url_app")(return_url_app.asInstanceOf[js.Any])
    if (return_url_web != null) __obj.updateDynamic("return_url_web")(return_url_web.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPayloadMeta]
  }
}

