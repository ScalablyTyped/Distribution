package typings.swiper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lazy extends StObject {
  
  var `lazy`: TypeBooleanConstructor
  
  var swiperRef: Required
  
  var tag: Default
  
  var virtualIndex: `25`
  
  var zoom: DefaultType
}
object Lazy {
  
  inline def apply(
    `lazy`: TypeBooleanConstructor,
    swiperRef: Required,
    tag: Default,
    virtualIndex: `25`,
    zoom: DefaultType
  ): Lazy = {
    val __obj = js.Dynamic.literal(swiperRef = swiperRef.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], virtualIndex = virtualIndex.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lazy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lazy] (val x: Self) extends AnyVal {
    
    inline def setLazy(value: TypeBooleanConstructor): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setSwiperRef(value: Required): Self = StObject.set(x, "swiperRef", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Default): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setVirtualIndex(value: `25`): Self = StObject.set(x, "virtualIndex", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: DefaultType): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
