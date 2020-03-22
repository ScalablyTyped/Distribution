package typings.three

import typings.three.animationActionMod.AnimationAction
import typings.three.animationClipMod.AnimationClip
import typings.three.eventDispatcherMod.EventDispatcher
import typings.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/AnimationMixer", JSImport.Namespace)
@js.native
object animationMixerMod extends js.Object {
  @js.native
  class AnimationMixer protected () extends EventDispatcher {
    def this(root: Object3D) = this()
    var time: Double = js.native
    var timeScale: Double = js.native
    def clipAction(clip: AnimationClip): AnimationAction = js.native
    def clipAction(clip: AnimationClip, root: Object3D): AnimationAction = js.native
    def existingAction(clip: AnimationClip): AnimationAction | Null = js.native
    def existingAction(clip: AnimationClip, root: Object3D): AnimationAction | Null = js.native
    def getRoot(): Object3D = js.native
    def setTime(timeInSeconds: Double): AnimationMixer = js.native
    def stopAllAction(): AnimationMixer = js.native
    def uncacheAction(clip: AnimationClip): Unit = js.native
    def uncacheAction(clip: AnimationClip, root: Object3D): Unit = js.native
    def uncacheClip(clip: AnimationClip): Unit = js.native
    def uncacheRoot(root: Object3D): Unit = js.native
    def update(deltaTime: Double): AnimationMixer = js.native
  }
  
}

