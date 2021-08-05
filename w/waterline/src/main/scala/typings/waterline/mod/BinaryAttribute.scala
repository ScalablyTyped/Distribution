package typings.waterline.mod

import typings.waterline.waterlineStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryAttribute
  extends StObject
     with BaseAttribute[js.Any]
     with _Attribute {
  
  @JSName("type")
  var type_BinaryAttribute: binary
}
object BinaryAttribute {
  
  inline def apply(): BinaryAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[BinaryAttribute]
  }
  
  extension [Self <: BinaryAttribute](x: Self) {
    
    inline def setType(value: binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
