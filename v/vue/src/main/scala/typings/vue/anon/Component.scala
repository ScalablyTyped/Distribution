package typings.vue.anon

import typings.vue.optionsMod.AsyncComponentPromise
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.EsModuleComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component[Data, Methods, Computed, Props] extends js.Object {
  
  def component(
    resolve: js.Function1[
      /* component */ typings.vue.optionsMod.Component[Data, Methods, Computed, Props], 
      Unit
    ],
    reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  ): (js.Promise[
    (typings.vue.optionsMod.Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ]) | Unit = js.native
  @JSName("component")
  var component_Original: AsyncComponentPromise[Data, Methods, Computed, Props] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[
    (typings.vue.optionsMod.Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ] = js.native
  
  var loading: js.UndefOr[
    (typings.vue.optionsMod.Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | EsModuleComponent
  ] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
