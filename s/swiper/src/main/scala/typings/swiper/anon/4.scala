package typings.swiper.anon

import typings.swiper.typesModulesAutoplayMod.AutoplayOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[AutoplayOptions | Boolean]
}
object `4` {
  
  inline def apply(default: Unit, `type`: PropType[AutoplayOptions | Boolean]): `4` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[AutoplayOptions | Boolean]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => AutoplayOptions | Boolean): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[AutoplayOptions | Boolean])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
