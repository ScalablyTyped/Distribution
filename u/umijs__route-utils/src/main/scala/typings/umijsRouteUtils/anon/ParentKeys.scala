package typings.umijsRouteUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentKeys extends js.Object {
  var children: js.Array[Name]
  var icon: Key
  var key: String
  var locale: String
  var name: String
  var parentKeys: js.Array[String]
  var path: String
  var routes: Null
}

object ParentKeys {
  @scala.inline
  def apply(
    children: js.Array[Name],
    icon: Key,
    key: String,
    locale: String,
    name: String,
    parentKeys: js.Array[String],
    path: String,
    routes: Null
  ): ParentKeys = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentKeys = parentKeys.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentKeys]
  }
}

