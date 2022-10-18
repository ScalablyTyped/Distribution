package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends @vue/reactivity.@vue/reactivity.Builtin ? T : T extends std.Map<infer K, infer V> ? std.ReadonlyMap<@vue/reactivity.@vue/reactivity.DeepReadonly<K>, @vue/reactivity.@vue/reactivity.DeepReadonly<V>> : T extends std.ReadonlyMap<infer K, infer V> ? std.ReadonlyMap<@vue/reactivity.@vue/reactivity.DeepReadonly<K>, @vue/reactivity.@vue/reactivity.DeepReadonly<V>> : T extends std.WeakMap<infer K, infer V> ? std.WeakMap<@vue/reactivity.@vue/reactivity.DeepReadonly<K>, @vue/reactivity.@vue/reactivity.DeepReadonly<V>> : T extends std.Set<infer U> ? std.ReadonlySet<@vue/reactivity.@vue/reactivity.DeepReadonly<U>> : T extends std.ReadonlySet<infer U> ? std.ReadonlySet<@vue/reactivity.@vue/reactivity.DeepReadonly<U>> : T extends std.WeakSet<infer U> ? std.WeakSet<@vue/reactivity.@vue/reactivity.DeepReadonly<U>> : T extends std.Promise<infer U> ? std.Promise<@vue/reactivity.@vue/reactivity.DeepReadonly<U>> : T extends @vue/reactivity.@vue/reactivity.Ref<infer U> ? std.Readonly<@vue/reactivity.@vue/reactivity.Ref<@vue/reactivity.@vue/reactivity.DeepReadonly<U>>> : T extends {} ? {readonly [ K in keyof T ]: @vue/reactivity.@vue/reactivity.DeepReadonly<T[K]>} : std.Readonly<T>
  }}}
  */
@js.native
trait DeepReadonly[T] extends StObject
