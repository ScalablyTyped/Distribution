package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Board extends BoardReference {
  var _links: js.Any = js.native
  var allowedMappings: StringDictionary[StringDictionary[js.Array[String]]] = js.native
  var canEdit: Boolean = js.native
  var columns: js.Array[BoardColumn] = js.native
  var fields: BoardFields = js.native
  var isValid: Boolean = js.native
  var revision: Double = js.native
  var rows: js.Array[BoardRow] = js.native
}

object Board {
  @scala.inline
  def apply(
    _links: js.Any,
    allowedMappings: StringDictionary[StringDictionary[js.Array[String]]],
    canEdit: Boolean,
    columns: js.Array[BoardColumn],
    fields: BoardFields,
    id: String,
    isValid: Boolean,
    name: String,
    revision: Double,
    rows: js.Array[BoardRow],
    url: String
  ): Board = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], allowedMappings = allowedMappings.asInstanceOf[js.Any], canEdit = canEdit.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Board]
  }
  @scala.inline
  implicit class BoardOps[Self <: Board] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedMappings(value: StringDictionary[StringDictionary[js.Array[String]]]): Self = this.set("allowedMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanEdit(value: Boolean): Self = this.set("canEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsVarargs(value: BoardColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[BoardColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setFields(value: BoardFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: BoardRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[BoardRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

