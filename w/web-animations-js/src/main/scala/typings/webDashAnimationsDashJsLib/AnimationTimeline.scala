package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTimeline extends js.Object {
  val currentTime: scala.Double | scala.Null
  def getAnimations(): js.Array[Animation]
  def play(effect: stdLib.KeyframeEffect): Animation
}

