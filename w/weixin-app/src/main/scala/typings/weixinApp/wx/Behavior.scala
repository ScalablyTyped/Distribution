package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Behavior[Data, Props, Methods] extends js.Object {
  var __DO_NOT_USE_INTERNAL_FIELD_DATA: Data
  var __DO_NOT_USE_INTERNAL_FIELD_METHODS: Methods
  var __DO_NOT_USE_INTERNAL_FIELD_PROPS: Props
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
}

