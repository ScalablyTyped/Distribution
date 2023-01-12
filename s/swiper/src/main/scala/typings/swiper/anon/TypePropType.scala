package typings.swiper.anon

import typings.swiper.swiperStrings.horizontal
import typings.swiper.swiperStrings.vertical
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypePropType extends StObject {
  
  var default: js.UndefOr[horizontal | vertical] = js.undefined
  
  var `type`: PropType[js.UndefOr[horizontal | vertical]]
}
object TypePropType {
  
  inline def apply(`type`: PropType[js.UndefOr[horizontal | vertical]]): TypePropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePropType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypePropType] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: horizontal | vertical): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setType(value: PropType[js.UndefOr[horizontal | vertical]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => js.UndefOr[horizontal | vertical]): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[js.UndefOr[horizontal | vertical]])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
