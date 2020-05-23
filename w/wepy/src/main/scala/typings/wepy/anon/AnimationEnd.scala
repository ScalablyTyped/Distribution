package typings.wepy.anon

import typings.wepy.wxEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEnd extends js.Object {
  var autoRotate: Boolean
  var destination: LagLng
  var duration: Double
  var markerId: Double
  def animationEnd(): Unit
}

object AnimationEnd {
  @scala.inline
  def apply(
    animationEnd: () => Unit,
    autoRotate: Boolean,
    destination: LagLng,
    duration: Double,
    markerId: Double
  ): AnimationEnd = {
    val __obj = js.Dynamic.literal(animationEnd = js.Any.fromFunction0(animationEnd), autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEnd]
  }
}

