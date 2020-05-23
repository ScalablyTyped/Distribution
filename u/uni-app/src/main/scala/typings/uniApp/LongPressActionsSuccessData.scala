package typings.uniApp

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
  def apply(index: js.UndefOr[Double] = js.undefined, tapIndex: js.UndefOr[Double] = js.undefined): LongPressActionsSuccessData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tapIndex)) __obj.updateDynamic("tapIndex")(tapIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongPressActionsSuccessData]
  }
}

