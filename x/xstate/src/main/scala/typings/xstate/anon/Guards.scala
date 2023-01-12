package typings.xstate.anon

import typings.xstate.libTypesMod.MachineOptionsGuards
import typings.xstate.libTypesMod.Prop
import typings.xstate.xstateStrings.eventsCausingGuards
import typings.xstate.xstateStrings.indexedEvents
import typings.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Guards[TContext, TResolvedTypesMeta] extends StObject {
  
  var guards: js.UndefOr[
    MachineOptionsGuards[
      TContext, 
      TResolvedTypesMeta, 
      Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingGuards], 
      Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents]
    ]
  ] = js.undefined
}
object Guards {
  
  inline def apply[TContext, TResolvedTypesMeta](): Guards[TContext, TResolvedTypesMeta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Guards[TContext, TResolvedTypesMeta]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Guards[?, ?], TContext, TResolvedTypesMeta] (val x: Self & (Guards[TContext, TResolvedTypesMeta])) extends AnyVal {
    
    inline def setGuards(
      value: MachineOptionsGuards[
          TContext, 
          TResolvedTypesMeta, 
          Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingGuards], 
          Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents]
        ]
    ): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
    
    inline def setGuardsUndefined: Self = StObject.set(x, "guards", js.undefined)
  }
}
