package typings.xhr2DashCookies.distXmlDashHttpDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLHttpRequestOptions extends js.Object {
  var anon: js.UndefOr[Boolean] = js.undefined
}

object XMLHttpRequestOptions {
  @scala.inline
  def apply(anon: js.UndefOr[Boolean] = js.undefined): XMLHttpRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anon)) __obj.updateDynamic("anon")(anon.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestOptions]
  }
}

