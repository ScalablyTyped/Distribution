package typings.xhr2DashCookies

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var httpAgent: js.UndefOr[Agent] = js.undefined
  var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
}

object Anon_BaseUrl {
  @scala.inline
  def apply(baseUrl: String = null, httpAgent: Agent = null, httpsAgent: typings.node.httpsMod.Agent = null): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent)
    if (httpsAgent != null) __obj.updateDynamic("httpsAgent")(httpsAgent)
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

