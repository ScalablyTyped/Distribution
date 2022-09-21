package typings.tablestore.anon

import typings.tablestore.mod.EnumValuesOrKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var name: String
  
  var `type`: EnumValuesOrKeys[DCTBOOLEAN]
}
object Type {
  
  inline def apply(name: String, `type`: EnumValuesOrKeys[DCTBOOLEAN]): Type = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: EnumValuesOrKeys[DCTBOOLEAN]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
