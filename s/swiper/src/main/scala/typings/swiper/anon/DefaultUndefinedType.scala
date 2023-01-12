package typings.swiper.anon

import typings.std.BooleanConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultUndefinedType extends StObject {
  
  var default: Unit
  
  var `type`: BooleanConstructor | StringConstructor
}
object DefaultUndefinedType {
  
  inline def apply(default: Unit, `type`: BooleanConstructor | StringConstructor): DefaultUndefinedType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefinedType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultUndefinedType] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: BooleanConstructor | StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
