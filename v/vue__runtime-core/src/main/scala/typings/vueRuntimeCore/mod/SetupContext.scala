package typings.vueRuntimeCore.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  E extends any ? {  attrs :@vue/runtime-core.@vue/runtime-core.Data,   slots :@vue/runtime-core.@vue/runtime-core.UnwrapSlotsType<S, std.NonNullable<S[symbol]>>,   emit :@vue/runtime-core.@vue/runtime-core.EmitFn<E, keyof E>, expose (): void, expose (exposed : std.Record<string, any>): void} : never
  }}}
  */
@js.native
trait SetupContext[E, S /* <: SlotsType[Record[String, Any]] */] extends StObject
