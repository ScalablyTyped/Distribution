package typings.three.mod

import typings.three.eventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "AnimationAction")
@js.native
open class AnimationAction protected ()
  extends typings.three.threeMod.AnimationAction {
  def this(
    mixer: typings.three.animationMixerMod.AnimationMixer,
    clip: typings.three.animationClipMod.AnimationClip
  ) = this()
  def this(
    mixer: typings.three.animationMixerMod.AnimationMixer,
    clip: typings.three.animationClipMod.AnimationClip,
    localRoot: typings.three.object3DMod.Object3D[Event]
  ) = this()
  def this(
    mixer: typings.three.animationMixerMod.AnimationMixer,
    clip: typings.three.animationClipMod.AnimationClip,
    localRoot: Unit,
    blendMode: typings.three.srcConstantsMod.AnimationBlendMode
  ) = this()
  def this(
    mixer: typings.three.animationMixerMod.AnimationMixer,
    clip: typings.three.animationClipMod.AnimationClip,
    localRoot: typings.three.object3DMod.Object3D[Event],
    blendMode: typings.three.srcConstantsMod.AnimationBlendMode
  ) = this()
}
