package typings.tweenDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tweenjs/tween.js", JSImport.Namespace)
@js.native
object atTweenjsTweenDotJsMod extends js.Object {
  @js.native
  class Group ()
    extends typings.tweenDotJs.TWEEN.Group
  
  @js.native
  class Tween ()
    extends typings.tweenDotJs.TWEEN.Tween {
    def this(`object`: js.Any) = this()
    def this(`object`: js.Any, group: typings.tweenDotJs.TWEEN.Group) = this()
  }
  
  var Easing: typings.tweenDotJs.Easing = js.native
  var Interpolation: typings.tweenDotJs.Interpolation = js.native
  def add(tween: typings.tweenDotJs.TWEEN.Tween): Unit = js.native
  def getAll(): js.Array[typings.tweenDotJs.TWEEN.Tween] = js.native
  def now(): Double = js.native
  def remove(tween: typings.tweenDotJs.TWEEN.Tween): Unit = js.native
  def removeAll(): Unit = js.native
  def update(): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}

