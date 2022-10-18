package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof T ]: T[K] extends @vue/reactivity.@vue/reactivity.Ref<infer V>? V : T[K] extends @vue/reactivity.@vue/reactivity.Ref<infer V> | undefined? unknown extends V? undefined : V | undefined : T[K]}
  }}}
  */
@js.native
trait ShallowUnwrapRef[T] extends StObject
