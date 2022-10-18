package typings.xstate.anon

import typings.xstate.libTypesMod.MachineOptionsServices
import typings.xstate.libTypesMod.Prop
import typings.xstate.xstateStrings.eventsCausingServices
import typings.xstate.xstateStrings.indexedEvents
import typings.xstate.xstateStrings.invokeSrcNameMap
import typings.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Services[TContext, TResolvedTypesMeta] extends StObject {
  
  var services: js.UndefOr[
    MachineOptionsServices[
      TContext, 
      TResolvedTypesMeta, 
      Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingServices], 
      Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents], 
      Prop[Prop[TResolvedTypesMeta, resolved], invokeSrcNameMap]
    ]
  ] = js.undefined
}
object Services {
  
  inline def apply[TContext, TResolvedTypesMeta](): Services[TContext, TResolvedTypesMeta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Services[TContext, TResolvedTypesMeta]]
  }
  
  extension [Self <: Services[?, ?], TContext, TResolvedTypesMeta](x: Self & (Services[TContext, TResolvedTypesMeta])) {
    
    inline def setServices(
      value: MachineOptionsServices[
          TContext, 
          TResolvedTypesMeta, 
          Prop[Prop[TResolvedTypesMeta, resolved], eventsCausingServices], 
          Prop[Prop[TResolvedTypesMeta, resolved], indexedEvents], 
          Prop[Prop[TResolvedTypesMeta, resolved], invokeSrcNameMap]
        ]
    ): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
  }
}
