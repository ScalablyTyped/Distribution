package typings.swiper.anon

import typings.swiper.typesModulesScrollbarMod.ScrollbarOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[ScrollbarOptions | Boolean]
}
object `19` {
  
  inline def apply(default: Unit, `type`: PropType[ScrollbarOptions | Boolean]): `19` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `19`] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[ScrollbarOptions | Boolean]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => ScrollbarOptions | Boolean): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[ScrollbarOptions | Boolean])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
