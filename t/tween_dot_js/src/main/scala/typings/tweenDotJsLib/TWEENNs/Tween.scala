package typings
package tweenDotJsLib.TWEENNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TWEEN.Tween")
@js.native
class Tween () extends js.Object {
  def this(`object`: js.Any) = this()
  def this(`object`: js.Any, group: Group) = this()
  def chain(tweens: Tween*): Tween = js.native
  def delay(amount: scala.Double): Tween = js.native
  def easing(easing: js.Function1[/* k */ scala.Double, scala.Double]): Tween = js.native
  def end(): Tween = js.native
  def getId(): scala.Double = js.native
  def group(group: Group): Tween = js.native
  def interpolation(interpolation: js.Function2[/* v */ js.Array[scala.Double], /* k */ scala.Double, scala.Double]): Tween = js.native
  def isPlaying(): scala.Boolean = js.native
  def onComplete(callback: js.Function1[/* object */ js.UndefOr[js.Any], scala.Unit]): Tween = js.native
  def onStart(callback: js.Function1[/* object */ js.UndefOr[js.Any], scala.Unit]): Tween = js.native
  def onStop(callback: js.Function1[/* object */ js.UndefOr[js.Any], scala.Unit]): Tween = js.native
  def onUpdate(callback: js.Function1[/* object */ js.UndefOr[js.Any], scala.Unit]): Tween = js.native
  def repeat(times: scala.Double): Tween = js.native
  def repeatDelay(times: scala.Double): Tween = js.native
  def start(): Tween = js.native
  def start(time: scala.Double): Tween = js.native
  def stop(): Tween = js.native
  def stopChainedTweens(): Tween = js.native
  def to(properties: js.Any, duration: scala.Double): Tween = js.native
  def update(time: scala.Double): scala.Boolean = js.native
  def yoyo(enable: scala.Boolean): Tween = js.native
}

