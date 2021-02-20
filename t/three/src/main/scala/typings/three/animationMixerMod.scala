package typings.three

import typings.three.animationActionMod.AnimationAction
import typings.three.animationClipMod.AnimationClip
import typings.three.animationObjectGroupMod.AnimationObjectGroup
import typings.three.constantsMod.AnimationBlendMode
import typings.three.eventDispatcherMod.EventDispatcher
import typings.three.object3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMixerMod {
  
  @JSImport("three/src/animation/AnimationMixer", "AnimationMixer")
  @js.native
  class AnimationMixer protected () extends EventDispatcher {
    def this(root: AnimationObjectGroup) = this()
    def this(root: Object3D) = this()
    
    def clipAction(clip: AnimationClip): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: js.UndefOr[scala.Nothing], blendMode: AnimationBlendMode): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: AnimationObjectGroup): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: AnimationObjectGroup, blendMode: AnimationBlendMode): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: Object3D): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: Object3D, blendMode: AnimationBlendMode): AnimationAction = js.native
    
    def existingAction(clip: AnimationClip): AnimationAction | Null = js.native
    def existingAction(clip: AnimationClip, root: AnimationObjectGroup): AnimationAction | Null = js.native
    def existingAction(clip: AnimationClip, root: Object3D): AnimationAction | Null = js.native
    
    def getRoot(): Object3D | AnimationObjectGroup = js.native
    
    def setTime(timeInSeconds: Double): AnimationMixer = js.native
    
    def stopAllAction(): AnimationMixer = js.native
    
    /**
    	 * @default 0
    	 */
    var time: Double = js.native
    
    /**
    	 * @default 1.0
    	 */
    var timeScale: Double = js.native
    
    def uncacheAction(clip: AnimationClip): Unit = js.native
    def uncacheAction(clip: AnimationClip, root: AnimationObjectGroup): Unit = js.native
    def uncacheAction(clip: AnimationClip, root: Object3D): Unit = js.native
    
    def uncacheClip(clip: AnimationClip): Unit = js.native
    
    def uncacheRoot(root: AnimationObjectGroup): Unit = js.native
    def uncacheRoot(root: Object3D): Unit = js.native
    
    def update(deltaTime: Double): AnimationMixer = js.native
  }
}
