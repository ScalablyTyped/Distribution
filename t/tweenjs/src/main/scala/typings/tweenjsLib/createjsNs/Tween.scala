package typings
package tweenjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Tween")
@js.native
class Tween protected () extends AbstractTween {
  def this(target: js.Any) = this()
  def this(target: js.Any, props: TweenProps) = this()
  var passive: scala.Boolean = js.native
  var pluginData: js.Any = js.native
  // properties
  var target: js.Any = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Tween = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, scala.Unit], params: js.Array[_]): Tween = js.native
  def call(callback: js.Function1[/* repeated */ js.Any, scala.Unit], params: js.Array[_], scope: js.Any): Tween = js.native
  def label(name: java.lang.String): Tween = js.native
  def pause(): Tween = js.native
  def pause(tween: Tween): Tween = js.native
  def play(): Tween = js.native
  def play(tween: Tween): Tween = js.native
  def set(props: js.Any): Tween = js.native
  def set(props: js.Any, target: js.Any): Tween = js.native
  def to(props: js.Any): Tween = js.native
  def to(props: js.Any, duration: scala.Double): Tween = js.native
  def to(props: js.Any, duration: scala.Double, ease: js.Function): Tween = js.native
  def wait(duration: scala.Double): Tween = js.native
  def wait(duration: scala.Double, passive: scala.Boolean): Tween = js.native
}

@JSGlobal("createjs.Tween")
@js.native
object Tween extends js.Object {
  var IGNORE: js.Any = js.native
  // methods
  def get(target: js.Any): tweenjsLib.createjsNs.Tween = js.native
  def get(target: js.Any, props: tweenjsLib.createjsNs.TweenProps): tweenjsLib.createjsNs.Tween = js.native
  def handleEvent(e: createjsDashLibLib.createjsNs.Event): scala.Unit = js.native
  def hasActiveTweens(target: js.Any): scala.Boolean = js.native
  def removeAllTweens(): scala.Unit = js.native
  def removeTweens(target: js.Any): scala.Unit = js.native
  def tick(delta: scala.Double, paused: scala.Boolean): scala.Unit = js.native
}

