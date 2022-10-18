package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends std.Function | @vue/reactivity.@vue/reactivity.CollectionTypes | @vue/reactivity.@vue/reactivity.BaseTypes | @vue/reactivity.@vue/reactivity.Ref<any> | @vue/reactivity.@vue/reactivity.RefUnwrapBailTypes[keyof @vue/reactivity.@vue/reactivity.RefUnwrapBailTypes] | {[RawSymbol] : true | undefined} ? T : T extends std.Array<any> ? {[ K in keyof T ]: @vue/reactivity.@vue/reactivity.UnwrapRefSimple<T[K]>} : T extends object & {[ShallowReactiveMarker] : never | undefined} ? {[ P in keyof T ]: P extends symbol? T[P] : @vue/reactivity.@vue/reactivity.UnwrapRef<T[P]>} : T
  }}}
  */
@js.native
trait UnwrapRefSimple[T] extends StObject
