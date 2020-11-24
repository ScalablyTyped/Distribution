package typings.three

import typings.three.animationClipMod.AnimationClip
import typings.three.animationMixerMod.AnimationMixer
import typings.three.constantsMod.AnimationActionLoopStyles
import typings.three.constantsMod.AnimationBlendMode
import typings.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/animation/AnimationAction", JSImport.Namespace)
@js.native
object animationActionMod extends js.Object {
  
  @js.native
  class AnimationAction protected () extends js.Object {
    def this(mixer: AnimationMixer, clip: AnimationClip) = this()
    def this(mixer: AnimationMixer, clip: AnimationClip, localRoot: Object3D) = this()
    def this(
      mixer: AnimationMixer,
      clip: AnimationClip,
      localRoot: js.UndefOr[scala.Nothing],
      blendMode: AnimationBlendMode
    ) = this()
    def this(mixer: AnimationMixer, clip: AnimationClip, localRoot: Object3D, blendMode: AnimationBlendMode) = this()
    
    var blendMode: AnimationBlendMode = js.native
    
    /**
    	 * @default false
    	 */
    var clampWhenFinished: Boolean = js.native
    
    def crossFadeFrom(fadeOutAction: AnimationAction, duration: Double, warp: Boolean): AnimationAction = js.native
    
    def crossFadeTo(fadeInAction: AnimationAction, duration: Double, warp: Boolean): AnimationAction = js.native
    
    /**
    	 * @default true
    	 */
    var enabled: Boolean = js.native
    
    def fadeIn(duration: Double): AnimationAction = js.native
    
    def fadeOut(duration: Double): AnimationAction = js.native
    
    def getClip(): AnimationClip = js.native
    
    def getEffectiveTimeScale(): Double = js.native
    
    def getEffectiveWeight(): Double = js.native
    
    def getMixer(): AnimationMixer = js.native
    
    def getRoot(): Object3D = js.native
    
    def halt(duration: Double): AnimationAction = js.native
    
    def isRunning(): Boolean = js.native
    
    def isScheduled(): Boolean = js.native
    
    /**
    	 * @default THREE.LoopRepeat
    	 */
    var loop: AnimationActionLoopStyles = js.native
    
    /**
    	 * @default false
    	 */
    var paused: Boolean = js.native
    
    def play(): AnimationAction = js.native
    
    /**
    	 * @default Infinity
    	 */
    var repetitions: Double = js.native
    
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
    
    /**
    	 * @default 0
    	 */
    var time: Double = js.native
    
    /**
    	 * @default 1
    	 */
    var timeScale: Double = js.native
    
    def warp(statTimeScale: Double, endTimeScale: Double, duration: Double): AnimationAction = js.native
    
    /**
    	 * @default 1
    	 */
    var weight: Double = js.native
    
    /**
    	 * @default true
    	 */
    var zeroSlopeAtEnd: Boolean = js.native
    
    /**
    	 * @default true
    	 */
    var zeroSlopeAtStart: Boolean = js.native
  }
}
