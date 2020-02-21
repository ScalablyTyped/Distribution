package typings.web3CoreHelpers.mod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpAgent extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var http: js.UndefOr[Agent] = js.undefined
  var https: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
}

object HttpAgent {
  @scala.inline
  def apply(baseUrl: String = null, http: Agent = null, https: typings.node.httpsMod.Agent = null): HttpAgent = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAgent]
  }
}

