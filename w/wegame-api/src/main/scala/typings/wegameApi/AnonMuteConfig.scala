package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMuteConfig extends js.Object {
  /**
    * 静音设置
    */
  var muteConfig: AnonMuteEarphone
}

object AnonMuteConfig {
  @scala.inline
  def apply(muteConfig: AnonMuteEarphone): AnonMuteConfig = {
    val __obj = js.Dynamic.literal(muteConfig = muteConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMuteConfig]
  }
}

