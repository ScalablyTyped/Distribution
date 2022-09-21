package typings.swiper.anon

import typings.std.NumberConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var default: Unit
  
  var `type`: StringConstructor | NumberConstructor
}
object `25` {
  
  inline def apply(default: Unit, `type`: StringConstructor | NumberConstructor): `25` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor | NumberConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
