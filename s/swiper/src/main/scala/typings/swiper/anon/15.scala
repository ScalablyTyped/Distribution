package typings.swiper.anon

import typings.swiper.typesModulesMousewheelMod.MousewheelOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[MousewheelOptions | Boolean]
}
object `15` {
  
  inline def apply(default: Unit, `type`: PropType[MousewheelOptions | Boolean]): `15` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `15`] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[MousewheelOptions | Boolean]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => MousewheelOptions | Boolean): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[MousewheelOptions | Boolean])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
