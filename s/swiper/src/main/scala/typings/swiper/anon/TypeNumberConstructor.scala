package typings.swiper.anon

import typings.std.NumberConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeNumberConstructor extends StObject {
  
  var default: Unit
  
  var `type`: NumberConstructor
}
object TypeNumberConstructor {
  
  inline def apply(default: Unit, `type`: NumberConstructor): TypeNumberConstructor = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeNumberConstructor]
  }
  
  extension [Self <: TypeNumberConstructor](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: NumberConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
