package typings.vue

import typings.vue.typesOptionsMod.AsyncComponentPromise
import typings.vue.typesOptionsMod.Component
import typings.vue.typesOptionsMod.DefaultComputed
import typings.vue.typesOptionsMod.DefaultData
import typings.vue.typesOptionsMod.DefaultMethods
import typings.vue.typesOptionsMod.DefaultProps
import typings.vue.typesOptionsMod.EsModuleComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Component[Data, Methods, Computed, Props] extends js.Object {
  @JSName("component")
  var component_Original: AsyncComponentPromise[Data, Methods, Computed, Props] = js.native
  var delay: js.UndefOr[Double] = js.native
  var error: js.UndefOr[
    (Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ] = js.native
  var loading: js.UndefOr[
    (Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ] = js.native
  var timeout: js.UndefOr[Double] = js.native
  def component(
    resolve: js.Function1[/* component */ Component[Data, Methods, Computed, Props], Unit],
    reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  ): (js.Promise[
    (Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ]) | Unit = js.native
}

