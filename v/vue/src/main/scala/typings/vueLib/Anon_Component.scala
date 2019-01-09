package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Component[Data, Methods, Computed, Props] extends js.Object {
  @JSName("component")
  var component_Original: vueLib.typesOptionsMod.AsyncComponentPromise[Data, Methods, Computed, Props] = js.native
  var delay: js.UndefOr[scala.Double] = js.native
  var error: js.UndefOr[
    (vueLib.typesOptionsMod.Component[
      vueLib.typesOptionsMod.DefaultData[scala.Nothing], 
      vueLib.typesOptionsMod.DefaultMethods[scala.Nothing], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.DefaultProps
    ]) | vueLib.typesOptionsMod.EsModuleComponent
  ] = js.native
  var loading: js.UndefOr[
    (vueLib.typesOptionsMod.Component[
      vueLib.typesOptionsMod.DefaultData[scala.Nothing], 
      vueLib.typesOptionsMod.DefaultMethods[scala.Nothing], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.DefaultProps
    ]) | vueLib.typesOptionsMod.EsModuleComponent
  ] = js.native
  var timeout: js.UndefOr[scala.Double] = js.native
  def component(
    resolve: js.Function1[
      /* component */ vueLib.typesOptionsMod.Component[Data, Methods, Computed, Props], 
      scala.Unit
    ],
    reject: js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit]
  ): (js.Promise[
    (vueLib.typesOptionsMod.Component[
      vueLib.typesOptionsMod.DefaultData[scala.Nothing], 
      vueLib.typesOptionsMod.DefaultMethods[scala.Nothing], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.DefaultProps
    ]) | vueLib.typesOptionsMod.EsModuleComponent
  ]) | scala.Unit = js.native
}

