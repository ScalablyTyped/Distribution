package typings.vueRuntimeCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultAny extends StObject {
  
  var default: Any
}
object DefaultAny {
  
  inline def apply(default: Any): DefaultAny = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultAny] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
