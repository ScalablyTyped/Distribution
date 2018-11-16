package typings
package tweenDotJsLib.tweenDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tweenjs/tween.js", JSImport.Namespace)
@js.native
object tweenDotJsModMembers extends js.Object {
  var Easing: tweenDotJsLib.Easing = js.native
  var Interpolation: tweenDotJsLib.Interpolation = js.native
  def add(tween: tweenDotJsLib.TWEENNs.Tween): scala.Unit = js.native
  def getAll(): js.Array[tweenDotJsLib.TWEENNs.Tween] = js.native
  def now(): scala.Double = js.native
  def remove(tween: tweenDotJsLib.TWEENNs.Tween): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
  def update(): scala.Boolean = js.native
  def update(time: scala.Double): scala.Boolean = js.native
  def update(time: scala.Double, preserve: scala.Boolean): scala.Boolean = js.native
}

