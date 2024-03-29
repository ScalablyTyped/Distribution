package typings.xstate.anon

import typings.std.Record
import typings.xstate.libTypesMod.ActivityConfig
import typings.xstate.libTypesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activities[TContext, TEvent /* <: EventObject */] extends StObject {
  
  /**
    * @deprecated Use `services` instead.
    */
  var activities: js.UndefOr[Record[String, ActivityConfig[TContext, TEvent]]] = js.undefined
}
object Activities {
  
  inline def apply[TContext, TEvent /* <: EventObject */](): Activities[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activities[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Activities[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (Activities[TContext, TEvent])) extends AnyVal {
    
    inline def setActivities(value: Record[String, ActivityConfig[TContext, TEvent]]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
  }
}
