package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof TEventsCausingDelays ]:? xstate.xstate/lib/types.DelayConfig<TContext, xstate.xstate/lib/types.Cast<xstate.xstate/lib/types.Prop<TIndexedEvents, TEventsCausingDelays[K]>, xstate.xstate/lib/types.EventObject>>}
  }}}
  */
@js.native
trait MachineOptionsDelays[TContext, TResolvedTypesMeta, TEventsCausingDelays, TIndexedEvents] extends StObject
