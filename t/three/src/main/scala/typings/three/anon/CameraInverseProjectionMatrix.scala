package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraInverseProjectionMatrix extends StObject {
  
  var cameraFar: IUniform[Any]
  
  var cameraInverseProjectionMatrix: IUniform[Any]
  
  var cameraNear: IUniform[Any]
  
  var cameraProjectionMatrix: IUniform[Any]
  
  var kernel: IUniform[Any]
  
  var kernelRadius: IUniform[Any]
  
  var maxDistance: IUniform[Any]
  
  var minDistance: IUniform[Any]
  
  var resolution: IUniform[Any]
  
  var tDepth: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var tNoise: IUniform[Any]
  
  var tNormal: IUniform[Any]
}
object CameraInverseProjectionMatrix {
  
  inline def apply(
    cameraFar: IUniform[Any],
    cameraInverseProjectionMatrix: IUniform[Any],
    cameraNear: IUniform[Any],
    cameraProjectionMatrix: IUniform[Any],
    kernel: IUniform[Any],
    kernelRadius: IUniform[Any],
    maxDistance: IUniform[Any],
    minDistance: IUniform[Any],
    resolution: IUniform[Any],
    tDepth: IUniform[Any],
    tDiffuse: IUniform[Any],
    tNoise: IUniform[Any],
    tNormal: IUniform[Any]
  ): CameraInverseProjectionMatrix = {
    val __obj = js.Dynamic.literal(cameraFar = cameraFar.asInstanceOf[js.Any], cameraInverseProjectionMatrix = cameraInverseProjectionMatrix.asInstanceOf[js.Any], cameraNear = cameraNear.asInstanceOf[js.Any], cameraProjectionMatrix = cameraProjectionMatrix.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], kernelRadius = kernelRadius.asInstanceOf[js.Any], maxDistance = maxDistance.asInstanceOf[js.Any], minDistance = minDistance.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], tDepth = tDepth.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], tNoise = tNoise.asInstanceOf[js.Any], tNormal = tNormal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraInverseProjectionMatrix]
  }
  
  extension [Self <: CameraInverseProjectionMatrix](x: Self) {
    
    inline def setCameraFar(value: IUniform[Any]): Self = StObject.set(x, "cameraFar", value.asInstanceOf[js.Any])
    
    inline def setCameraInverseProjectionMatrix(value: IUniform[Any]): Self = StObject.set(x, "cameraInverseProjectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setCameraNear(value: IUniform[Any]): Self = StObject.set(x, "cameraNear", value.asInstanceOf[js.Any])
    
    inline def setCameraProjectionMatrix(value: IUniform[Any]): Self = StObject.set(x, "cameraProjectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setKernel(value: IUniform[Any]): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    inline def setKernelRadius(value: IUniform[Any]): Self = StObject.set(x, "kernelRadius", value.asInstanceOf[js.Any])
    
    inline def setMaxDistance(value: IUniform[Any]): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistance(value: IUniform[Any]): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: IUniform[Any]): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setTDepth(value: IUniform[Any]): Self = StObject.set(x, "tDepth", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setTNoise(value: IUniform[Any]): Self = StObject.set(x, "tNoise", value.asInstanceOf[js.Any])
    
    inline def setTNormal(value: IUniform[Any]): Self = StObject.set(x, "tNormal", value.asInstanceOf[js.Any])
  }
}
