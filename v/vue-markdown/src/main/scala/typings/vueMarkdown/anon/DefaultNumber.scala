package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultNumber extends StObject {
  
  var default: Double
  
  var `type`: scala.Any
}
object DefaultNumber {
  
  inline def apply(default: Double, `type`: scala.Any): DefaultNumber = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultNumber] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: scala.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
