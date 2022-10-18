package typings.xstate.libTypesMod

import typings.xstate.xstateStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  xstate.xstate/lib/types.IsNever<K> extends true ? TEvent : xstate.xstate/lib/types.ExtractEvent<TEvent, K>
  }}}
  */
@js.native
trait EventFrom[T, K /* <: Prop[TEvent, `type`] */, TEvent /* <: EventObject */] extends StObject
