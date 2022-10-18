package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvMap extends StObject {
  
  var envMap: IUniform[Any]
  
  var flipEnvMap: IUniform[Any]
  
  var maxMipLevel: IUniform[Any]
  
  var reflectivity: IUniform[Any]
  
  var refractionRatio: IUniform[Any]
}
object EnvMap {
  
  inline def apply(
    envMap: IUniform[Any],
    flipEnvMap: IUniform[Any],
    maxMipLevel: IUniform[Any],
    reflectivity: IUniform[Any],
    refractionRatio: IUniform[Any]
  ): EnvMap = {
    val __obj = js.Dynamic.literal(envMap = envMap.asInstanceOf[js.Any], flipEnvMap = flipEnvMap.asInstanceOf[js.Any], maxMipLevel = maxMipLevel.asInstanceOf[js.Any], reflectivity = reflectivity.asInstanceOf[js.Any], refractionRatio = refractionRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvMap]
  }
  
  extension [Self <: EnvMap](x: Self) {
    
    inline def setEnvMap(value: IUniform[Any]): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
    
    inline def setFlipEnvMap(value: IUniform[Any]): Self = StObject.set(x, "flipEnvMap", value.asInstanceOf[js.Any])
    
    inline def setMaxMipLevel(value: IUniform[Any]): Self = StObject.set(x, "maxMipLevel", value.asInstanceOf[js.Any])
    
    inline def setReflectivity(value: IUniform[Any]): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
    
    inline def setRefractionRatio(value: IUniform[Any]): Self = StObject.set(x, "refractionRatio", value.asInstanceOf[js.Any])
  }
}
