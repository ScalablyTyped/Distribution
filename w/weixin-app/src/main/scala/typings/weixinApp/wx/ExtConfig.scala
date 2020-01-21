package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 第三方平台
trait ExtConfig extends js.Object {
  /** 第三方平台自定义的数据 */
  var extConfig: js.Any
}

object ExtConfig {
  @scala.inline
  def apply(extConfig: js.Any): ExtConfig = {
    val __obj = js.Dynamic.literal(extConfig = extConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtConfig]
  }
}

