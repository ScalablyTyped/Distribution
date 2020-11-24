package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "AnimationAction")
@js.native
class AnimationAction protected ()
  extends typings.three.animationActionMod.AnimationAction {
  def this(
    mixer: typings.three.animationMixerMod.AnimationMixer,
    clip: typings.three.animationClipMod.AnimationClip
  ) = this()
  def this(
    mixer: typings.three.animationMixerMod.AnimationMixer,
    clip: typings.three.animationClipMod.AnimationClip,
    localRoot: typings.three.object3DMod.Object3D
  ) = this()
  def this(
    mixer: typings.three.animationMixerMod.AnimationMixer,
    clip: typings.three.animationClipMod.AnimationClip,
    localRoot: js.UndefOr[scala.Nothing],
    blendMode: typings.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    mixer: typings.three.animationMixerMod.AnimationMixer,
    clip: typings.three.animationClipMod.AnimationClip,
    localRoot: typings.three.object3DMod.Object3D,
    blendMode: typings.three.constantsMod.AnimationBlendMode
  ) = this()
}
