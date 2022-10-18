package typings.swiper.anon

import typings.swiper.typesModulesHashNavigationMod.HashNavigationOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[HashNavigationOptions | Boolean]
}
object `12` {
  
  inline def apply(default: Unit, `type`: PropType[HashNavigationOptions | Boolean]): `12` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[HashNavigationOptions | Boolean]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => HashNavigationOptions | Boolean): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[HashNavigationOptions | Boolean])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
