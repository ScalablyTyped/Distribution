package typings.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  enabled :boolean | undefined} & @use-gesture/core.@use-gesture/core/dist/declarations/src/types/config.HoverConfig */
trait enabledbooleanundefinedHo extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If false, onMove or onHover handlers will also fire on touch devices.
    */
  var mouseOnly: js.UndefOr[Boolean] = js.undefined
}
object enabledbooleanundefinedHo {
  
  inline def apply(): enabledbooleanundefinedHo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[enabledbooleanundefinedHo]
  }
  
  extension [Self <: enabledbooleanundefinedHo](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMouseOnly(value: Boolean): Self = StObject.set(x, "mouseOnly", value.asInstanceOf[js.Any])
    
    inline def setMouseOnlyUndefined: Self = StObject.set(x, "mouseOnly", js.undefined)
  }
}
