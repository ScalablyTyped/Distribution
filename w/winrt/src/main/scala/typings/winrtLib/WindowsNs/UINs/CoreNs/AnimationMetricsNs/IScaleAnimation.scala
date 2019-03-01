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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("control1")(control1)
    __obj.updateDynamic("control2")(control2)
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("finalScaleX")(finalScaleX)
    __obj.updateDynamic("finalScaleY")(finalScaleY)
    __obj.updateDynamic("initialScaleX")(initialScaleX)
    __obj.updateDynamic("initialScaleY")(initialScaleY)
    __obj.updateDynamic("normalizedOrigin")(normalizedOrigin)
    __obj.asInstanceOf[IScaleAnimation]
  }
}

