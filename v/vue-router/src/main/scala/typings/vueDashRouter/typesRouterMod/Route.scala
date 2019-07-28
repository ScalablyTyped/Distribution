package typings.vueDashRouter.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var fullPath: String
  var hash: String
  var matched: js.Array[RouteRecord]
  var meta: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var params: Dictionary[String]
  var path: String
  var query: Dictionary[String | (js.Array[String | Null])]
  var redirectedFrom: js.UndefOr[String] = js.undefined
}

object Route {
  @scala.inline
  def apply(
    fullPath: String,
    hash: String,
    matched: js.Array[RouteRecord],
    params: Dictionary[String],
    path: String,
    query: Dictionary[String | (js.Array[String | Null])],
    meta: js.Any = null,
    name: String = null,
    redirectedFrom: String = null
  ): Route = {
    val __obj = js.Dynamic.literal(fullPath = fullPath, hash = hash, matched = matched, params = params, path = path, query = query)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (name != null) __obj.updateDynamic("name")(name)
    if (redirectedFrom != null) __obj.updateDynamic("redirectedFrom")(redirectedFrom)
    __obj.asInstanceOf[Route]
  }
}

