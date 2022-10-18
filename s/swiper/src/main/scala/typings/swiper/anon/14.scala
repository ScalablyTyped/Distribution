package typings.swiper.anon

import typings.swiper.typesModulesKeyboardMod.KeyboardOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[KeyboardOptions | Boolean]
}
object `14` {
  
  inline def apply(default: Unit, `type`: PropType[KeyboardOptions | Boolean]): `14` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[KeyboardOptions | Boolean]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => KeyboardOptions | Boolean): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[KeyboardOptions | Boolean])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
