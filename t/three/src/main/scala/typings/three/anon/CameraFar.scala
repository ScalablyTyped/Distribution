package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraFar extends StObject {
  
  var cameraFar: IUniform[Any]
  
  var cameraNear: IUniform[Any]
  
  var depthCutoff: IUniform[Any]
  
  var sampleUvOffsets: IUniform[Any]
  
  var sampleWeights: IUniform[Any]
  
  var size: IUniform[Any]
  
  var tDepth: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object CameraFar {
  
  inline def apply(
    cameraFar: IUniform[Any],
    cameraNear: IUniform[Any],
    depthCutoff: IUniform[Any],
    sampleUvOffsets: IUniform[Any],
    sampleWeights: IUniform[Any],
    size: IUniform[Any],
    tDepth: IUniform[Any],
    tDiffuse: IUniform[Any]
  ): CameraFar = {
    val __obj = js.Dynamic.literal(cameraFar = cameraFar.asInstanceOf[js.Any], cameraNear = cameraNear.asInstanceOf[js.Any], depthCutoff = depthCutoff.asInstanceOf[js.Any], sampleUvOffsets = sampleUvOffsets.asInstanceOf[js.Any], sampleWeights = sampleWeights.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tDepth = tDepth.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraFar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraFar] (val x: Self) extends AnyVal {
    
    inline def setCameraFar(value: IUniform[Any]): Self = StObject.set(x, "cameraFar", value.asInstanceOf[js.Any])
    
    inline def setCameraNear(value: IUniform[Any]): Self = StObject.set(x, "cameraNear", value.asInstanceOf[js.Any])
    
    inline def setDepthCutoff(value: IUniform[Any]): Self = StObject.set(x, "depthCutoff", value.asInstanceOf[js.Any])
    
    inline def setSampleUvOffsets(value: IUniform[Any]): Self = StObject.set(x, "sampleUvOffsets", value.asInstanceOf[js.Any])
    
    inline def setSampleWeights(value: IUniform[Any]): Self = StObject.set(x, "sampleWeights", value.asInstanceOf[js.Any])
    
    inline def setSize(value: IUniform[Any]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTDepth(value: IUniform[Any]): Self = StObject.set(x, "tDepth", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
