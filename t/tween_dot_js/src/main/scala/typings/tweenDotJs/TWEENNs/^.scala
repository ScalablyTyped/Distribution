package typings.tweenDotJs.TWEENNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TWEEN")
@js.native
object ^ extends js.Object {
  var Easing: typings.tweenDotJs.Easing = js.native
  var Interpolation: typings.tweenDotJs.Interpolation = js.native
  def add(tween: Tween): Unit = js.native
  def getAll(): js.Array[Tween] = js.native
  def now(): Double = js.native
  def remove(tween: Tween): Unit = js.native
  def removeAll(): Unit = js.native
  def update(): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}

