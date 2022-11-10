package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends @vue/runtime-core.@vue/runtime-core.ComponentOptionsBase<infer P, // Props
any, // RawBindings
any, // D
any, // C
any, // M
any, // Mixin
any, // Extends
any, string, {}, {}, string> ? unknown extends P ? {} : P : {}
  }}}
  */
@js.native
trait ExtractOptionProp[T] extends StObject
