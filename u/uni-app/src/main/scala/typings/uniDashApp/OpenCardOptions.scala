package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCardOptions extends js.Object {
  /**
    * 需要打开的卡券列表
    */
  var cardList: js.UndefOr[js.Array[OpenCardData]] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object OpenCardOptions {
  @scala.inline
  def apply(
    cardList: js.Array[OpenCardData] = null,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): OpenCardOptions = {
    val __obj = js.Dynamic.literal()
    if (cardList != null) __obj.updateDynamic("cardList")(cardList)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[OpenCardOptions]
  }
}

