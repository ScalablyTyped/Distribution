package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends std.Array<string> ? {[ K in T[number] ]:? unknown} : T extends @vue/runtime-core.@vue/runtime-core.ObjectInjectOptions ? {[ K in keyof T ]:? unknown} : never
  }}}
  */
@js.native
trait InjectToObject[T /* <: ComponentInjectOptions */] extends StObject
