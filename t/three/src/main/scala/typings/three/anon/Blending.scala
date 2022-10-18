package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blending extends StObject {
  
  var blending: IUniform[Any]
  
  var blendingMode: IUniform[Any]
  
  var disable: IUniform[Any]
  
  var greyscale: IUniform[Any]
  
  var height: IUniform[Any]
  
  var radius: IUniform[Any]
  
  var rotateB: IUniform[Any]
  
  var rotateG: IUniform[Any]
  
  var rotateR: IUniform[Any]
  
  var scatter: IUniform[Any]
  
  var shape: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var width: IUniform[Any]
}
object Blending {
  
  inline def apply(
    blending: IUniform[Any],
    blendingMode: IUniform[Any],
    disable: IUniform[Any],
    greyscale: IUniform[Any],
    height: IUniform[Any],
    radius: IUniform[Any],
    rotateB: IUniform[Any],
    rotateG: IUniform[Any],
    rotateR: IUniform[Any],
    scatter: IUniform[Any],
    shape: IUniform[Any],
    tDiffuse: IUniform[Any],
    width: IUniform[Any]
  ): Blending = {
    val __obj = js.Dynamic.literal(blending = blending.asInstanceOf[js.Any], blendingMode = blendingMode.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], greyscale = greyscale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotateB = rotateB.asInstanceOf[js.Any], rotateG = rotateG.asInstanceOf[js.Any], rotateR = rotateR.asInstanceOf[js.Any], scatter = scatter.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blending]
  }
  
  extension [Self <: Blending](x: Self) {
    
    inline def setBlending(value: IUniform[Any]): Self = StObject.set(x, "blending", value.asInstanceOf[js.Any])
    
    inline def setBlendingMode(value: IUniform[Any]): Self = StObject.set(x, "blendingMode", value.asInstanceOf[js.Any])
    
    inline def setDisable(value: IUniform[Any]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setGreyscale(value: IUniform[Any]): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: IUniform[Any]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: IUniform[Any]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRotateB(value: IUniform[Any]): Self = StObject.set(x, "rotateB", value.asInstanceOf[js.Any])
    
    inline def setRotateG(value: IUniform[Any]): Self = StObject.set(x, "rotateG", value.asInstanceOf[js.Any])
    
    inline def setRotateR(value: IUniform[Any]): Self = StObject.set(x, "rotateR", value.asInstanceOf[js.Any])
    
    inline def setScatter(value: IUniform[Any]): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
    
    inline def setShape(value: IUniform[Any]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: IUniform[Any]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
