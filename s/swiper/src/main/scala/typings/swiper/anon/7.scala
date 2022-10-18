package typings.swiper.anon

import typings.swiper.typesModulesEffectCubeMod.CubeEffectOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[CubeEffectOptions]
}
object `7` {
  
  inline def apply(default: Unit, `type`: PropType[CubeEffectOptions]): `7` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[CubeEffectOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => CubeEffectOptions): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: PropConstructor[CubeEffectOptions]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
