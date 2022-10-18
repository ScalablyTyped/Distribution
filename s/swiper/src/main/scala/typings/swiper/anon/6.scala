package typings.swiper.anon

import typings.swiper.typesModulesEffectCoverflowMod.CoverflowEffectOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[CoverflowEffectOptions]
}
object `6` {
  
  inline def apply(default: Unit, `type`: PropType[CoverflowEffectOptions]): `6` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[CoverflowEffectOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => CoverflowEffectOptions): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: PropConstructor[CoverflowEffectOptions]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
