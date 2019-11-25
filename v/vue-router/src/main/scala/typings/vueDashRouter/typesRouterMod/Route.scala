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
    val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (redirectedFrom != null) __obj.updateDynamic("redirectedFrom")(redirectedFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

