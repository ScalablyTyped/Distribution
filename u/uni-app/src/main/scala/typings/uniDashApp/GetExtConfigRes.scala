package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExtConfigRes extends js.Object {
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.UndefOr[js.Any] = js.undefined
}

object GetExtConfigRes {
  @scala.inline
  def apply(errMsg: String = null, extConfig: js.Any = null): GetExtConfigRes = {
    val __obj = js.Dynamic.literal()
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (extConfig != null) __obj.updateDynamic("extConfig")(extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtConfigRes]
  }
}

