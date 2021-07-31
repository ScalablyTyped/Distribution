package typings.winrt.anon

import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var items: js.Array[StorageFile]
  
  var returnValue: Double
}
object `8` {
  
  @scala.inline
  def apply(items: js.Array[StorageFile], returnValue: Double): `8` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[StorageFile]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: StorageFile*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
