package typings.swiper.anon

import typings.swiper.swiperBooleans.`false`
import typings.swiper.typesMod.Swiper
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var required: `false`
  
  var `type`: PropType[Swiper]
}
object Required {
  
  inline def apply(`type`: PropType[Swiper]): Required = {
    val __obj = js.Dynamic.literal(required = false)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  
  extension [Self <: Required](x: Self) {
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[Swiper]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => Swiper): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: PropConstructor[Swiper]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
