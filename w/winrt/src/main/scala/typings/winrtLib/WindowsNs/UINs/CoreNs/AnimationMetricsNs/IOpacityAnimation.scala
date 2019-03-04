package typings
package winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpacityAnimation extends IPropertyAnimation {
  var finalOpacity: scala.Double
  var initialOpacity: scala.Double
}

object IOpacityAnimation {
  @scala.inline
  def apply(
    control1: winrtLib.WindowsNs.FoundationNs.Point,
    control2: winrtLib.WindowsNs.FoundationNs.Point,
    delay: scala.Double,
    duration: scala.Double,
    finalOpacity: scala.Double,
    initialOpacity: scala.Double,
    `type`: PropertyAnimationType
  ): IOpacityAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1, control2 = control2, delay = delay, duration = duration, finalOpacity = finalOpacity, initialOpacity = initialOpacity)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IOpacityAnimation]
  }
}

