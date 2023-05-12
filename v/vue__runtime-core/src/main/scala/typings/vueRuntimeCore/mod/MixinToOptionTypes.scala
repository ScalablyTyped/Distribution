package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends @vue/runtime-core.@vue/runtime-core.ComponentOptionsBase<infer P, infer B, infer D, infer C, infer M, infer Mixin, infer Extends, any, any, infer Defaults, any, any, any> ? @vue/runtime-core.@vue/runtime-core.OptionTypesType<P & {}, B & {}, D & {}, C & {}, M & {}, Defaults & {}> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<Mixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<Extends> : never
  }}}
  */
@js.native
trait MixinToOptionTypes[T] extends StObject
