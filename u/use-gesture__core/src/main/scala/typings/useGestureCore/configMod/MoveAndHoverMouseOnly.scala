package typings.useGestureCore.configMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveAndHoverMouseOnly extends StObject {
  
  /**
    * If false, onMove or onHover handlers will also fire on touch devices.
    */
  var mouseOnly: js.UndefOr[Boolean] = js.undefined
}
object MoveAndHoverMouseOnly {
  
  inline def apply(): MoveAndHoverMouseOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveAndHoverMouseOnly]
  }
  
  extension [Self <: MoveAndHoverMouseOnly](x: Self) {
    
    inline def setMouseOnly(value: Boolean): Self = StObject.set(x, "mouseOnly", value.asInstanceOf[js.Any])
    
    inline def setMouseOnlyUndefined: Self = StObject.set(x, "mouseOnly", js.undefined)
  }
}
