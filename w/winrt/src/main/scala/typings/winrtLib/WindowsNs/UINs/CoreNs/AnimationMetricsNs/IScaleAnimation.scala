package typings
package winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScaleAnimation extends IPropertyAnimation {
  var finalScaleX: scala.Double
  var finalScaleY: scala.Double
  var initialScaleX: scala.Double
  var initialScaleY: scala.Double
  var normalizedOrigin: winrtLib.WindowsNs.FoundationNs.Point
}

object IScaleAnimation {
  @scala.inline
  def apply(
    control1: winrtLib.WindowsNs.FoundationNs.Point,
    control2: winrtLib.WindowsNs.FoundationNs.Point,
    delay: scala.Double,
    duration: scala.Double,
    finalScaleX: scala.Double,
    finalScaleY: scala.Double,
    initialScaleX: scala.Double,
    initialScaleY: scala.Double,
    normalizedOrigin: winrtLib.WindowsNs.FoundationNs.Point,
    `type`: PropertyAnimationType
  ): IScaleAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1, control2 = control2, delay = delay, duration = duration, finalScaleX = finalScaleX, finalScaleY = finalScaleY, initialScaleX = initialScaleX, initialScaleY = initialScaleY, normalizedOrigin = normalizedOrigin)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IScaleAnimation]
  }
}

