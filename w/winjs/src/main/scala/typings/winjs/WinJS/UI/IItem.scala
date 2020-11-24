package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an item in a list.
  **/
@js.native
trait IItem[T] extends js.Object {
  
  //#region Properties
  /**
    * Gets or sets the item's data.
    **/
  var data: T = js.native
  
  /**
    * Gets the group key for the item. This property is only available for items that belong to a grouped data source.
    **/
  var groupKey: String = js.native
  
  /**
    * Gets the temporary ID of the item.
    **/
  var handle: String = js.native
  
  /**
    * Gets the item's index in the IListDataSource.
    **/
  var index: Double = js.native
  
  /**
    * Gets or sets the key the identifies the item.
    **/
  var key: String = js.native
}
object IItem {
  
  @scala.inline
  def apply[T](data: T, groupKey: String, handle: String, index: Double, key: String): IItem[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupKey = groupKey.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem[T]]
  }
  
  @scala.inline
  implicit class IItemOps[Self <: IItem[_], T] (val x: Self with IItem[T]) extends AnyVal {
    
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKey(value: String): Self = this.set("groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
