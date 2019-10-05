package typings.tweenjs.createjs

import typings.createjsDashLib.createjs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Tween")
@js.native
class Tween protected () extends AbstractTween {
  def this(target: js.Any) = this()
  def this(target: js.Any, props: TweenProps) = this()
  var passive: Boolean = js.native
  var pluginData: js.Any = js.native
  // properties
  var target: js.Any = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, Unit]): Tween = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[_]): Tween = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[_], scope: js.Any): Tween = js.native
  def label(name: String): Tween = js.native
  def pause(): Tween = js.native
  def pause(tween: Tween): Tween = js.native
  def play(): Tween = js.native
  def play(tween: Tween): Tween = js.native
  def set(props: js.Any): Tween = js.native
  def set(props: js.Any, target: js.Any): Tween = js.native
  def to(props: js.Any): Tween = js.native
  def to(props: js.Any, duration: Double): Tween = js.native
  def to(props: js.Any, duration: Double, ease: js.Function): Tween = js.native
  def wait(duration: Double): Tween = js.native
  def wait(duration: Double, passive: Boolean): Tween = js.native
}

/* static members */
@JSGlobal("createjs.Tween")
@js.native
object Tween extends js.Object {
  var IGNORE: js.Any = js.native
  // methods
  def get(target: js.Any): Tween = js.native
  def get(target: js.Any, props: TweenProps): Tween = js.native
  def handleEvent(e: Event): Unit = js.native
  def hasActiveTweens(target: js.Any): Boolean = js.native
  def removeAllTweens(): Unit = js.native
  def removeTweens(target: js.Any): Unit = js.native
  def tick(delta: Double, paused: Boolean): Unit = js.native
}

