package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePortStringDataItem
  extends StObject
     with MessagePortDataItem {
  
  var key: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[StringDataItemValue] = js.undefined
}
object MessagePortStringDataItem {
  
  inline def apply(): MessagePortStringDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePortStringDataItem]
  }
  
  extension [Self <: MessagePortStringDataItem](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: StringDataItemValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
