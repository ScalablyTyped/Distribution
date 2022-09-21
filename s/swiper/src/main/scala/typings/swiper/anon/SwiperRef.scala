package typings.swiper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwiperRef extends StObject {
  
  var swiperRef: Required
  
  var tag: Default
  
  var virtualIndex: `25`
  
  var zoom: DefaultType
}
object SwiperRef {
  
  inline def apply(swiperRef: Required, tag: Default, virtualIndex: `25`, zoom: DefaultType): SwiperRef = {
    val __obj = js.Dynamic.literal(swiperRef = swiperRef.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], virtualIndex = virtualIndex.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwiperRef]
  }
  
  extension [Self <: SwiperRef](x: Self) {
    
    inline def setSwiperRef(value: Required): Self = StObject.set(x, "swiperRef", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Default): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setVirtualIndex(value: `25`): Self = StObject.set(x, "virtualIndex", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: DefaultType): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
