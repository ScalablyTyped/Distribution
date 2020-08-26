package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoardColumn extends js.Object {
  var columnType: BoardColumnType = js.native
  var description: String = js.native
  var id: String = js.native
  var isSplit: Boolean = js.native
  var itemLimit: Double = js.native
  var name: String = js.native
  var stateMappings: StringDictionary[String] = js.native
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
  @scala.inline
  implicit class BoardColumnOps[Self <: BoardColumn] (val x: Self) extends AnyVal {
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
    def setColumnType(value: BoardColumnType): Self = this.set("columnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSplit(value: Boolean): Self = this.set("isSplit", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemLimit(value: Double): Self = this.set("itemLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateMappings(value: StringDictionary[String]): Self = this.set("stateMappings", value.asInstanceOf[js.Any])
  }
  
}

