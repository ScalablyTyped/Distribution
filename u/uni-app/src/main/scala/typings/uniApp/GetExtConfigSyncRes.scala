package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExtConfigSyncRes extends js.Object {
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.UndefOr[js.Any] = js.undefined
}

object GetExtConfigSyncRes {
  @scala.inline
  def apply(extConfig: js.Any = null): GetExtConfigSyncRes = {
    val __obj = js.Dynamic.literal()
    if (extConfig != null) __obj.updateDynamic("extConfig")(extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtConfigSyncRes]
  }
}

