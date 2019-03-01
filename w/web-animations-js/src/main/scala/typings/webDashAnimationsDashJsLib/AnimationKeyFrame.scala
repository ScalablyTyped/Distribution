package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationKeyFrame extends js.Object {
  var easing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var offset: js.UndefOr[scala.Double | (js.Array[scala.Double | scala.Null]) | scala.Null] = js.undefined
  var opacity: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var transform: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object AnimationKeyFrame {
  @scala.inline
  def apply(
    easing: java.lang.String | js.Array[java.lang.String] = null,
    offset: scala.Double | (js.Array[scala.Double | scala.Null]) = null,
    opacity: scala.Double | js.Array[scala.Double] = null,
    transform: java.lang.String | js.Array[java.lang.String] = null
  ): AnimationKeyFrame = {
    val __obj = js.Dynamic.literal()
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationKeyFrame]
  }
}

