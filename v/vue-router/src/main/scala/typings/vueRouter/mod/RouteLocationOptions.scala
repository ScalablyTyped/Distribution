package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteLocationOptions extends StObject {
  
  /**
    * Triggers the navigation even if the location is the same as the current one.
    * Note this will also add a new entry to the history unless `replace: true`
    * is passed.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Replace the entry in the history instead of pushing a new entry
    */
  var replace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * State to save using the History API. This cannot contain any reactive
    * values and some primitives like Symbols are forbidden. More info at
    * https://developer.mozilla.org/en-US/docs/Web/API/History/state
    */
  var state: js.UndefOr[HistoryState] = js.undefined
}
object RouteLocationOptions {
  
  inline def apply(): RouteLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteLocationOptions]
  }
  
  extension [Self <: RouteLocationOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setState(value: HistoryState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
