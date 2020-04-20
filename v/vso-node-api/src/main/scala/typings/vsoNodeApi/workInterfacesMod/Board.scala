package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Board extends BoardReference {
  var _links: js.Any
  var allowedMappings: StringDictionary[StringDictionary[js.Array[String]]]
  var canEdit: Boolean
  var columns: js.Array[BoardColumn]
  var fields: BoardFields
  var isValid: Boolean
  var revision: Double
  var rows: js.Array[BoardRow]
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
}

