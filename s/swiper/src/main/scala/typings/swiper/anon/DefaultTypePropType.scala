package typings.swiper.anon

import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultTypePropType extends StObject {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  var `type`: PropType[js.UndefOr[Boolean]]
}
object DefaultTypePropType {
  
  inline def apply(`type`: PropType[js.UndefOr[Boolean]]): DefaultTypePropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTypePropType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultTypePropType] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setType(value: PropType[js.UndefOr[Boolean]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: PropConstructor[js.UndefOr[Boolean]]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
