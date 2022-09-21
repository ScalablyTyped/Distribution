package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePortByteStreamDataItem
  extends StObject
     with MessagePortDataItem {
  
  var key: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[ByteStreamDataItemValue] = js.undefined
}
object MessagePortByteStreamDataItem {
  
  inline def apply(): MessagePortByteStreamDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePortByteStreamDataItem]
  }
  
  extension [Self <: MessagePortByteStreamDataItem](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: ByteStreamDataItemValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (ByteStream | Double)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
