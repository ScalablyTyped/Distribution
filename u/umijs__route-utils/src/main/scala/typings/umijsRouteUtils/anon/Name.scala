package typings.umijsRouteUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  var exact: Boolean = js.native
  var icon: Key = js.native
  var key: String = js.native
  var locale: String = js.native
  var name: String = js.native
  var path: String = js.native
  var pro_layout_parentKeys: js.Array[String] = js.native
  var routes: Null = js.native
}

object Name {
  @scala.inline
  def apply(
    exact: Boolean,
    icon: Key,
    key: String,
    locale: String,
    name: String,
    path: String,
    pro_layout_parentKeys: js.Array[String],
    routes: Null
  ): Name = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pro_layout_parentKeys = pro_layout_parentKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: Key): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPro_layout_parentKeysVarargs(value: String*): Self = this.set("pro_layout_parentKeys", js.Array(value :_*))
    @scala.inline
    def setPro_layout_parentKeys(value: js.Array[String]): Self = this.set("pro_layout_parentKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutes(value: Null): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
  
}

