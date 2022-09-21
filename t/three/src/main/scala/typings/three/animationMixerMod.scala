package typings.three

import typings.three.animationActionMod.AnimationAction
import typings.three.animationClipMod.AnimationClip
import typings.three.animationObjectGroupMod.AnimationObjectGroup
import typings.three.eventDispatcherMod.Event
import typings.three.eventDispatcherMod.EventDispatcher
import typings.three.object3DMod.Object3D
import typings.three.srcConstantsMod.AnimationBlendMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMixerMod {
  
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
