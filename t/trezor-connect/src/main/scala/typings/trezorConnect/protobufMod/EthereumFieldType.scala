package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumFieldType extends StObject {
  
  var data_type: EthereumDataType
  
  var entry_type: js.UndefOr[EthereumFieldType] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var struct_name: js.UndefOr[String] = js.undefined
}
object EthereumFieldType {
  
  inline def apply(data_type: EthereumDataType): EthereumFieldType = {
    val __obj = js.Dynamic.literal(data_type = data_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumFieldType]
  }
  
  extension [Self <: EthereumFieldType](x: Self) {
    
    inline def setData_type(value: EthereumDataType): Self = StObject.set(x, "data_type", value.asInstanceOf[js.Any])
    
    inline def setEntry_type(value: EthereumFieldType): Self = StObject.set(x, "entry_type", value.asInstanceOf[js.Any])
    
    inline def setEntry_typeUndefined: Self = StObject.set(x, "entry_type", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStruct_name(value: String): Self = StObject.set(x, "struct_name", value.asInstanceOf[js.Any])
    
    inline def setStruct_nameUndefined: Self = StObject.set(x, "struct_name", js.undefined)
  }
}
