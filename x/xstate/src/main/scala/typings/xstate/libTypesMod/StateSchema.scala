package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateSchema[TC] extends StObject {
  
  var context: js.UndefOr[Partial[TC]] = js.undefined
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var states: js.UndefOr[StringDictionary[StateSchema[TC]]] = js.undefined
}
object StateSchema {
  
  inline def apply[TC](): StateSchema[TC] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateSchema[TC]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateSchema[?], TC] (val x: Self & StateSchema[TC]) extends AnyVal {
    
    inline def setContext(value: Partial[TC]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setStates(value: StringDictionary[StateSchema[TC]]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
  }
}
