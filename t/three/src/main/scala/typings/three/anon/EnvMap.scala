package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvMap extends StObject {
  
  var envMap: IUniform
  
  var flipEnvMap: IUniform
  
  var maxMipLevel: IUniform
  
  var reflectivity: IUniform
  
  var refractionRatio: IUniform
}
object EnvMap {
  
  inline def apply(
    envMap: IUniform,
    flipEnvMap: IUniform,
    maxMipLevel: IUniform,
    reflectivity: IUniform,
    refractionRatio: IUniform
  ): EnvMap = {
    val __obj = js.Dynamic.literal(envMap = envMap.asInstanceOf[js.Any], flipEnvMap = flipEnvMap.asInstanceOf[js.Any], maxMipLevel = maxMipLevel.asInstanceOf[js.Any], reflectivity = reflectivity.asInstanceOf[js.Any], refractionRatio = refractionRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvMap]
  }
  
  extension [Self <: EnvMap](x: Self) {
    
    inline def setEnvMap(value: IUniform): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
    
    inline def setFlipEnvMap(value: IUniform): Self = StObject.set(x, "flipEnvMap", value.asInstanceOf[js.Any])
    
    inline def setMaxMipLevel(value: IUniform): Self = StObject.set(x, "maxMipLevel", value.asInstanceOf[js.Any])
    
    inline def setReflectivity(value: IUniform): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
    
    inline def setRefractionRatio(value: IUniform): Self = StObject.set(x, "refractionRatio", value.asInstanceOf[js.Any])
  }
}
