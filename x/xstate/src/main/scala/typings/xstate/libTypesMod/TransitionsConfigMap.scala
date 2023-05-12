package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in TEvent['type'] | '' | '*' ]:? K extends '' | '*'? xstate.xstate/lib/types.TransitionConfigOrTarget<TContext, TEvent, TEvent> : xstate.xstate/lib/types.TransitionConfigOrTarget<TContext, xstate.xstate/lib/types.ExtractEvent<TEvent, K>, TEvent>}
  }}}
  */
@js.native
trait TransitionsConfigMap[TContext, TEvent /* <: EventObject */] extends StObject
