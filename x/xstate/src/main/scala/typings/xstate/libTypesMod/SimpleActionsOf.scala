package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extracts action objects that have no extra properties.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  xstate.xstate/lib/types.ActionObject<any, any> extends T ? T : xstate.xstate/lib/types.ExtractWithSimpleSupport<T>
  }}}
  */
@js.native
trait SimpleActionsOf[T /* <: BaseActionObject */] extends StObject
