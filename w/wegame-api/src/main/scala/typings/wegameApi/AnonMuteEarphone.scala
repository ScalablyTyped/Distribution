package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMuteEarphone extends js.Object {
  /**
    * 是否静音耳机，默认值false
    */
  var muteEarphone: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否静音麦克风，默认值false
    */
  var muteMicrophone: js.UndefOr[Boolean] = js.undefined
}

object AnonMuteEarphone {
  @scala.inline
  def apply(
    muteEarphone: js.UndefOr[Boolean] = js.undefined,
    muteMicrophone: js.UndefOr[Boolean] = js.undefined
  ): AnonMuteEarphone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(muteEarphone)) __obj.updateDynamic("muteEarphone")(muteEarphone.asInstanceOf[js.Any])
    if (!js.isUndefined(muteMicrophone)) __obj.updateDynamic("muteMicrophone")(muteMicrophone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMuteEarphone]
  }
}

