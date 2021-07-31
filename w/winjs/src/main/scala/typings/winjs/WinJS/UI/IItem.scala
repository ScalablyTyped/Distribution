package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an item in a list.
  **/
trait IItem[T] extends StObject {
  
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupKey = groupKey.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem[T]]
  }
  
  @scala.inline
  implicit class IItemMutableBuilder[Self <: IItem[?], T] (val x: Self & IItem[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
