package typings.vueTestUtils.mod

import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperArray[V /* <: Vue */] extends BaseWrapper {
  
  def at(index: Double): Wrapper[V] = js.native
  
  def filter(
    predicate: js.Function3[/* value */ Wrapper[V], /* index */ Double, /* array */ js.Array[Wrapper[V]], _]
  ): WrapperArray[Vue] = js.native
  
  val length: Double = js.native
  
  val wrappers: js.Array[Wrapper[V]] = js.native
}
