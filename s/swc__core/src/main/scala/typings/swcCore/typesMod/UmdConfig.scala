package typings.swcCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.swcCore.swcCoreStrings.umd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UmdConfig
  extends StObject
     with BaseModuleConfig
     with ModuleConfig {
  
  var globals: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var `type`: umd
}
object UmdConfig {
  
  inline def apply(): UmdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("umd")
    __obj.asInstanceOf[UmdConfig]
  }
  
  extension [Self <: UmdConfig](x: Self) {
    
    inline def setGlobals(value: StringDictionary[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setType(value: umd): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
