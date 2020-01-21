package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtConfig extends js.Object {
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.Any
}

object AnonExtConfig {
  @scala.inline
  def apply(extConfig: js.Any): AnonExtConfig = {
    val __obj = js.Dynamic.literal(extConfig = extConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExtConfig]
  }
}

