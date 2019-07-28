package typings.webDashAnimationsDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationKeyFrame extends js.Object {
  var easing: js.UndefOr[String | js.Array[String]] = js.undefined
  var offset: js.UndefOr[Double | (js.Array[Double | Null]) | Null] = js.undefined
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var transform: js.UndefOr[String | js.Array[String]] = js.undefined
}

object AnimationKeyFrame {
  @scala.inline
  def apply(
    easing: String | js.Array[String] = null,
    offset: Double | (js.Array[Double | Null]) = null,
    opacity: Double | js.Array[Double] = null,
    transform: String | js.Array[String] = null
  ): AnimationKeyFrame = {
    val __obj = js.Dynamic.literal()
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationKeyFrame]
  }
}

