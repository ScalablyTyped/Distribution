package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var onlyInViewport: js.UndefOr[Boolean] = js.undefined
}
object KeyboardOptions {
  
  inline def apply(): KeyboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardOptions]
  }
  
  extension [Self <: KeyboardOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOnlyInViewport(value: Boolean): Self = StObject.set(x, "onlyInViewport", value.asInstanceOf[js.Any])
    
    inline def setOnlyInViewportUndefined: Self = StObject.set(x, "onlyInViewport", js.undefined)
  }
}
