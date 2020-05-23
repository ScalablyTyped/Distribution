package typings.xhr2Cookies.anon

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var httpAgent: js.UndefOr[Agent] = js.undefined
  var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
}

object BaseUrl {
  @scala.inline
  def apply(baseUrl: String = null, httpAgent: Agent = null, httpsAgent: typings.node.httpsMod.Agent = null): BaseUrl = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent.asInstanceOf[js.Any])
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
}

