package typings.swiper.anon

import typings.swiper.typesModulesEffectCreativeMod.CreativeEffectOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[CreativeEffectOptions]
}
object `10` {
  
  inline def apply(default: Unit, `type`: PropType[CreativeEffectOptions]): `10` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[CreativeEffectOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => CreativeEffectOptions): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: PropConstructor[CreativeEffectOptions]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
