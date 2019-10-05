package typings.tweenjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Timeline")
@js.native
class Timeline () extends AbstractTween {
  def this(props: TimelineProps) = this()
  // properties
  var tweens: js.Array[Tween] = js.native
  // method
  def addTween(tween: Tween): Tween = js.native
  def removeTween(tween: Tween): Boolean = js.native
  def updateDuration(): Unit = js.native
}

