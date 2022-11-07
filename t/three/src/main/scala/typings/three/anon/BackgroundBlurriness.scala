package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundBlurriness extends StObject {
  
  var backgroundBlurriness: IUniform[Any]
  
  var envMap: IUniform[Any]
  
  var flipEnvMap: IUniform[Any]
  
  var ior: IUniform[Any]
  
  var reflectivity: IUniform[Any]
  
  var refractRatio: IUniform[Any]
}
object BackgroundBlurriness {
  
  inline def apply(
    backgroundBlurriness: IUniform[Any],
    envMap: IUniform[Any],
    flipEnvMap: IUniform[Any],
    ior: IUniform[Any],
    reflectivity: IUniform[Any],
    refractRatio: IUniform[Any]
  ): BackgroundBlurriness = {
    val __obj = js.Dynamic.literal(backgroundBlurriness = backgroundBlurriness.asInstanceOf[js.Any], envMap = envMap.asInstanceOf[js.Any], flipEnvMap = flipEnvMap.asInstanceOf[js.Any], ior = ior.asInstanceOf[js.Any], reflectivity = reflectivity.asInstanceOf[js.Any], refractRatio = refractRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundBlurriness]
  }
  
  extension [Self <: BackgroundBlurriness](x: Self) {
    
    inline def setBackgroundBlurriness(value: IUniform[Any]): Self = StObject.set(x, "backgroundBlurriness", value.asInstanceOf[js.Any])
    
    inline def setEnvMap(value: IUniform[Any]): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
    
    inline def setFlipEnvMap(value: IUniform[Any]): Self = StObject.set(x, "flipEnvMap", value.asInstanceOf[js.Any])
    
    inline def setIor(value: IUniform[Any]): Self = StObject.set(x, "ior", value.asInstanceOf[js.Any])
    
    inline def setReflectivity(value: IUniform[Any]): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
    
    inline def setRefractRatio(value: IUniform[Any]): Self = StObject.set(x, "refractRatio", value.asInstanceOf[js.Any])
  }
}
