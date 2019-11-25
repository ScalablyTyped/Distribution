package typings.vueDashRouter.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var append: js.UndefOr[Boolean] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[Dictionary[String]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[Dictionary[js.UndefOr[String | (js.Array[String | Null]) | Null]]] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    append: js.UndefOr[Boolean] = js.undefined,
    hash: String = null,
    name: String = null,
    params: Dictionary[String] = null,
    path: String = null,
    query: Dictionary[js.UndefOr[String | (js.Array[String | Null]) | Null]] = null,
    replace: js.UndefOr[Boolean] = js.undefined
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

