package typings
package vueLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionalComponentOptions[Props, PropDefs] extends js.Object {
  var functional: scala.Boolean
  var inject: js.UndefOr[InjectOptions] = js.undefined
  var model: js.UndefOr[vueLib.Anon_Prop] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var props: js.UndefOr[PropDefs] = js.undefined
  var render: js.UndefOr[
    js.ThisFunction2[
      /* this */ js.UndefOr[scala.Nothing], 
      /* createElement */ vueLib.typesVueMod.CreateElement, 
      /* context */ RenderContext[Props], 
      vueLib.typesVnodeMod.VNode | js.Array[vueLib.typesVnodeMod.VNode]
    ]
  ] = js.undefined
}

