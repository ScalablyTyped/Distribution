package typings
package threeLib.srcAnimationAnimationMixerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/AnimationMixer", "AnimationMixer")
@js.native
class AnimationMixer protected ()
  extends threeLib.srcCoreEventDispatcherMod.EventDispatcher {
  def this(root: js.Any) = this()
  var time: scala.Double = js.native
  var timeScale: scala.Double = js.native
  def clipAction(clip: threeLib.srcAnimationAnimationClipMod.AnimationClip): threeLib.srcAnimationAnimationActionMod.AnimationAction = js.native
  def clipAction(clip: threeLib.srcAnimationAnimationClipMod.AnimationClip, root: js.Any): threeLib.srcAnimationAnimationActionMod.AnimationAction = js.native
  def existingAction(clip: threeLib.srcAnimationAnimationClipMod.AnimationClip): threeLib.srcAnimationAnimationActionMod.AnimationAction = js.native
  def existingAction(clip: threeLib.srcAnimationAnimationClipMod.AnimationClip, root: js.Any): threeLib.srcAnimationAnimationActionMod.AnimationAction = js.native
  def getRoot(): js.Any = js.native
  def stopAllAction(): AnimationMixer = js.native
  def uncacheAction(clip: threeLib.srcAnimationAnimationClipMod.AnimationClip): scala.Unit = js.native
  def uncacheAction(clip: threeLib.srcAnimationAnimationClipMod.AnimationClip, root: js.Any): scala.Unit = js.native
  def uncacheClip(clip: threeLib.srcAnimationAnimationClipMod.AnimationClip): scala.Unit = js.native
  def uncacheRoot(root: js.Any): scala.Unit = js.native
  def update(deltaTime: scala.Double): AnimationMixer = js.native
}

