package typings.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TWEEN")
@js.native
object TWEEN extends js.Object {
  @js.native
  trait Group extends js.Object {
    def add(tween: Tween): Unit = js.native
    def getAll(): js.Array[Tween] = js.native
    def remove(tween: Tween): Unit = js.native
    def removeAll(): Unit = js.native
    def update(): Boolean = js.native
    def update(time: js.UndefOr[scala.Nothing], preserve: Boolean): Boolean = js.native
    def update(time: Double): Boolean = js.native
    def update(time: Double, preserve: Boolean): Boolean = js.native
  }
  
  @js.native
  trait Tween extends js.Object {
    def chain(tweens: Tween*): Tween = js.native
    def delay(amount: Double): Tween = js.native
    def duration(d: Double): Tween = js.native
    def easing(easing: js.Function1[/* k */ Double, Double]): Tween = js.native
    def end(): Tween = js.native
    def getId(): Double = js.native
    def group(group: Group): Tween = js.native
    def interpolation(interpolation: js.Function2[/* v */ js.Array[Double], /* k */ Double, Double]): Tween = js.native
    def isPaused(): Boolean = js.native
    def isPlaying(): Boolean = js.native
    def onComplete(callback: js.Function1[/* object */ js.UndefOr[js.Any], Unit]): Tween = js.native
    def onRepeat(callback: js.Function1[/* object */ js.UndefOr[js.Any], Unit]): Tween = js.native
    def onStart(callback: js.Function1[/* object */ js.UndefOr[js.Any], Unit]): Tween = js.native
    def onStop(callback: js.Function1[/* object */ js.UndefOr[js.Any], Unit]): Tween = js.native
    def onUpdate(callback: js.Function2[/* object */ js.UndefOr[js.Any], /* elapsed */ js.UndefOr[Double], Unit]): Tween = js.native
    def pause(): Tween = js.native
    def pause(time: Double): Tween = js.native
    def repeat(times: Double): Tween = js.native
    def repeatDelay(times: Double): Tween = js.native
    def resume(): Tween = js.native
    def resume(time: Double): Tween = js.native
    def start(): Tween = js.native
    def start(time: String): Tween = js.native
    def start(time: Double): Tween = js.native
    def stop(): Tween = js.native
    def stopChainedTweens(): Tween = js.native
    def to(properties: js.Any, duration: Double): Tween = js.native
    def update(time: Double): Boolean = js.native
    def yoyo(enable: Boolean): Tween = js.native
  }
  
}

