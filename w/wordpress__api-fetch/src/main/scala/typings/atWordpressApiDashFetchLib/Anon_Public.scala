package typings
package atWordpressApiDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Public extends js.Object {
  var public: scala.Boolean
  var publicly_queryable: scala.Boolean
  var show_admin_column: scala.Boolean
  var show_in_nav_menus: scala.Boolean
  var show_in_quick_edit: scala.Boolean
  var show_ui: scala.Boolean
}

object Anon_Public {
  @scala.inline
  def apply(
    public: scala.Boolean,
    publicly_queryable: scala.Boolean,
    show_admin_column: scala.Boolean,
    show_in_nav_menus: scala.Boolean,
    show_in_quick_edit: scala.Boolean,
    show_ui: scala.Boolean
  ): Anon_Public = {
    val __obj = js.Dynamic.literal(public = public, publicly_queryable = publicly_queryable, show_admin_column = show_admin_column, show_in_nav_menus = show_in_nav_menus, show_in_quick_edit = show_in_quick_edit, show_ui = show_ui)
  
    __obj.asInstanceOf[Anon_Public]
  }
}

