package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequestOptions extends js.Object {
  var form: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object ClientRequestOptions {
  @scala.inline
  def apply(url: java.lang.String, form: js.Any = null, method: java.lang.String = null): ClientRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (form != null) __obj.updateDynamic("form")(form)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[ClientRequestOptions]
  }
}

