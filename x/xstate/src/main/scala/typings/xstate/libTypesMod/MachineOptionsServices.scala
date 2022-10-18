package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof TEventsCausingServices ]:? xstate.xstate/lib/types.AnyStateMachine | xstate.xstate/lib/types.InvokeCreator<TContext, xstate.xstate/lib/types.Cast<xstate.xstate/lib/types.Prop<TIndexedEvents, TEventsCausingServices[K]>, xstate.xstate/lib/types.EventObject>, xstate.xstate/lib/types.Prop<xstate.xstate/lib/types.Prop<TIndexedEvents, xstate.xstate/lib/types.Prop<TInvokeSrcNameMap, K>>, 'data'>, xstate.xstate/lib/types.EventObject, xstate.xstate/lib/types.Cast<TIndexedEvents[keyof TIndexedEvents], xstate.xstate/lib/types.EventObject>>}
  }}}
  */
@js.native
trait MachineOptionsServices[TContext, TResolvedTypesMeta, TEventsCausingServices, TIndexedEvents, TInvokeSrcNameMap] extends StObject
