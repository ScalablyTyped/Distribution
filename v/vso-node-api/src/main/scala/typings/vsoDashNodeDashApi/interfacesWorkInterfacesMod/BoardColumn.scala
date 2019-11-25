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
    val __obj = js.Dynamic.literal(columnType = columnType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSplit = isSplit.asInstanceOf[js.Any], itemLimit = itemLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stateMappings = stateMappings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoardColumn]
  }
}

