package typings.vuex.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSubscribersObject[P, S] extends StObject {
  
  var after: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
  
  var before: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
  
  var error: js.UndefOr[ActionErrorSubscriber[P, S]] = js.undefined
}
object ActionSubscribersObject {
  
  @scala.inline
  def apply[P, S](): ActionSubscribersObject[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSubscribersObject[P, S]]
  }
  
  @scala.inline
  implicit class ActionSubscribersObjectMutableBuilder[Self <: ActionSubscribersObject[?, ?], P, S] (val x: Self & (ActionSubscribersObject[P, S])) extends AnyVal {
    
    @scala.inline
    def setAfter(value: (P, S) => js.Any): Self = StObject.set(x, "after", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setBefore(value: (P, S) => js.Any): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setError(value: (P, S, /* error */ Error) => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
