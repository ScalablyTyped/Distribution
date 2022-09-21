package typings.xummSdk.xummApiMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XummCustomMeta extends StObject {
  
  var blob: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var identifier: js.UndefOr[String | Null] = js.undefined
  
  var instruction: js.UndefOr[String | Null] = js.undefined
}
object XummCustomMeta {
  
  inline def apply(): XummCustomMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XummCustomMeta]
  }
  
  extension [Self <: XummCustomMeta](x: Self) {
    
    inline def setBlob(value: Record[String, Any]): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobNull: Self = StObject.set(x, "blob", null)
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierNull: Self = StObject.set(x, "identifier", null)
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionNull: Self = StObject.set(x, "instruction", null)
    
    inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
  }
}
