package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuteEarphone extends js.Object {
  /**
    * 是否静音耳机，默认值false
    */
  var muteEarphone: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否静音麦克风，默认值false
    */
  var muteMicrophone: js.UndefOr[Boolean] = js.undefined
}

object MuteEarphone {
  @scala.inline
  def apply(
    muteEarphone: js.UndefOr[Boolean] = js.undefined,
    muteMicrophone: js.UndefOr[Boolean] = js.undefined
  ): MuteEarphone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(muteEarphone)) __obj.updateDynamic("muteEarphone")(muteEarphone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muteMicrophone)) __obj.updateDynamic("muteMicrophone")(muteMicrophone.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteEarphone]
  }
}

