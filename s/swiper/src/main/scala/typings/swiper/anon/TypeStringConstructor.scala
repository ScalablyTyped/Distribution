package typings.swiper.anon

import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeStringConstructor extends StObject {
  
  var default: Unit
  
  var `type`: StringConstructor
}
object TypeStringConstructor {
  
  inline def apply(default: Unit, `type`: StringConstructor): TypeStringConstructor = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeStringConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeStringConstructor] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
