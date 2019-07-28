package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongPressActionsSuccessData extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var tapIndex: js.UndefOr[Double] = js.undefined
}

object LongPressActionsSuccessData {
  @scala.inline
  def apply(index: Int | Double = null, tapIndex: Int | Double = null): LongPressActionsSuccessData = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (tapIndex != null) __obj.updateDynamic("tapIndex")(tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongPressActionsSuccessData]
  }
}

