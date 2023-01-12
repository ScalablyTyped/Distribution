package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  var angle: IUniform[Any]
  
  var center: IUniform[Any]
  
  var scale: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
  
  var tSize: IUniform[Any]
}
object Angle {
  
  inline def apply(
    angle: IUniform[Any],
    center: IUniform[Any],
    scale: IUniform[Any],
    tDiffuse: IUniform[Any],
    tSize: IUniform[Any]
  ): Angle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any], tSize = tSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Angle] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: IUniform[Any]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: IUniform[Any]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setScale(value: IUniform[Any]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
    
    inline def setTSize(value: IUniform[Any]): Self = StObject.set(x, "tSize", value.asInstanceOf[js.Any])
  }
}
