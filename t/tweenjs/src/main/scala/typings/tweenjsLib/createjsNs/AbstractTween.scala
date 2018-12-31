package typings
package tweenjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AbstractTween")
@js.native
class AbstractTween ()
  extends createjsDashLibLib.createjsNs.EventDispatcher {
  def this(props: TweenProps) = this()
  var bounce: scala.Boolean = js.native
  val currentLabel: java.lang.String = js.native
  var duration: scala.Double = js.native
  // properties
  var ignoreGlobalPause: scala.Boolean = js.native
  var loop: scala.Double = js.native
  var paused: scala.Boolean = js.native
  var position: scala.Double = js.native
  var rawPosition: scala.Double = js.native
  var reversed: scala.Boolean = js.native
  var timeScale: scala.Double = js.native
  var useTicks: scala.Boolean = js.native
  def addLabel(label: java.lang.String, position: scala.Double): scala.Unit = js.native
  // methods
  def advance(delta: scala.Double): scala.Unit = js.native
  def advance(delta: scala.Double, ignoreActions: scala.Boolean): scala.Unit = js.native
  def calculatePosition(rawPosition: scala.Double): scala.Unit = js.native
  def getLabels(): js.Array[java.lang.String] = js.native
  def gotoAndPlay(positionOrLabel: java.lang.String): scala.Unit = js.native
  def gotoAndPlay(positionOrLabel: scala.Double): scala.Unit = js.native
  def gotoAndStop(positionOrLabel: java.lang.String): scala.Unit = js.native
  def gotoAndStop(positionOrLabel: scala.Double): scala.Unit = js.native
  def resolve(positionOrLabel: java.lang.String): scala.Double = js.native
  def resolve(positionOrLabel: scala.Double): scala.Double = js.native
  def setLabels(labels: js.Array[org.scalablytyped.runtime.StringDictionary[scala.Double]]): scala.Unit = js.native
  def setPosition(rawPosition: scala.Double): scala.Unit = js.native
  def setPosition(rawPosition: scala.Double, ignoreActions: scala.Boolean): scala.Unit = js.native
  def setPosition(rawPosition: scala.Double, ignoreActions: scala.Boolean, jump: scala.Boolean): scala.Unit = js.native
  def setPosition(
    rawPosition: scala.Double,
    ignoreActions: scala.Boolean,
    jump: scala.Boolean,
    callback: js.Function1[/* tween */ this.type, scala.Unit]
  ): scala.Unit = js.native
}

