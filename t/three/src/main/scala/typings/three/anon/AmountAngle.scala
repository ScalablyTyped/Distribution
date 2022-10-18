package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountAngle extends StObject {
  
  var amount: IUniform[Any]
  
  var angle: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object AmountAngle {
  
  inline def apply(amount: IUniform[Any], angle: IUniform[Any], tDiffuse: IUniform[Any]): AmountAngle = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountAngle]
  }
  
  extension [Self <: AmountAngle](x: Self) {
    
    inline def setAmount(value: IUniform[Any]): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAngle(value: IUniform[Any]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
