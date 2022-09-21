package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageOptions extends StObject {
  
  var autoSchema: js.UndefOr[Boolean] = js.undefined
  
  var isSerial: js.UndefOr[Boolean] = js.undefined
  
  var mechanisms: js.UndefOr[js.Array[String]] = js.undefined
  
  var requestType: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object StorageOptions {
  
  inline def apply(): StorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageOptions]
  }
  
  extension [Self <: StorageOptions](x: Self) {
    
    inline def setAutoSchema(value: Boolean): Self = StObject.set(x, "autoSchema", value.asInstanceOf[js.Any])
    
    inline def setAutoSchemaUndefined: Self = StObject.set(x, "autoSchema", js.undefined)
    
    inline def setIsSerial(value: Boolean): Self = StObject.set(x, "isSerial", value.asInstanceOf[js.Any])
    
    inline def setIsSerialUndefined: Self = StObject.set(x, "isSerial", js.undefined)
    
    inline def setMechanisms(value: js.Array[String]): Self = StObject.set(x, "mechanisms", value.asInstanceOf[js.Any])
    
    inline def setMechanismsUndefined: Self = StObject.set(x, "mechanisms", js.undefined)
    
    inline def setMechanismsVarargs(value: String*): Self = StObject.set(x, "mechanisms", js.Array(value*))
    
    inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
