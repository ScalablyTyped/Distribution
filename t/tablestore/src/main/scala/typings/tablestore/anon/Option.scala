package typings.tablestore.anon

import typings.tablestore.mod.EnumValuesOrKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option extends StObject {
  
  var name: String
  
  var option: js.UndefOr[EnumValuesOrKeys[AUTOINCREMENT]] = js.undefined
  
  var `type`: EnumValuesOrKeys[BINARY]
}
object Option {
  
  inline def apply(name: String, `type`: EnumValuesOrKeys[BINARY]): Option = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  extension [Self <: Option](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOption(value: EnumValuesOrKeys[AUTOINCREMENT]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setType(value: EnumValuesOrKeys[BINARY]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
