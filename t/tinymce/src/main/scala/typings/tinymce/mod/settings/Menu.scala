package typings.tinymce.mod.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Menu extends js.Object {
  var edit: js.UndefOr[MenuItem] = js.undefined
  var file: js.UndefOr[MenuItem] = js.undefined
  var format: js.UndefOr[MenuItem] = js.undefined
  var insert: js.UndefOr[MenuItem] = js.undefined
  var table: js.UndefOr[MenuItem] = js.undefined
  var tools: js.UndefOr[MenuItem] = js.undefined
  var view: js.UndefOr[MenuItem] = js.undefined
}

object Menu {
  @scala.inline
  def apply(
    edit: MenuItem = null,
    file: MenuItem = null,
    format: MenuItem = null,
    insert: MenuItem = null,
    table: MenuItem = null,
    tools: MenuItem = null,
    view: MenuItem = null
  ): Menu = {
    val __obj = js.Dynamic.literal()
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Menu]
  }
}

