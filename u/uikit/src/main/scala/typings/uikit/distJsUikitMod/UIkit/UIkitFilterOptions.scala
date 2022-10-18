package typings.uikit.distJsUikitMod.UIkit

import typings.uikit.uikitBooleans.`false`
import typings.uikit.uikitStrings.`delayed-fade`
import typings.uikit.uikitStrings.fade
import typings.uikit.uikitStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitFilterOptions extends StObject {
  
  var animation: js.UndefOr[slide | fade | `delayed-fade` | `false`] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var selActive: js.UndefOr[String | Boolean] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object UIkitFilterOptions {
  
  inline def apply(): UIkitFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitFilterOptions]
  }
  
  extension [Self <: UIkitFilterOptions](x: Self) {
    
    inline def setAnimation(value: slide | fade | `delayed-fade` | `false`): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setSelActive(value: String | Boolean): Self = StObject.set(x, "selActive", value.asInstanceOf[js.Any])
    
    inline def setSelActiveUndefined: Self = StObject.set(x, "selActive", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
