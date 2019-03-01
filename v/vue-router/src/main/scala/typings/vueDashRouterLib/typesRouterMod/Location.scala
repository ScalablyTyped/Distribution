package typings
package vueDashRouterLib.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var append: js.UndefOr[scala.Boolean] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[Dictionary[java.lang.String]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[Dictionary[java.lang.String | js.Array[java.lang.String]]] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    append: js.UndefOr[scala.Boolean] = js.undefined,
    hash: java.lang.String = null,
    name: java.lang.String = null,
    params: Dictionary[java.lang.String] = null,
    path: java.lang.String = null,
    query: Dictionary[java.lang.String | js.Array[java.lang.String]] = null,
    replace: js.UndefOr[scala.Boolean] = js.undefined
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (name != null) __obj.updateDynamic("name")(name)
    if (params != null) __obj.updateDynamic("params")(params)
    if (path != null) __obj.updateDynamic("path")(path)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[Location]
  }
}

