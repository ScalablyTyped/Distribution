package typings.xstate.anon

import typings.xstate.libTypesMod.MachineOptionsDelays
import typings.xstate.libTypesMod.Prop
import typings.xstate.xstateStrings.eventsCausingDelays
import typings.xstate.xstateStrings.indexedEvents
import typings.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[TContext, TResolvedTypesMeta] extends StObject {
  
  var delays: js.UndefOr[
    MachineOptionsDelays[
      TContext, 
      TResolvedTypesMeta, 
      Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingDelays], 
      Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents]
    ]
  ] = js.undefined
}
object `2` {
  
  inline def apply[TContext, TResolvedTypesMeta](): `2`[TContext, TResolvedTypesMeta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[TContext, TResolvedTypesMeta]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`[?, ?], TContext, TResolvedTypesMeta] (val x: Self & (`2`[TContext, TResolvedTypesMeta])) extends AnyVal {
    
    inline def setDelays(
      value: MachineOptionsDelays[
          TContext, 
          TResolvedTypesMeta, 
          Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingDelays], 
          Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents]
        ]
    ): Self = StObject.set(x, "delays", value.asInstanceOf[js.Any])
    
    inline def setDelaysUndefined: Self = StObject.set(x, "delays", js.undefined)
  }
}
