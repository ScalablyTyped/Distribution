package typings.xstream.extraTweenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Easings extends js.Object {
  @JSName("easeInOut")
  var easeInOut_Original: Ease = js.native
  @JSName("easeIn")
  var easeIn_Original: Ease = js.native
  @JSName("easeOut")
  var easeOut_Original: Ease = js.native
  def easeIn(x: Double, from: Double, to: Double): Double = js.native
  def easeInOut(x: Double, from: Double, to: Double): Double = js.native
  def easeOut(x: Double, from: Double, to: Double): Double = js.native
}

