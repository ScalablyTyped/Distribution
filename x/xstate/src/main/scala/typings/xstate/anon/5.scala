package typings.xstate.anon

import typings.xstate.typesMod.MachineOptionsActions
import typings.xstate.typesMod.Prop
import typings.xstate.xstateStrings.eventsCausingActions
import typings.xstate.xstateStrings.indexedActions
import typings.xstate.xstateStrings.indexedEvents
import typings.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[TContext, TResolvedTypesMeta] extends StObject {
  
  var actions: js.UndefOr[
    MachineOptionsActions[
      TContext, 
      TResolvedTypesMeta, 
      Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingActions], 
      Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents], 
      Prop[Prop[TResolvedTypesMeta, resolved], indexedActions]
    ]
  ] = js.undefined
}
object `5` {
  
  inline def apply[TContext, TResolvedTypesMeta](): `5`[TContext, TResolvedTypesMeta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[TContext, TResolvedTypesMeta]]
  }
  
  extension [Self <: `5`[?, ?], TContext, TResolvedTypesMeta](x: Self & (`5`[TContext, TResolvedTypesMeta])) {
    
    inline def setActions(
      value: MachineOptionsActions[
          TContext, 
          TResolvedTypesMeta, 
          Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingActions], 
          Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents], 
          Prop[Prop[TResolvedTypesMeta, resolved], indexedActions]
        ]
    ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
  }
}
