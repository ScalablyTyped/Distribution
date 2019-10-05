package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an item in a list.
  **/
trait IItem[T] extends js.Object {
  //#region Properties
  /**
    * Gets or sets the item's data.
    **/
  var data: T
  /**
    * Gets the group key for the item. This property is only available for items that belong to a grouped data source.
    **/
  var groupKey: String
  /**
    * Gets the temporary ID of the item.
    **/
  var handle: String
  /**
    * Gets the item's index in the IListDataSource.
    **/
  var index: Double
  /**
    * Gets or sets the key the identifies the item.
    **/
  var key: String
}

object IItem {
  @scala.inline
  def apply[T](data: T, groupKey: String, handle: String, index: Double, key: String): IItem[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupKey = groupKey, handle = handle, index = index, key = key)
  
    __obj.asInstanceOf[IItem[T]]
  }
}

