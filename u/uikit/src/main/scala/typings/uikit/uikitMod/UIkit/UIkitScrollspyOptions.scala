package typings.uikit.uikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitScrollspyOptions extends StObject {
  
  var cls: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var `offset-left`: js.UndefOr[Double] = js.undefined
  
  var `offset-top`: js.UndefOr[Double] = js.undefined
  
  var repeat: js.UndefOr[Boolean] = js.undefined
}
object UIkitScrollspyOptions {
  
  inline def apply(): UIkitScrollspyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitScrollspyOptions]
  }
  
  extension [Self <: UIkitScrollspyOptions](x: Self) {
    
    inline def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def `setOffset-left`(value: Double): Self = StObject.set(x, "offset-left", value.asInstanceOf[js.Any])
    
    inline def `setOffset-leftUndefined`: Self = StObject.set(x, "offset-left", js.undefined)
    
    inline def `setOffset-top`(value: Double): Self = StObject.set(x, "offset-top", value.asInstanceOf[js.Any])
    
    inline def `setOffset-topUndefined`: Self = StObject.set(x, "offset-top", js.undefined)
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
