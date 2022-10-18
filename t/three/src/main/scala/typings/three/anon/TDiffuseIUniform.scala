package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TDiffuseIUniform extends StObject {
  
  var tDiffuse: IUniform[Any]
}
object TDiffuseIUniform {
  
  inline def apply(tDiffuse: IUniform[Any]): TDiffuseIUniform = {
    val __obj = js.Dynamic.literal(tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDiffuseIUniform]
  }
  
  extension [Self <: TDiffuseIUniform](x: Self) {
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
