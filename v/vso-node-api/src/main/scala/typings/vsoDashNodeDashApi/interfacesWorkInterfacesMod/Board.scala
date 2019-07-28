package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

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
    val __obj = js.Dynamic.literal(_links = _links, allowedMappings = allowedMappings, canEdit = canEdit, columns = columns, fields = fields, id = id, isValid = isValid, name = name, revision = revision, rows = rows, url = url)
  
    __obj.asInstanceOf[Board]
  }
}

