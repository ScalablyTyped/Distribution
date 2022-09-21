package typings.xstate.anon

import typings.xstate.typegenTypesMod.AllImplementationsProvided
import typings.xstate.typegenTypesMod.AllowAllEvents
import typings.xstate.typegenTypesMod.TypegenConstraint
import typings.xstate.typegenTypesMod.TypegenDisabled
import typings.xstate.typesMod.BaseActionObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.ServiceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled[TTypesMeta /* <: TypegenConstraint */, TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */] extends StObject {
  
  var disabled: TypegenDisabled & AllImplementationsProvided & AllowAllEvents & (IndexedEvents[TAction, TEvent])
  
  var enabled: TTypesMeta & (IndexedActions[TAction, TEvent, TServiceMap, TTypesMeta])
}
object Disabled {
  
  inline def apply[TTypesMeta /* <: TypegenConstraint */, TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */](
    disabled: TypegenDisabled & AllImplementationsProvided & AllowAllEvents & (IndexedEvents[TAction, TEvent]),
    enabled: TTypesMeta & (IndexedActions[TAction, TEvent, TServiceMap, TTypesMeta])
  ): Disabled[TTypesMeta, TAction, TEvent, TServiceMap] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled[TTypesMeta, TAction, TEvent, TServiceMap]]
  }
  
  extension [Self <: Disabled[?, ?, ?, ?], TTypesMeta /* <: TypegenConstraint */, TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */](x: Self & (Disabled[TTypesMeta, TAction, TEvent, TServiceMap])) {
    
    inline def setDisabled(
      value: TypegenDisabled & AllImplementationsProvided & AllowAllEvents & (IndexedEvents[TAction, TEvent])
    ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: TTypesMeta & (IndexedActions[TAction, TEvent, TServiceMap, TTypesMeta])): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
