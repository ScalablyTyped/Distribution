package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationEnd extends js.Object {
  var autoRotate: scala.Boolean
  var destination: wepyLib.wxUnderscoreEnhancedMod.LagLng
  var duration: scala.Double
  var markerId: scala.Double
  def animationEnd(): scala.Unit
}

object Anon_AnimationEnd {
  @scala.inline
  def apply(
    animationEnd: () => scala.Unit,
    autoRotate: scala.Boolean,
    destination: wepyLib.wxUnderscoreEnhancedMod.LagLng,
    duration: scala.Double,
    markerId: scala.Double
  ): Anon_AnimationEnd = {
    val __obj = js.Dynamic.literal(animationEnd = js.Any.fromFunction0(animationEnd), autoRotate = autoRotate, destination = destination, duration = duration, markerId = markerId)
  
    __obj.asInstanceOf[Anon_AnimationEnd]
  }
}

