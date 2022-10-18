package typings.swiper.anon

import typings.swiper.typesModulesA11yMod.A11yOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[A11yOptions | Boolean]
}
object `3` {
  
  inline def apply(default: Unit, `type`: PropType[A11yOptions | Boolean]): `3` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[A11yOptions | Boolean]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => A11yOptions | Boolean): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[A11yOptions | Boolean])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
