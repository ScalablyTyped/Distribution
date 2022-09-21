package typings.swiper.anon

import typings.swiper.swiperStrings.auto
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[js.UndefOr[Double | auto]]
}
object `1` {
  
  inline def apply(default: Unit, `type`: PropType[js.UndefOr[Double | auto]]): `1` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[js.UndefOr[Double | auto]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => js.UndefOr[Double | auto]): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[js.UndefOr[Double | auto]])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
