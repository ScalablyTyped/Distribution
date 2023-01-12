package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`0`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`1`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`2`
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.altKey
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.ctrlKey
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.shiftKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragRouteOptions extends StObject {
  
  var snapKey: js.UndefOr[shiftKey | ctrlKey | altKey] = js.undefined
  
  var snapMode: js.UndefOr[`0` | `1` | `2`] = js.undefined
  
  var viaPointModifierKey: js.UndefOr[altKey | ctrlKey | shiftKey] = js.undefined
}
object DragRouteOptions {
  
  inline def apply(): DragRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragRouteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragRouteOptions] (val x: Self) extends AnyVal {
    
    inline def setSnapKey(value: shiftKey | ctrlKey | altKey): Self = StObject.set(x, "snapKey", value.asInstanceOf[js.Any])
    
    inline def setSnapKeyUndefined: Self = StObject.set(x, "snapKey", js.undefined)
    
    inline def setSnapMode(value: `0` | `1` | `2`): Self = StObject.set(x, "snapMode", value.asInstanceOf[js.Any])
    
    inline def setSnapModeUndefined: Self = StObject.set(x, "snapMode", js.undefined)
    
    inline def setViaPointModifierKey(value: altKey | ctrlKey | shiftKey): Self = StObject.set(x, "viaPointModifierKey", value.asInstanceOf[js.Any])
    
    inline def setViaPointModifierKeyUndefined: Self = StObject.set(x, "viaPointModifierKey", js.undefined)
  }
}
