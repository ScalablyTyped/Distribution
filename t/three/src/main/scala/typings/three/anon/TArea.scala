package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TArea extends StObject {
  
  var resolution: IUniform[Any]
  
  var tArea: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var tSearch: IUniform[Any]
}
object TArea {
  
  inline def apply(resolution: IUniform[Any], tArea: IUniform[Any], tDiffuse: IUniform[Any], tSearch: IUniform[Any]): TArea = {
    val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any], tArea = tArea.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], tSearch = tSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TArea] (val x: Self) extends AnyVal {
    
    inline def setResolution(value: IUniform[Any]): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setTArea(value: IUniform[Any]): Self = StObject.set(x, "tArea", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setTSearch(value: IUniform[Any]): Self = StObject.set(x, "tSearch", value.asInstanceOf[js.Any])
  }
}
