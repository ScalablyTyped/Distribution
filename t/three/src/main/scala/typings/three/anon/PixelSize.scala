package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelSize extends StObject {
  
  var pixelSize: IUniform[Any]
  
  var resolution: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object PixelSize {
  
  inline def apply(pixelSize: IUniform[Any], resolution: IUniform[Any], tDiffuse: IUniform[Any]): PixelSize = {
    val __obj = js.Dynamic.literal(pixelSize = pixelSize.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PixelSize] (val x: Self) extends AnyVal {
    
    inline def setPixelSize(value: IUniform[Any]): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: IUniform[Any]): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
