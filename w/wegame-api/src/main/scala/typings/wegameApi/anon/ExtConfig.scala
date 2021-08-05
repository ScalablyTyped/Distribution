package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtConfig extends StObject {
  
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.Any
}
object ExtConfig {
  
  inline def apply(extConfig: js.Any): ExtConfig = {
    val __obj = js.Dynamic.literal(extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtConfig]
  }
  
  extension [Self <: ExtConfig](x: Self) {
    
    inline def setExtConfig(value: js.Any): Self = StObject.set(x, "extConfig", value.asInstanceOf[js.Any])
  }
}
