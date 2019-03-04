package typings
package vueLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionalComponentOptions[Props, PropDefs] extends js.Object {
  var functional: scala.Boolean
  var inject: js.UndefOr[InjectOptions] = js.undefined
  var model: js.UndefOr[vueLib.Anon_Event] = js.undefined
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

object FunctionalComponentOptions {
  @scala.inline
  def apply[Props, PropDefs](
    functional: scala.Boolean,
    inject: InjectOptions = null,
    model: vueLib.Anon_Event = null,
    name: java.lang.String = null,
    props: PropDefs = null,
    render: js.ThisFunction2[
      /* this */ js.UndefOr[scala.Nothing], 
      /* createElement */ vueLib.typesVueMod.CreateElement, 
      /* context */ RenderContext[Props], 
      vueLib.typesVnodeMod.VNode | js.Array[vueLib.typesVnodeMod.VNode]
    ] = null
  ): FunctionalComponentOptions[Props, PropDefs] = {
    val __obj = js.Dynamic.literal(functional = functional)
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (name != null) __obj.updateDynamic("name")(name)
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[FunctionalComponentOptions[Props, PropDefs]]
  }
}

