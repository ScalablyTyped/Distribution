package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MuteConfig extends js.Object {
  /**
    * 静音设置
    */
  var muteConfig: Anon_MuteEarphone
}

object Anon_MuteConfig {
  @scala.inline
  def apply(muteConfig: Anon_MuteEarphone): Anon_MuteConfig = {
    val __obj = js.Dynamic.literal(muteConfig = muteConfig)
  
    __obj.asInstanceOf[Anon_MuteConfig]
  }
}

