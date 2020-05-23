package typings.umijsRouteUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var exact: Boolean
  var icon: Key
  var key: String
  var locale: String
  var name: String
  var parentKeys: js.Array[String]
  var path: String
  var routes: Null
}

object Icon {
  @scala.inline
  def apply(
    exact: Boolean,
    icon: Key,
    key: String,
    locale: String,
    name: String,
    parentKeys: js.Array[String],
    path: String,
    routes: Null
  ): Icon = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentKeys = parentKeys.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

