package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContextTranslateMarkerOptions extends js.Object {
  /**
    * 动画结束回调函数
    */
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 移动过程中是否自动旋转marker
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  /**
    * 指定marker移动到的目标点
    */
  var destination: js.UndefOr[LocationObject] = js.undefined
  /**
    * 动画持续时长，默认值1000ms，平移与旋转分别计算
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 指定marker
    */
  var markerId: js.UndefOr[Double] = js.undefined
  /**
    * marker的旋转角度
    */
  var rotate: js.UndefOr[Double] = js.undefined
}

object MapContextTranslateMarkerOptions {
  @scala.inline
  def apply(
    animationEnd: () => Unit = null,
    autoRotate: js.UndefOr[Boolean] = js.undefined,
    destination: LocationObject = null,
    duration: js.UndefOr[Double] = js.undefined,
    fail: () => Unit = null,
    markerId: js.UndefOr[Double] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined
  ): MapContextTranslateMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (animationEnd != null) __obj.updateDynamic("animationEnd")(js.Any.fromFunction0(animationEnd))
    if (!js.isUndefined(autoRotate)) __obj.updateDynamic("autoRotate")(autoRotate.get.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (!js.isUndefined(markerId)) __obj.updateDynamic("markerId")(markerId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextTranslateMarkerOptions]
  }
}

