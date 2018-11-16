package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("KeyframeEffect")
@js.native
class KeyframeEffect protected () extends AnimationEffectReadOnly {
  def this(target: stdLib.HTMLElement, effect: js.Array[AnimationKeyFrame], timing: scala.Double) = this()
  def this(target: stdLib.HTMLElement, effect: js.Array[AnimationKeyFrame], timing: AnimationEffectTiming) = this()
  def this(target: stdLib.HTMLElement, effect: AnimationKeyFrame, timing: scala.Double) = this()
  def this(target: stdLib.HTMLElement, effect: AnimationKeyFrame, timing: AnimationEffectTiming) = this()
  def this(target: stdLib.HTMLElement, effect: js.Array[AnimationKeyFrame], timing: scala.Double, id: java.lang.String) = this()
  def this(target: stdLib.HTMLElement, effect: js.Array[AnimationKeyFrame], timing: AnimationEffectTiming, id: java.lang.String) = this()
  def this(target: stdLib.HTMLElement, effect: AnimationKeyFrame, timing: scala.Double, id: java.lang.String) = this()
  def this(target: stdLib.HTMLElement, effect: AnimationKeyFrame, timing: AnimationEffectTiming, id: java.lang.String) = this()
  var activeDuration: scala.Double = js.native
  var parent: KeyframeEffect | scala.Null = js.native
  var target: stdLib.HTMLElement = js.native
  /* CompleteClass */
  override val timing: scala.Double = js.native
  /* CompleteClass */
  override def getComputedTiming(): ComputedTimingProperties = js.native
  def getFrames(): js.Array[AnimationKeyFrame] = js.native
  def onsample(timeFraction: scala.Double, effect: KeyframeEffect, animation: Animation): js.UndefOr[scala.Unit] = js.native
  def onsample(timeFraction: scala.Null, effect: KeyframeEffect, animation: Animation): js.UndefOr[scala.Unit] = js.native
  def remove(): scala.Unit = js.native
}

