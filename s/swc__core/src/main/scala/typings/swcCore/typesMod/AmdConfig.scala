package typings.swcCore.typesMod

import typings.swcCore.swcCoreStrings.amd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmdConfig
  extends StObject
     with BaseModuleConfig
     with ModuleConfig {
  
  var moduleId: js.UndefOr[String] = js.undefined
  
  var `type`: amd
}
object AmdConfig {
  
  inline def apply(): AmdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("amd")
    __obj.asInstanceOf[AmdConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmdConfig] (val x: Self) extends AnyVal {
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    inline def setType(value: amd): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
