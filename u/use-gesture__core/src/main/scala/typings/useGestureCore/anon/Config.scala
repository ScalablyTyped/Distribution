package typings.useGestureCore.anon

import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.UserGestureConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: UserGestureConfig
  
  var nativeHandlers: Any
}
object Config {
  
  inline def apply(config: UserGestureConfig, nativeHandlers: Any): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], nativeHandlers = nativeHandlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: UserGestureConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setNativeHandlers(value: Any): Self = StObject.set(x, "nativeHandlers", value.asInstanceOf[js.Any])
  }
}
