package typings
package vueDashRouterLib.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var fullPath: java.lang.String
  var hash: java.lang.String
  var matched: js.Array[RouteRecord]
  var meta: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var params: Dictionary[java.lang.String]
  var path: java.lang.String
  var query: Dictionary[java.lang.String | js.Array[java.lang.String]]
  var redirectedFrom: js.UndefOr[java.lang.String] = js.undefined
}

object Route {
  @scala.inline
  def apply(
    fullPath: java.lang.String,
    hash: java.lang.String,
    matched: js.Array[RouteRecord],
    params: Dictionary[java.lang.String],
    path: java.lang.String,
    query: Dictionary[java.lang.String | js.Array[java.lang.String]],
    meta: js.Any = null,
    name: java.lang.String = null,
    redirectedFrom: java.lang.String = null
  ): Route = {
    val __obj = js.Dynamic.literal(fullPath = fullPath, hash = hash, matched = matched, params = params, path = path, query = query)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (name != null) __obj.updateDynamic("name")(name)
    if (redirectedFrom != null) __obj.updateDynamic("redirectedFrom")(redirectedFrom)
    __obj.asInstanceOf[Route]
  }
}

