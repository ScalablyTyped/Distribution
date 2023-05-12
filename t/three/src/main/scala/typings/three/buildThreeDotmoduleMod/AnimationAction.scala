package typings.three.buildThreeDotmoduleMod

import typings.three.srcConstantsMod.AnimationBlendMode
import typings.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "AnimationAction")
@js.native
open class AnimationAction protected ()
  extends typings.three.srcThreeMod.AnimationAction {
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
    blendMode: AnimationBlendMode
  ) = this()
  def this(
    mixer: typings.three.srcAnimationAnimationMixerMod.AnimationMixer,
    clip: typings.three.srcAnimationAnimationClipMod.AnimationClip,
    localRoot: typings.three.srcCoreObject3DMod.Object3D[Event],
    blendMode: AnimationBlendMode
  ) = this()
}
