package typings.swiper.anon

import typings.swiper.swiperStrings.cards
import typings.swiper.swiperStrings.coverflow
import typings.swiper.swiperStrings.creative
import typings.swiper.swiperStrings.cube
import typings.swiper.swiperStrings.fade
import typings.swiper.swiperStrings.flip
import typings.swiper.swiperStrings.slide
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultUndefinedTypePropType extends StObject {
  
  var default: Unit
  
  var `type`: PropType[js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards]]
}
object DefaultUndefinedTypePropType {
  
  inline def apply(
    default: Unit,
    `type`: PropType[js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards]]
  ): DefaultUndefinedTypePropType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefinedTypePropType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultUndefinedTypePropType] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards]): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: (PropConstructor[js.UndefOr[slide | fade | cube | coverflow | flip | creative | cards]])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
