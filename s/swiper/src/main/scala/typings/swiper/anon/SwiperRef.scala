package typings.swiper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwiperRef extends StObject {
  
  var swiperRef: Required
  
  var tag: Type
  
  var virtualIndex: `26`
  
  var zoom: DefaultUndefined
}
object SwiperRef {
  
  inline def apply(swiperRef: Required, tag: Type, virtualIndex: `26`, zoom: DefaultUndefined): SwiperRef = {
    val __obj = js.Dynamic.literal(swiperRef = swiperRef.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], virtualIndex = virtualIndex.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwiperRef]
  }
  
  extension [Self <: SwiperRef](x: Self) {
    
    inline def setSwiperRef(value: Required): Self = StObject.set(x, "swiperRef", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Type): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setVirtualIndex(value: `26`): Self = StObject.set(x, "virtualIndex", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: DefaultUndefined): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
