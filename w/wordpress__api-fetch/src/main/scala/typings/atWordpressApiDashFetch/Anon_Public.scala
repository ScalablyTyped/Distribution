package typings.atWordpressApiDashFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Public extends js.Object {
  var public: Boolean
  var publicly_queryable: Boolean
  var show_admin_column: Boolean
  var show_in_nav_menus: Boolean
  var show_in_quick_edit: Boolean
  var show_ui: Boolean
}

object Anon_Public {
  @scala.inline
  def apply(
    public: Boolean,
    publicly_queryable: Boolean,
    show_admin_column: Boolean,
    show_in_nav_menus: Boolean,
    show_in_quick_edit: Boolean,
    show_ui: Boolean
  ): Anon_Public = {
    val __obj = js.Dynamic.literal(public = public, publicly_queryable = publicly_queryable, show_admin_column = show_admin_column, show_in_nav_menus = show_in_nav_menus, show_in_quick_edit = show_in_quick_edit, show_ui = show_ui)
  
    __obj.asInstanceOf[Anon_Public]
  }
}

