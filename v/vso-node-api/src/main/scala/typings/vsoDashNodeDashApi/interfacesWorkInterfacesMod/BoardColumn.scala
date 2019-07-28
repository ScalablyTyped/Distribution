package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardColumn extends js.Object {
  var columnType: BoardColumnType
  var description: String
  var id: String
  var isSplit: Boolean
  var itemLimit: Double
  var name: String
  var stateMappings: StringDictionary[String]
}

object BoardColumn {
  @scala.inline
  def apply(
    columnType: BoardColumnType,
    description: String,
    id: String,
    isSplit: Boolean,
    itemLimit: Double,
    name: String,
    stateMappings: StringDictionary[String]
  ): BoardColumn = {
    val __obj = js.Dynamic.literal(columnType = columnType, description = description, id = id, isSplit = isSplit, itemLimit = itemLimit, name = name, stateMappings = stateMappings)
  
    __obj.asInstanceOf[BoardColumn]
  }
}

