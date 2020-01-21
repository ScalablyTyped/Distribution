package typings.three

import typings.three.animationClipMod.AnimationClip
import typings.three.animationMixerMod.AnimationMixer
import typings.three.constantsMod.AnimationActionLoopStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/AnimationAction", JSImport.Namespace)
@js.native
object animationActionMod extends js.Object {
  @js.native
  class AnimationAction () extends js.Object {
    var clampWhenFinished: Boolean = js.native
    var enabled: Boolean = js.native
    var loop: AnimationActionLoopStyles = js.native
    var paused: Boolean = js.native
    var repetitions: Double = js.native
    var time: Double = js.native
    var timeScale: Double = js.native
    var weight: Double = js.native
    var zeroSlopeAtEnd: Boolean = js.native
    var zeroSlopeAtStart: Boolean = js.native
    def crossFadeFrom(fadeOutAction: AnimationAction, duration: Double, warp: Boolean): AnimationAction = js.native
    def crossFadeTo(fadeInAction: AnimationAction, duration: Double, warp: Boolean): AnimationAction = js.native
    def fadeIn(duration: Double): AnimationAction = js.native
    def fadeOut(duration: Double): AnimationAction = js.native
    def getClip(): AnimationClip = js.native
    def getEffectiveTimeScale(): Double = js.native
    def getEffectiveWeight(): Double = js.native
    def getMixer(): AnimationMixer = js.native
    def getRoot(): js.Any = js.native
    def halt(duration: Double): AnimationAction = js.native
    def isRunning(): Boolean = js.native
    def isScheduled(): Boolean = js.native
    def play(): AnimationAction = js.native
    def reset(): AnimationAction = js.native
    def setDuration(duration: Double): AnimationAction = js.native
    def setEffectiveTimeScale(timeScale: Double): AnimationAction = js.native
    def setEffectiveWeight(weight: Double): AnimationAction = js.native
    def setLoop(mode: AnimationActionLoopStyles, repetitions: Double): AnimationAction = js.native
    def startAt(time: Double): AnimationAction = js.native
    def stop(): AnimationAction = js.native
    def stopFading(): AnimationAction = js.native
    def stopWarping(): AnimationAction = js.native
    def syncWith(action: AnimationAction): AnimationAction = js.native
    def warp(statTimeScale: Double, endTimeScale: Double, duration: Double): AnimationAction = js.native
  }
  
}

