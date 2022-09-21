package typings.tensorflowTfjsBackendCpu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reasons extends StObject {
  
  var reasons: js.Array[String]
  
  var unreliable: Boolean
}
object Reasons {
  
  inline def apply(reasons: js.Array[String], unreliable: Boolean): Reasons = {
    val __obj = js.Dynamic.literal(reasons = reasons.asInstanceOf[js.Any], unreliable = unreliable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reasons]
  }
  
  extension [Self <: Reasons](x: Self) {
    
    inline def setReasons(value: js.Array[String]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsVarargs(value: String*): Self = StObject.set(x, "reasons", js.Array(value*))
    
    inline def setUnreliable(value: Boolean): Self = StObject.set(x, "unreliable", value.asInstanceOf[js.Any])
  }
}
