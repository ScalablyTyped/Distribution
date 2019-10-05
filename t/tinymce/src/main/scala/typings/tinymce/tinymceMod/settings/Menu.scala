package typings.tinymce.tinymceMod.settings

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
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (file != null) __obj.updateDynamic("file")(file)
    if (format != null) __obj.updateDynamic("format")(format)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (table != null) __obj.updateDynamic("table")(table)
    if (tools != null) __obj.updateDynamic("tools")(tools)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Menu]
  }
}

