package typings.vue.optionsMod

import typings.vue.anon.Event
import typings.vue.vnodeMod.VNode
import typings.vue.vueMod.CreateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionalComponentOptions[Props, PropDefs] extends js.Object {
  var functional: Boolean
  var inject: js.UndefOr[InjectOptions] = js.undefined
  var model: js.UndefOr[Event] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var props: js.UndefOr[PropDefs] = js.undefined
  var render: js.UndefOr[
    js.ThisFunction2[
      /* this */ js.UndefOr[scala.Nothing], 
      /* createElement */ CreateElement, 
      /* context */ RenderContext[Props], 
      VNode | js.Array[VNode]
    ]
  ] = js.undefined
}

object FunctionalComponentOptions {
  @scala.inline
  def apply[Props, PropDefs](
    functional: Boolean,
    inject: InjectOptions = null,
    model: Event = null,
    name: String = null,
    props: PropDefs = null,
    render: js.ThisFunction2[
      /* this */ js.UndefOr[scala.Nothing], 
      /* createElement */ CreateElement, 
      /* context */ RenderContext[Props], 
      VNode | js.Array[VNode]
    ] = null
  ): FunctionalComponentOptions[Props, PropDefs] = {
    val __obj = js.Dynamic.literal(functional = functional.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionalComponentOptions[Props, PropDefs]]
  }
}

