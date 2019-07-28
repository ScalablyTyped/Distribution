package typings.tweenjs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MotionGuidePlugin")
@js.native
class MotionGuidePlugin () extends js.Object

/* static members */
@JSGlobal("createjs.MotionGuidePlugin")
@js.native
object MotionGuidePlugin extends js.Object {
  var ID: String = js.native
  //properties
  var priority: Double = js.native
  def change(tween: Tween, step: TweenStep, prop: String, value: js.Any, ratio: Double, end: Boolean): Unit = js.native
  def debug(guideData: js.Any, ctx: js.Any, higlight: js.Array[Double]): Unit = js.native
  def init(tween: Tween, prop: String, value: js.Any): Unit = js.native
  //methods
  def install(): js.Object = js.native
  def step(tween: Tween, step: TweenStep, props: TweenProps): Unit = js.native
}

