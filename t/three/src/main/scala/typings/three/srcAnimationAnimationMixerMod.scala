package typings.three

import typings.three.srcAnimationAnimationActionMod.AnimationAction
import typings.three.srcAnimationAnimationClipMod.AnimationClip
import typings.three.srcAnimationAnimationObjectGroupMod.AnimationObjectGroup
import typings.three.srcConstantsMod.AnimationBlendMode
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
import typings.three.srcCoreObject3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnimationAnimationMixerMod {
  
  @JSImport("three/src/animation/AnimationMixer", "AnimationMixer")
  @js.native
  open class AnimationMixer protected () extends EventDispatcher[Event] {
    def this(root: AnimationObjectGroup) = this()
    def this(root: Object3D[Event]) = this()
    
    def clipAction(clip: AnimationClip): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: Unit, blendMode: AnimationBlendMode): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: AnimationObjectGroup): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: AnimationObjectGroup, blendMode: AnimationBlendMode): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: Object3D[Event]): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: Object3D[Event], blendMode: AnimationBlendMode): AnimationAction = js.native
    
    def existingAction(clip: AnimationClip): AnimationAction | Null = js.native
    def existingAction(clip: AnimationClip, root: AnimationObjectGroup): AnimationAction | Null = js.native
    def existingAction(clip: AnimationClip, root: Object3D[Event]): AnimationAction | Null = js.native
    
    def getRoot(): Object3D[Event] | AnimationObjectGroup = js.native
    
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
    def uncacheAction(clip: AnimationClip, root: Object3D[Event]): Unit = js.native
    
    def uncacheClip(clip: AnimationClip): Unit = js.native
    
    def uncacheRoot(root: AnimationObjectGroup): Unit = js.native
    def uncacheRoot(root: Object3D[Event]): Unit = js.native
    
    def update(deltaTime: Double): AnimationMixer = js.native
  }
}
