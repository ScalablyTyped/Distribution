package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.game
import typings.wegameApi.wegameApiStrings.normal
import typings.wegameApi.wegameApiStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  interval  :'game' | 'ui' | 'normal'} & wegame-api.wx.types.Callbacks */
trait intervalgameuinormalCallb extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 开始监听设备方向的变化。默认值normal，
    * game - 适用于更新游戏的回调频率，在 20ms/次 左右
    * ui - 适用于更新 UI 的回调频率，在 60ms/次 左右
    * normal - 普通的回调频率，在 200ms/次 左右
    */
  var interval: game | ui | normal
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object intervalgameuinormalCallb {
  @scala.inline
  def apply(
    interval: game | ui | normal,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): intervalgameuinormalCallb = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[intervalgameuinormalCallb]
  }
}

