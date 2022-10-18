package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  TEvent extends any ? TEventType extends TEvent['type'] ? TEvent : never : never
  }}}
  */
@js.native
trait ExtractEvent[TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] extends StObject
