package typings.xstate.typesMod

import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActorRefWithDeprecatedState[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TResolvedTypesMeta]
  extends StObject
     with ActorRef[TEvent, State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta]] {
  
  /**
    * @deprecated Use `.getSnapshot()` instead.
    */
  var state: State[TContext, TEvent, Any, TTypestate, TResolvedTypesMeta] = js.native
}
