package typings.swiper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  type CSSSelector = String
  
  trait SwiperModule extends StObject {
    
    var name: String
  }
  object SwiperModule {
    
    inline def apply(name: String): SwiperModule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwiperModule]
    }
    
    extension [Self <: SwiperModule](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
