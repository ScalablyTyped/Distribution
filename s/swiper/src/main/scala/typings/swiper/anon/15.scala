package typings.swiper.anon

import typings.swiper.typesModulesLazyMod.LazyOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[LazyOptions | Boolean]
}
object `15` {
  
  inline def apply(default: Unit, `type`: PropType[LazyOptions | Boolean]): `15` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[LazyOptions | Boolean]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => LazyOptions | Boolean): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[LazyOptions | Boolean])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
