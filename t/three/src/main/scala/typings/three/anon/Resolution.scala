package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolution extends StObject {
  
  var resolution: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object Resolution {
  
  inline def apply(resolution: IUniform[Any], tDiffuse: IUniform[Any]): Resolution = {
    val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolution]
  }
  
  extension [Self <: Resolution](x: Self) {
    
    inline def setResolution(value: IUniform[Any]): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
