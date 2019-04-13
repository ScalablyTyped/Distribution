package typings
package wpapiLib.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var _links: js.UndefOr[wpapiLib.Anon_Self] = js.undefined
  var endpoints: js.Array[HTTPEndpoint]
  var methods: js.Array[HTTPMethod]
  var namespace: java.lang.String
}

object Route {
  @scala.inline
  def apply(
    endpoints: js.Array[HTTPEndpoint],
    methods: js.Array[HTTPMethod],
    namespace: java.lang.String,
    _links: wpapiLib.Anon_Self = null
  ): Route = {
    val __obj = js.Dynamic.literal(endpoints = endpoints, methods = methods, namespace = namespace)
    if (_links != null) __obj.updateDynamic("_links")(_links)
    __obj.asInstanceOf[Route]
  }
}

