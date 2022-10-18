package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sides extends StObject {
  
  var angle: IUniform[Any]
  
  var sides: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object Sides {
  
  inline def apply(angle: IUniform[Any], sides: IUniform[Any], tDiffuse: IUniform[Any]): Sides = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sides]
  }
  
  extension [Self <: Sides](x: Self) {
    
    inline def setAngle(value: IUniform[Any]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setSides(value: IUniform[Any]): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
