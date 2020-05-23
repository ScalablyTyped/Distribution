package typings.umijsRouteUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var children: js.Array[ParentKeys]
  var exact: js.UndefOr[scala.Nothing] = js.undefined
  var icon: Key
  var key: String
  var locale: String
  var name: String
  var parentKeys: js.Array[String]
  var path: String
  var routes: Null
  var target: js.UndefOr[scala.Nothing] = js.undefined
}

object Path {
  @scala.inline
  def apply(
    children: js.Array[ParentKeys],
    icon: Key,
    key: String,
    locale: String,
    name: String,
    parentKeys: js.Array[String],
    path: String,
    routes: Null
  ): Path = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentKeys = parentKeys.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

