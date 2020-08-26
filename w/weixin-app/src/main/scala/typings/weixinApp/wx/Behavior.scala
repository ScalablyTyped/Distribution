package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Behavior[Data, Props, Methods] extends js.Object {
  var __DO_NOT_USE_INTERNAL_FIELD_DATA: Data = js.native
  var __DO_NOT_USE_INTERNAL_FIELD_METHODS: Methods = js.native
  var __DO_NOT_USE_INTERNAL_FIELD_PROPS: Props = js.native
}

object Behavior {
  @scala.inline
  def apply[Data, Props, Methods](
    __DO_NOT_USE_INTERNAL_FIELD_DATA: Data,
    __DO_NOT_USE_INTERNAL_FIELD_METHODS: Methods,
    __DO_NOT_USE_INTERNAL_FIELD_PROPS: Props
  ): Behavior[Data, Props, Methods] = {
    val __obj = js.Dynamic.literal(__DO_NOT_USE_INTERNAL_FIELD_DATA = __DO_NOT_USE_INTERNAL_FIELD_DATA.asInstanceOf[js.Any], __DO_NOT_USE_INTERNAL_FIELD_METHODS = __DO_NOT_USE_INTERNAL_FIELD_METHODS.asInstanceOf[js.Any], __DO_NOT_USE_INTERNAL_FIELD_PROPS = __DO_NOT_USE_INTERNAL_FIELD_PROPS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior[Data, Props, Methods]]
  }
  @scala.inline
  implicit class BehaviorOps[Self <: Behavior[_, _, _], Data, Props, Methods] (val x: Self with (Behavior[Data, Props, Methods])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set__DO_NOT_USE_INTERNAL_FIELD_DATA(value: Data): Self = this.set("__DO_NOT_USE_INTERNAL_FIELD_DATA", value.asInstanceOf[js.Any])
    @scala.inline
    def set__DO_NOT_USE_INTERNAL_FIELD_METHODS(value: Methods): Self = this.set("__DO_NOT_USE_INTERNAL_FIELD_METHODS", value.asInstanceOf[js.Any])
    @scala.inline
    def set__DO_NOT_USE_INTERNAL_FIELD_PROPS(value: Props): Self = this.set("__DO_NOT_USE_INTERNAL_FIELD_PROPS", value.asInstanceOf[js.Any])
  }
  
}

