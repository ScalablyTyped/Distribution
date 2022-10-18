package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  xstate.xstate/lib/types.StateFrom<TMachine>['matches'] extends xstate.xstate/lib/types.Matches<infer TypegenEnabledArg, infer TypegenDisabledArg> ? TMachine['__TResolvedTypesMeta'] extends xstate.xstate/lib/typegenTypes.TypegenEnabled ? TypegenEnabledArg : TypegenDisabledArg : never
  }}}
  */
@js.native
trait StateValueFrom[TMachine /* <: AnyStateMachine */] extends StObject
