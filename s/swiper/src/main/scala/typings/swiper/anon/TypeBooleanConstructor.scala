package typings.swiper.anon

import typings.std.BooleanConstructor
import typings.swiper.swiperBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeBooleanConstructor extends StObject {
  
  var default: `false`
  
  var `type`: BooleanConstructor
}
object TypeBooleanConstructor {
  
  inline def apply(`type`: BooleanConstructor): TypeBooleanConstructor = {
    val __obj = js.Dynamic.literal(default = false)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeBooleanConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeBooleanConstructor] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: `false`): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
