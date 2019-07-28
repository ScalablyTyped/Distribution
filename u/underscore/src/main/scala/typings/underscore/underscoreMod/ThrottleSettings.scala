package typings.underscore.underscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * underscore.js _.throttle options.
  **/
trait ThrottleSettings extends js.Object {
  /**
    * If you'd like to disable the leading-edge call, pass this as false.
    **/
  var leading: js.UndefOr[Boolean] = js.undefined
  /**
    * If you'd like to disable the execution on the trailing-edge, pass false.
    **/
  var trailing: js.UndefOr[Boolean] = js.undefined
}

object ThrottleSettings {
  @scala.inline
  def apply(leading: js.UndefOr[Boolean] = js.undefined, trailing: js.UndefOr[Boolean] = js.undefined): ThrottleSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading)
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing)
    __obj.asInstanceOf[ThrottleSettings]
  }
}

