package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay[Data, Methods, Computed, Props] extends js.Object {
  var component: vueLib.typesOptionsMod.AsyncComponentPromise[Data, Methods, Computed, Props]
  var delay: js.UndefOr[scala.Double] = js.undefined
  var error: js.UndefOr[
    (vueLib.typesOptionsMod.Component[
      vueLib.typesOptionsMod.DefaultData[scala.Nothing], 
      vueLib.typesOptionsMod.DefaultMethods[scala.Nothing], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.DefaultProps
    ]) | vueLib.typesOptionsMod.EsModuleComponent
  ] = js.undefined
  var loading: js.UndefOr[
    (vueLib.typesOptionsMod.Component[
      vueLib.typesOptionsMod.DefaultData[scala.Nothing], 
      vueLib.typesOptionsMod.DefaultMethods[scala.Nothing], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.DefaultProps
    ]) | vueLib.typesOptionsMod.EsModuleComponent
  ] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

