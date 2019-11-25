package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequestOptions extends js.Object {
  var form: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var url: String
}

object ClientRequestOptions {
  @scala.inline
  def apply(url: String, form: js.Any = null, method: String = null): ClientRequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequestOptions]
  }
}

