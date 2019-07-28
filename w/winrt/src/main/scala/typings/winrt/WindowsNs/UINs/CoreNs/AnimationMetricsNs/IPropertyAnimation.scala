package typings.winrt.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyAnimation extends js.Object {
  var control1: Point
  var control2: Point
  var delay: Double
  var duration: Double
  var `type`: PropertyAnimationType
}

object IPropertyAnimation {
  @scala.inline
  def apply(control1: Point, control2: Point, delay: Double, duration: Double, `type`: PropertyAnimationType): IPropertyAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1, control2 = control2, delay = delay, duration = duration)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPropertyAnimation]
  }
}

