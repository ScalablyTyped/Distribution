package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reasons extends StObject {
  
  var reasons: js.Array[ModuleType]
}
object Reasons {
  
  inline def apply(reasons: js.Array[ModuleType]): Reasons = {
    val __obj = js.Dynamic.literal(reasons = reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reasons]
  }
  
  extension [Self <: Reasons](x: Self) {
    
    inline def setReasons(value: js.Array[ModuleType]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsVarargs(value: ModuleType*): Self = StObject.set(x, "reasons", js.Array(value :_*))
  }
}
