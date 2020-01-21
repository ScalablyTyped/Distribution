package typings.wpapi.mod

import typings.wpapi.AnonSelf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var _links: js.UndefOr[AnonSelf] = js.undefined
  var endpoints: js.Array[HTTPEndpoint]
  var methods: js.Array[HTTPMethod]
  var namespace: String
}

object Route {
  @scala.inline
  def apply(
    endpoints: js.Array[HTTPEndpoint],
    methods: js.Array[HTTPMethod],
    namespace: String,
    _links: AnonSelf = null
  ): Route = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    if (_links != null) __obj.updateDynamic("_links")(_links.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

