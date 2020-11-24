package typings.testingLibraryVue.mod

import typings.vue.vueMod.Vue
import typings.vueTestUtils.mod.VueClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/vue", "render")
@js.native
object render extends js.Object {
  
  def apply[V /* <: Vue */](TestComponent: VueClass[V]): ComponentHarness = js.native
  def apply[V /* <: Vue */](
    TestComponent: VueClass[V],
    options: js.UndefOr[scala.Nothing],
    configure: ConfigurationCallback[V]
  ): ComponentHarness = js.native
  def apply[V /* <: Vue */](TestComponent: VueClass[V], options: RenderOptions[V, js.Object]): ComponentHarness = js.native
  def apply[V /* <: Vue */](
    TestComponent: VueClass[V],
    options: RenderOptions[V, js.Object],
    configure: ConfigurationCallback[V]
  ): ComponentHarness = js.native
}
