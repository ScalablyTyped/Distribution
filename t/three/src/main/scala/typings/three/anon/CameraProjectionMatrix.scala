package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import typings.three.srcThreeMod.Matrix4
import typings.three.srcThreeMod.Texture
import typings.three.srcThreeMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraProjectionMatrix extends StObject {
  
  var cameraFar: IUniform[Double]
  
  var cameraInverseProjectionMatrix: IUniform[Matrix4]
  
  var cameraNear: IUniform[Double]
  
  var cameraProjectionMatrix: IUniform[Matrix4]
  
  var cameraRange: IUniform[Double]
  
  var maxDistance: IUniform[Double]
  
  var opacity: IUniform[Double]
  
  var resolution: IUniform[Vector2]
  
  var tDepth: IUniform[Texture | Null]
  
  var tDiffuse: IUniform[Texture | Null]
  
  var tMetalness: IUniform[Texture | Null]
  
  var tNormal: IUniform[Texture | Null]
  
  var thickness: IUniform[Double]
}
object CameraProjectionMatrix {
  
  inline def apply(
    cameraFar: IUniform[Double],
    cameraInverseProjectionMatrix: IUniform[Matrix4],
    cameraNear: IUniform[Double],
    cameraProjectionMatrix: IUniform[Matrix4],
    cameraRange: IUniform[Double],
    maxDistance: IUniform[Double],
    opacity: IUniform[Double],
    resolution: IUniform[Vector2],
    tDepth: IUniform[Texture | Null],
    tDiffuse: IUniform[Texture | Null],
    tMetalness: IUniform[Texture | Null],
    tNormal: IUniform[Texture | Null],
    thickness: IUniform[Double]
  ): CameraProjectionMatrix = {
    val __obj = js.Dynamic.literal(cameraFar = cameraFar.asInstanceOf[js.Any], cameraInverseProjectionMatrix = cameraInverseProjectionMatrix.asInstanceOf[js.Any], cameraNear = cameraNear.asInstanceOf[js.Any], cameraProjectionMatrix = cameraProjectionMatrix.asInstanceOf[js.Any], cameraRange = cameraRange.asInstanceOf[js.Any], maxDistance = maxDistance.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], tDepth = tDepth.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], tMetalness = tMetalness.asInstanceOf[js.Any], tNormal = tNormal.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraProjectionMatrix]
  }
  
  extension [Self <: CameraProjectionMatrix](x: Self) {
    
    inline def setCameraFar(value: IUniform[Double]): Self = StObject.set(x, "cameraFar", value.asInstanceOf[js.Any])
    
    inline def setCameraInverseProjectionMatrix(value: IUniform[Matrix4]): Self = StObject.set(x, "cameraInverseProjectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setCameraNear(value: IUniform[Double]): Self = StObject.set(x, "cameraNear", value.asInstanceOf[js.Any])
    
    inline def setCameraProjectionMatrix(value: IUniform[Matrix4]): Self = StObject.set(x, "cameraProjectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setCameraRange(value: IUniform[Double]): Self = StObject.set(x, "cameraRange", value.asInstanceOf[js.Any])
    
    inline def setMaxDistance(value: IUniform[Double]): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: IUniform[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: IUniform[Vector2]): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setTDepth(value: IUniform[Texture | Null]): Self = StObject.set(x, "tDepth", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Texture | Null]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setTMetalness(value: IUniform[Texture | Null]): Self = StObject.set(x, "tMetalness", value.asInstanceOf[js.Any])
    
    inline def setTNormal(value: IUniform[Texture | Null]): Self = StObject.set(x, "tNormal", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: IUniform[Double]): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
