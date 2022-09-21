package typings.tablestore.anon

import typings.tablestore.tablestoreNumbers.`1`
import typings.tablestore.tablestoreNumbers.`2`
import typings.tablestore.tablestoreNumbers.`3`
import typings.tablestore.tablestoreNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DCTBOOLEAN extends StObject {
  
  var DCT_BOOLEAN: `3`
  
  var DCT_DOUBLE: `2`
  
  var DCT_INTEGER: `1`
  
  var DCT_STRING: `4`
}
object DCTBOOLEAN {
  
  inline def apply(): DCTBOOLEAN = {
    val __obj = js.Dynamic.literal(DCT_BOOLEAN = 3, DCT_DOUBLE = 2, DCT_INTEGER = 1, DCT_STRING = 4)
    __obj.asInstanceOf[DCTBOOLEAN]
  }
  
  extension [Self <: DCTBOOLEAN](x: Self) {
    
    inline def setDCT_BOOLEAN(value: `3`): Self = StObject.set(x, "DCT_BOOLEAN", value.asInstanceOf[js.Any])
    
    inline def setDCT_DOUBLE(value: `2`): Self = StObject.set(x, "DCT_DOUBLE", value.asInstanceOf[js.Any])
    
    inline def setDCT_INTEGER(value: `1`): Self = StObject.set(x, "DCT_INTEGER", value.asInstanceOf[js.Any])
    
    inline def setDCT_STRING(value: `4`): Self = StObject.set(x, "DCT_STRING", value.asInstanceOf[js.Any])
  }
}
