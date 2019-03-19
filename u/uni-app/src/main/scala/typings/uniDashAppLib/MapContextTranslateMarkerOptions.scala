package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContextTranslateMarkerOptions extends js.Object {
  /**
    * 动画结束回调函数
    */
  var animationEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 移动过程中是否自动旋转marker
    */
  var autoRotate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 指定marker移动到的目标点
    */
  var destination: js.UndefOr[js.Any] = js.undefined
  /**
    * 动画持续时长，默认值1000ms，平移与旋转分别计算
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 指定marker
    */
  var markerId: js.UndefOr[scala.Double] = js.undefined
  /**
    * marker的旋转角度
    */
  var rotate: js.UndefOr[scala.Double] = js.undefined
}

object MapContextTranslateMarkerOptions {
  @scala.inline
  def apply(
    animationEnd: () => scala.Unit = null,
    autoRotate: js.UndefOr[scala.Boolean] = js.undefined,
    destination: js.Any = null,
    duration: scala.Int | scala.Double = null,
    fail: () => scala.Unit = null,
    markerId: scala.Int | scala.Double = null,
    rotate: scala.Int | scala.Double = null
  ): MapContextTranslateMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (animationEnd != null) __obj.updateDynamic("animationEnd")(js.Any.fromFunction0(animationEnd))
    if (!js.isUndefined(autoRotate)) __obj.updateDynamic("autoRotate")(autoRotate)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (markerId != null) __obj.updateDynamic("markerId")(markerId.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextTranslateMarkerOptions]
  }
}

