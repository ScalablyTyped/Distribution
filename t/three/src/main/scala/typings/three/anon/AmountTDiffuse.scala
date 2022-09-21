package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountTDiffuse extends StObject {
  
  var amount: IUniform[Any]
  
  var tDiffuse: IUniform[Any]
}
object AmountTDiffuse {
  
  inline def apply(amount: IUniform[Any], tDiffuse: IUniform[Any]): AmountTDiffuse = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], tDiffuse = tDiffuse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountTDiffuse]
  }
  
  extension [Self <: AmountTDiffuse](x: Self) {
    
    inline def setAmount(value: IUniform[Any]): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setTDiffuse(value: IUniform[Any]): Self = StObject.set(x, "tDiffuse", value.asInstanceOf[js.Any])
  }
}
