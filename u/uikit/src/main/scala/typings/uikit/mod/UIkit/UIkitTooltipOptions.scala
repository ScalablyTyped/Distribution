package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitTooltipOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var cls: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double | Boolean] = js.undefined
  
  var pos: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object UIkitTooltipOptions {
  
  inline def apply(): UIkitTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitTooltipOptions]
  }
  
  extension [Self <: UIkitTooltipOptions](x: Self) {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setOffset(value: Double | Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
