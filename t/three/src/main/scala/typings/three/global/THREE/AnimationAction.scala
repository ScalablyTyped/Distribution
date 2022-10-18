package typings.three.global.THREE

import typings.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.AnimationAction")
@js.native
open class AnimationAction protected ()
  extends typings.three.mod.AnimationAction {
  def this(
    mixer: typings.three.srcAnimationAnimationMixerMod.AnimationMixer,
    clip: typings.three.srcAnimationAnimationClipMod.AnimationClip
  ) = this()
  def this(
    mixer: typings.three.srcAnimationAnimationMixerMod.AnimationMixer,
    clip: typings.three.srcAnimationAnimationClipMod.AnimationClip,
    localRoot: typings.three.srcCoreObject3DMod.Object3D[Event]
  ) = this()
  def this(
    mixer: typings.three.srcAnimationAnimationMixerMod.AnimationMixer,
    clip: typings.three.srcAnimationAnimationClipMod.AnimationClip,
    localRoot: Unit,
    blendMode: typings.three.srcConstantsMod.AnimationBlendMode
  ) = this()
  def this(
    mixer: typings.three.srcAnimationAnimationMixerMod.AnimationMixer,
    clip: typings.three.srcAnimationAnimationClipMod.AnimationClip,
    localRoot: typings.three.srcCoreObject3DMod.Object3D[Event],
    blendMode: typings.three.srcConstantsMod.AnimationBlendMode
  ) = this()
}
