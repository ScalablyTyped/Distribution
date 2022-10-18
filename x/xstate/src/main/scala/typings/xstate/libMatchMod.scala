package typings.xstate

import typings.xstate.anon.Context
import typings.xstate.libStateMod.State
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.StateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMatchMod {
  
  @JSImport("xstate/lib/match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchState[T, TContext, TEvent /* <: EventObject */](
    state: State[TContext, TEvent, Any, Context[TContext], TypegenDisabled],
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matchState")(state.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matchState[T, TContext, TEvent /* <: EventObject */](
    state: StateValue,
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matchState")(state.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type StatePatternTuple[T, TContext, TEvent /* <: EventObject */] = js.Tuple2[StateValue, ValueFromStateGetter[T, TContext, TEvent]]
  
  type ValueFromStateGetter[T, TContext, TEvent /* <: EventObject */] = js.Function1[/* state */ State[TContext, TEvent, Any, Context[TContext], TypegenDisabled], T]
}
