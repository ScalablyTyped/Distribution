package typings.xstate.anon

import typings.xstate.libTypesMod.MachineOptionsActions
import typings.xstate.libTypesMod.Prop
import typings.xstate.xstateStrings.eventsCausingActions
import typings.xstate.xstateStrings.indexedActions
import typings.xstate.xstateStrings.indexedEvents
import typings.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[TContext, TResolvedTypesMeta] extends StObject {
  
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
object `1` {
  
  inline def apply[TContext, TResolvedTypesMeta](): `1`[TContext, TResolvedTypesMeta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[TContext, TResolvedTypesMeta]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`[?, ?], TContext, TResolvedTypesMeta] (val x: Self & (`1`[TContext, TResolvedTypesMeta])) extends AnyVal {
    
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
