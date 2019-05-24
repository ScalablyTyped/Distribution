package typings
package threeLib.srcAnimationAnimationActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/AnimationAction", "AnimationAction")
@js.native
class AnimationAction () extends js.Object {
  var clampWhenFinished: scala.Boolean = js.native
  var enabled: scala.Boolean = js.native
  var loop: threeLib.srcConstantsMod.AnimationActionLoopStyles = js.native
  var paused: scala.Boolean = js.native
  var repetitions: scala.Double = js.native
  var time: scala.Double = js.native
  var timeScale: scala.Double = js.native
  var weight: scala.Double = js.native
  var zeroSlopeAtEnd: scala.Boolean = js.native
  var zeroSlopeAtStart: scala.Boolean = js.native
  def crossFadeFrom(fadeOutAction: AnimationAction, duration: scala.Double, warp: scala.Boolean): AnimationAction = js.native
  def crossFadeTo(fadeInAction: AnimationAction, duration: scala.Double, warp: scala.Boolean): AnimationAction = js.native
  def fadeIn(duration: scala.Double): AnimationAction = js.native
  def fadeOut(duration: scala.Double): AnimationAction = js.native
  def getClip(): threeLib.srcAnimationAnimationClipMod.AnimationClip = js.native
  def getEffectiveTimeScale(): scala.Double = js.native
  def getEffectiveWeight(): scala.Double = js.native
  def getMixer(): threeLib.srcAnimationAnimationMixerMod.AnimationMixer = js.native
  def getRoot(): js.Any = js.native
  def halt(duration: scala.Double): AnimationAction = js.native
  def isRunning(): scala.Boolean = js.native
  def isScheduled(): scala.Boolean = js.native
  def play(): AnimationAction = js.native
  def reset(): AnimationAction = js.native
  def setDuration(duration: scala.Double): AnimationAction = js.native
  def setEffectiveTimeScale(timeScale: scala.Double): AnimationAction = js.native
  def setEffectiveWeight(weight: scala.Double): AnimationAction = js.native
  def setLoop(mode: threeLib.srcConstantsMod.AnimationActionLoopStyles, repetitions: scala.Double): AnimationAction = js.native
  def startAt(time: scala.Double): AnimationAction = js.native
  def stop(): AnimationAction = js.native
  def stopFading(): AnimationAction = js.native
  def stopWarping(): AnimationAction = js.native
  def syncWith(action: AnimationAction): AnimationAction = js.native
  def warp(statTimeScale: scala.Double, endTimeScale: scala.Double, duration: scala.Double): AnimationAction = js.native
}

