package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reasons extends StObject {
  
  var reasons: js.UndefOr[js.Array[String]] = js.undefined
  
  var unreliable: Boolean
}
object Reasons {
  
  inline def apply(unreliable: Boolean): Reasons = {
    val __obj = js.Dynamic.literal(unreliable = unreliable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reasons]
  }
  
  extension [Self <: Reasons](x: Self) {
    
    inline def setReasons(value: js.Array[String]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setReasonsVarargs(value: String*): Self = StObject.set(x, "reasons", js.Array(value :_*))
    
    inline def setUnreliable(value: Boolean): Self = StObject.set(x, "unreliable", value.asInstanceOf[js.Any])
  }
}
