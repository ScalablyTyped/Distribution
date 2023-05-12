package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvMap extends StObject {
  
  var envMap: IUniform[Any]
  
  var flipEnvMap: IUniform[Double]
  
  var ior: IUniform[Double]
  
  var reflectivity: IUniform[Double]
  
  var refractRatio: IUniform[Double]
}
object EnvMap {
  
  inline def apply(
    envMap: IUniform[Any],
    flipEnvMap: IUniform[Double],
    ior: IUniform[Double],
    reflectivity: IUniform[Double],
    refractRatio: IUniform[Double]
  ): EnvMap = {
    val __obj = js.Dynamic.literal(envMap = envMap.asInstanceOf[js.Any], flipEnvMap = flipEnvMap.asInstanceOf[js.Any], ior = ior.asInstanceOf[js.Any], reflectivity = reflectivity.asInstanceOf[js.Any], refractRatio = refractRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvMap] (val x: Self) extends AnyVal {
    
    inline def setEnvMap(value: IUniform[Any]): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
    
    inline def setFlipEnvMap(value: IUniform[Double]): Self = StObject.set(x, "flipEnvMap", value.asInstanceOf[js.Any])
    
    inline def setIor(value: IUniform[Double]): Self = StObject.set(x, "ior", value.asInstanceOf[js.Any])
    
    inline def setReflectivity(value: IUniform[Double]): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
    
    inline def setRefractRatio(value: IUniform[Double]): Self = StObject.set(x, "refractRatio", value.asInstanceOf[js.Any])
  }
}
