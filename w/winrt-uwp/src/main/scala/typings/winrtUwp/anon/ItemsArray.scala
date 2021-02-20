package typings.winrtUwp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsArray extends StObject {
  
  /** The file name extensions in the collection that start at startIndex. */ var items: js.Array[String] = js.native
  
  /** The number of items retrieved. */ var returnValue: Double = js.native
}
object ItemsArray {
  
  @scala.inline
  def apply(items: js.Array[String], returnValue: Double): ItemsArray = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsArray]
  }
  
  @scala.inline
  implicit class ItemsArrayMutableBuilder[Self <: ItemsArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
