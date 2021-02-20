package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateSchema[TC] extends StObject {
  
  var context: js.UndefOr[Partial[TC]] = js.native
  
  var meta: js.UndefOr[js.Any] = js.native
  
  var states: js.UndefOr[StringDictionary[StateSchema[TC]]] = js.native
}
object StateSchema {
  
  @scala.inline
  def apply[TC](): StateSchema[TC] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateSchema[TC]]
  }
  
  @scala.inline
  implicit class StateSchemaMutableBuilder[Self <: StateSchema[_], TC] (val x: Self with StateSchema[TC]) extends AnyVal {
    
    @scala.inline
    def setContext(value: Partial[TC]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setStates(value: StringDictionary[StateSchema[TC]]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
  }
}
