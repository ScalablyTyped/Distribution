package typings.umijsRouteUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProlayoutparentKeys extends js.Object {
  var children: js.Array[Path]
  var exact: js.UndefOr[scala.Nothing] = js.undefined
  var icon: Key
  var key: String
  var locale: String
  var name: String
  var path: String
  var pro_layout_parentKeys: js.Array[String]
  var routes: Null
  var target: js.UndefOr[scala.Nothing] = js.undefined
}

object ProlayoutparentKeys {
  @scala.inline
  def apply(
    children: js.Array[Path],
    icon: Key,
    key: String,
    locale: String,
    name: String,
    path: String,
    pro_layout_parentKeys: js.Array[String],
    routes: Null
  ): ProlayoutparentKeys = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pro_layout_parentKeys = pro_layout_parentKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProlayoutparentKeys]
  }
}

