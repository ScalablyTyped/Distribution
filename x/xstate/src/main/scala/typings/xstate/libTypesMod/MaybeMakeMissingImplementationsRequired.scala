package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  TRequireMissingImplementations extends true ? xstate.xstate/lib/types.IsNever<TMissingImplementationsForType> extends true ? {} : {[ K in xstate.xstate/lib/types.Cast<TImplementationType, string> ]: xstate.xstate/lib/types.MakeKeysRequired<xstate.xstate/lib/types.Cast<TMissingImplementationsForType, string>>} : {}
  }}}
  */
@js.native
trait MaybeMakeMissingImplementationsRequired[TImplementationType, TMissingImplementationsForType, TRequireMissingImplementations] extends StObject
