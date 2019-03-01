package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Board extends BoardReference {
  var _links: js.Any
  var allowedMappings: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]]
  var canEdit: scala.Boolean
  var columns: js.Array[BoardColumn]
  var fields: BoardFields
  var isValid: scala.Boolean
  var revision: scala.Double
  var rows: js.Array[BoardRow]
}

object Board {
  @scala.inline
  def apply(
    _links: js.Any,
    allowedMappings: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]],
    canEdit: scala.Boolean,
    columns: js.Array[BoardColumn],
    fields: BoardFields,
    id: java.lang.String,
    isValid: scala.Boolean,
    name: java.lang.String,
    revision: scala.Double,
    rows: js.Array[BoardRow],
    url: java.lang.String
  ): Board = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("allowedMappings")(allowedMappings)
    __obj.updateDynamic("canEdit")(canEdit)
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("rows")(rows)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Board]
  }
}

