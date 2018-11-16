package typings
package tweenjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MotionGuidePlugin")
@js.native
class MotionGuidePlugin () extends js.Object

@JSGlobal("createjs.MotionGuidePlugin")
@js.native
object MotionGuidePlugin extends js.Object {
  var ID: java.lang.String = js.native
  //properties
  var priority: scala.Double = js.native
  def change(
    tween: tweenjsLib.createjsNs.Tween,
    step: tweenjsLib.createjsNs.TweenStep,
    prop: java.lang.String,
    value: js.Any,
    ratio: scala.Double,
    end: scala.Boolean
  ): scala.Unit = js.native
  def debug(guideData: js.Any, ctx: js.Any, higlight: js.Array[scala.Double]): scala.Unit = js.native
  def init(tween: tweenjsLib.createjsNs.Tween, prop: java.lang.String, value: js.Any): scala.Unit = js.native
  //methods
  def install(): js.Object = js.native
  def step(
    tween: tweenjsLib.createjsNs.Tween,
    step: tweenjsLib.createjsNs.TweenStep,
    props: tweenjsLib.createjsNs.TweenProps
  ): scala.Unit = js.native
}

