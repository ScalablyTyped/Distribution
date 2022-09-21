package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Damp extends StObject {
  
  var damp: IUniform[Any]
  
  var tNew: IUniform[Any]
  
  var tOld: IUniform[Any]
}
object Damp {
  
  inline def apply(damp: IUniform[Any], tNew: IUniform[Any], tOld: IUniform[Any]): Damp = {
    val __obj = js.Dynamic.literal(damp = damp.asInstanceOf[js.Any], tNew = tNew.asInstanceOf[js.Any], tOld = tOld.asInstanceOf[js.Any])
    __obj.asInstanceOf[Damp]
  }
  
  extension [Self <: Damp](x: Self) {
    
    inline def setDamp(value: IUniform[Any]): Self = StObject.set(x, "damp", value.asInstanceOf[js.Any])
    
    inline def setTNew(value: IUniform[Any]): Self = StObject.set(x, "tNew", value.asInstanceOf[js.Any])
    
    inline def setTOld(value: IUniform[Any]): Self = StObject.set(x, "tOld", value.asInstanceOf[js.Any])
  }
}
