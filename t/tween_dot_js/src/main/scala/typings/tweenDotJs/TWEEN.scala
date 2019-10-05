package typings.tweenDotJs

import typings.tweenDotJs.TWEEN.Group
import typings.tweenDotJs.TWEEN.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TWEEN")
@js.native
object TWEEN extends js.Object {
  @js.native
  class Group () extends js.Object {
    def add(tween: Tween): Unit = js.native
    def getAll(): js.Array[Tween] = js.native
    def remove(tween: Tween): Unit = js.native
    def removeAll(): Unit = js.native
    def update(): Boolean = js.native
    def update(time: Double): Boolean = js.native
    def update(time: Double, preserve: Boolean): Boolean = js.native
  }
  
  @js.native
  class Tween () extends js.Object {
    def this(`object`: js.Any) = this()
    def this(`object`: js.Any, group: Group) = this()
    def chain(tweens: Tween*): Tween = js.native
    def delay(amount: Double): Tween = js.native
    def easing(easing: js.Function1[/* k */ Double, Double]): Tween = js.native
    def end(): Tween = js.native
    def getId(): Double = js.native
    def group(group: Group): Tween = js.native
    def interpolation(interpolation: js.Function2[/* v */ js.Array[Double], /* k */ Double, Double]): Tween = js.native
    def isPlaying(): Boolean = js.native
    def onComplete(callback: js.Function1[/* object */ js.UndefOr[js.Any], Unit]): Tween = js.native
    def onStart(callback: js.Function1[/* object */ js.UndefOr[js.Any], Unit]): Tween = js.native
    def onStop(callback: js.Function1[/* object */ js.UndefOr[js.Any], Unit]): Tween = js.native
    def onUpdate(callback: js.Function1[/* object */ js.UndefOr[js.Any], Unit]): Tween = js.native
    def repeat(times: Double): Tween = js.native
    def repeatDelay(times: Double): Tween = js.native
    def start(): Tween = js.native
    def start(time: Double): Tween = js.native
    def stop(): Tween = js.native
    def stopChainedTweens(): Tween = js.native
    def to(properties: js.Any, duration: Double): Tween = js.native
    def update(time: Double): Boolean = js.native
    def yoyo(enable: Boolean): Tween = js.native
  }
  
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

