package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MuteEarphone extends js.Object {
  /**
    * 是否静音耳机，默认值false
    */
  var muteEarphone: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否静音麦克风，默认值false
    */
  var muteMicrophone: js.UndefOr[Boolean] = js.undefined
}

object Anon_MuteEarphone {
  @scala.inline
  def apply(
    muteEarphone: js.UndefOr[Boolean] = js.undefined,
    muteMicrophone: js.UndefOr[Boolean] = js.undefined
  ): Anon_MuteEarphone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(muteEarphone)) __obj.updateDynamic("muteEarphone")(muteEarphone)
    if (!js.isUndefined(muteMicrophone)) __obj.updateDynamic("muteMicrophone")(muteMicrophone)
    __obj.asInstanceOf[Anon_MuteEarphone]
  }
}

