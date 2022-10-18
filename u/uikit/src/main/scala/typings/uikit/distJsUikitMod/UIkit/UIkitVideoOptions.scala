package typings.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitVideoOptions extends StObject {
  
  var automute: js.UndefOr[Boolean] = js.undefined
  
  var autoplay: js.UndefOr[Boolean | String] = js.undefined
}
object UIkitVideoOptions {
  
  inline def apply(): UIkitVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitVideoOptions]
  }
  
  extension [Self <: UIkitVideoOptions](x: Self) {
    
    inline def setAutomute(value: Boolean): Self = StObject.set(x, "automute", value.asInstanceOf[js.Any])
    
    inline def setAutomuteUndefined: Self = StObject.set(x, "automute", js.undefined)
    
    inline def setAutoplay(value: Boolean | String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
  }
}
