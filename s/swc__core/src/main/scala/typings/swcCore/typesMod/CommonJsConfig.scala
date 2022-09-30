package typings.swcCore.typesMod

import typings.swcCore.swcCoreStrings.commonjs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonJsConfig
  extends StObject
     with BaseModuleConfig
     with ModuleConfig {
  
  var `type`: commonjs
}
object CommonJsConfig {
  
  inline def apply(): CommonJsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commonjs")
    __obj.asInstanceOf[CommonJsConfig]
  }
  
  extension [Self <: CommonJsConfig](x: Self) {
    
    inline def setType(value: commonjs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
