package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bias extends StObject {
  
  var bias: IUniform[Any]
  
  var cameraFar: IUniform[Any]
  
  var cameraInverseProjectionMatrix: IUniform[Any]
  
  var cameraNear: IUniform[Any]
  
  var cameraProjectionMatrix: IUniform[Any]
  
  var intensity: IUniform[Any]
  
  var kernelRadius: IUniform[Any]
  
  var minResolution: IUniform[Any]
  
  var randomSeed: IUniform[Any]
  
  var scale: IUniform[Any]
  
  var size: IUniform[Any]
  
  var tDepth: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var tNormal: IUniform[Any]
}
object Bias {
  
  inline def apply(
    bias: IUniform[Any],
    cameraFar: IUniform[Any],
    cameraInverseProjectionMatrix: IUniform[Any],
    cameraNear: IUniform[Any],
    cameraProjectionMatrix: IUniform[Any],
    intensity: IUniform[Any],
    kernelRadius: IUniform[Any],
    minResolution: IUniform[Any],
    randomSeed: IUniform[Any],
    scale: IUniform[Any],
    size: IUniform[Any],
    tDepth: IUniform[Any],
    tDiffuse: IUniform[Any],
    tNormal: IUniform[Any]
  ): Bias = {
    val __obj = js.Dynamic.literal(bias = bias.asInstanceOf[js.Any], cameraFar = cameraFar.asInstanceOf[js.Any], cameraInverseProjectionMatrix = cameraInverseProjectionMatrix.asInstanceOf[js.Any], cameraNear = cameraNear.asInstanceOf[js.Any], cameraProjectionMatrix = cameraProjectionMatrix.asInstanceOf[js.Any], intensity = intensity.asInstanceOf[js.Any], kernelRadius = kernelRadius.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], randomSeed = randomSeed.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tDepth = tDepth.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], tNormal = tNormal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bias]
  }
  
  extension [Self <: Bias](x: Self) {
    
    inline def setBias(value: IUniform[Any]): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    inline def setCameraFar(value: IUniform[Any]): Self = StObject.set(x, "cameraFar", value.asInstanceOf[js.Any])
    
    inline def setCameraInverseProjectionMatrix(value: IUniform[Any]): Self = StObject.set(x, "cameraInverseProjectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setCameraNear(value: IUniform[Any]): Self = StObject.set(x, "cameraNear", value.asInstanceOf[js.Any])
    
    inline def setCameraProjectionMatrix(value: IUniform[Any]): Self = StObject.set(x, "cameraProjectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setIntensity(value: IUniform[Any]): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setKernelRadius(value: IUniform[Any]): Self = StObject.set(x, "kernelRadius", value.asInstanceOf[js.Any])
    
    inline def setMinResolution(value: IUniform[Any]): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
    
    inline def setRandomSeed(value: IUniform[Any]): Self = StObject.set(x, "randomSeed", value.asInstanceOf[js.Any])
    
    inline def setScale(value: IUniform[Any]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSize(value: IUniform[Any]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTDepth(value: IUniform[Any]): Self = StObject.set(x, "tDepth", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setTNormal(value: IUniform[Any]): Self = StObject.set(x, "tNormal", value.asInstanceOf[js.Any])
  }
}
