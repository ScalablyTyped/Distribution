package typings.swiper.anon

import typings.swiper.swiperStrings.container
import typings.swiper.swiperStrings.wrapper
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultUndefinedTypePropType extends StObject {
  
  var default: Unit
  
  var `type`: PropType[js.UndefOr[container | wrapper]]
}
object DefaultUndefinedTypePropType {
  
  inline def apply(default: Unit, `type`: PropType[js.UndefOr[container | wrapper]]): DefaultUndefinedTypePropType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefinedTypePropType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultUndefinedTypePropType] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[js.UndefOr[container | wrapper]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => js.UndefOr[container | wrapper]): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[js.UndefOr[container | wrapper]])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
