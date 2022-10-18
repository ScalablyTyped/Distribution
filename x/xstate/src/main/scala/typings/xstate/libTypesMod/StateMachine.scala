package typings.xstate.libTypesMod

import typings.xstate.libStateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateMachine[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TAction /* <: BaseActionObject */, TServiceMap /* <: ServiceMap */, TResolvedTypesMeta] extends StateNode[TContext, TStateSchema, TEvent, TTypestate, TServiceMap, TResolvedTypesMeta] {
  
  /** @deprecated an internal property acting as a "phantom" type, not meant to be used at runtime */
  var __TAction: TAction = js.native
  
  /** @deprecated an internal property acting as a "phantom" type, not meant to be used at runtime */
  var __TContext: TContext = js.native
  
  /** @deprecated an internal property acting as a "phantom" type, not meant to be used at runtime */
  var __TEvent: TEvent = js.native
  
  /** @deprecated an internal property acting as a "phantom" type, not meant to be used at runtime */
  var __TResolvedTypesMeta: TResolvedTypesMeta = js.native
  
  /** @deprecated an internal property acting as a "phantom" type, not meant to be used at runtime */
  var __TServiceMap: TServiceMap = js.native
  
  /** @deprecated an internal property acting as a "phantom" type, not meant to be used at runtime */
  var __TStateSchema: TStateSchema = js.native
  
  /** @deprecated an internal property acting as a "phantom" type, not meant to be used at runtime */
  var __TTypestate: TTypestate = js.native
}
