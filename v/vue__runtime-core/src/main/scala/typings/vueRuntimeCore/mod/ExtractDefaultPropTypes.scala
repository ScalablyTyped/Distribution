package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  O extends object ? {[ K in keyof std.Pick<O, @vue/runtime-core.@vue/runtime-core.DefaultKeys<O>> ]: @vue/runtime-core.@vue/runtime-core.InferPropType<O[K]>} : {}
  }}}
  */
@js.native
trait ExtractDefaultPropTypes[O] extends StObject
