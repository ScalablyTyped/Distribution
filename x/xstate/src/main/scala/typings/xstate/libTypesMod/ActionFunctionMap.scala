package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in TAction['type'] ]:? xstate.xstate/lib/types.ActionObject<TContext, TEvent, TEvent, xstate.xstate/lib/types.BaseActionObject> | xstate.xstate/lib/types.ActionFunction<TContext, TEvent, TAction extends {  type :K}? TAction : never, TEvent>}
  }}}
  */
@js.native
trait ActionFunctionMap[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] extends StObject
