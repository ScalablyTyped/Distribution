package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddRGB extends StObject {
  
  var addRGB: IUniform[Any]
  
  var mulRGB: IUniform[Any]
  
  var powRGB: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object AddRGB {
  
  inline def apply(addRGB: IUniform[Any], mulRGB: IUniform[Any], powRGB: IUniform[Any], tDiffuse: IUniform[Any]): AddRGB = {
    val __obj = js.Dynamic.literal(addRGB = addRGB.asInstanceOf[js.Any], mulRGB = mulRGB.asInstanceOf[js.Any], powRGB = powRGB.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRGB]
  }
  
  extension [Self <: AddRGB](x: Self) {
    
    inline def setAddRGB(value: IUniform[Any]): Self = StObject.set(x, "addRGB", value.asInstanceOf[js.Any])
    
    inline def setMulRGB(value: IUniform[Any]): Self = StObject.set(x, "mulRGB", value.asInstanceOf[js.Any])
    
    inline def setPowRGB(value: IUniform[Any]): Self = StObject.set(x, "powRGB", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
