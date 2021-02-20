package typings.three.mod

import typings.three.geometryMod.MorphTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "AnimationClip")
@js.native
class AnimationClip ()
  extends typings.three.animationClipMod.AnimationClip {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], duration: Double) = this()
  def this(name: String, duration: Double) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: js.UndefOr[scala.Nothing],
    tracks: js.Array[typings.three.keyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: Double,
    tracks: js.Array[typings.three.keyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(
    name: String,
    duration: js.UndefOr[scala.Nothing],
    tracks: js.Array[typings.three.keyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(name: String, duration: Double, tracks: js.Array[typings.three.keyframeTrackMod.KeyframeTrack]) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: js.UndefOr[scala.Nothing],
    tracks: js.UndefOr[scala.Nothing],
    blendMode: typings.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: js.UndefOr[scala.Nothing],
    tracks: js.Array[typings.three.keyframeTrackMod.KeyframeTrack],
    blendMode: typings.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: Double,
    tracks: js.UndefOr[scala.Nothing],
    blendMode: typings.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    duration: Double,
    tracks: js.Array[typings.three.keyframeTrackMod.KeyframeTrack],
    blendMode: typings.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: js.UndefOr[scala.Nothing],
    tracks: js.UndefOr[scala.Nothing],
    blendMode: typings.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: js.UndefOr[scala.Nothing],
    tracks: js.Array[typings.three.keyframeTrackMod.KeyframeTrack],
    blendMode: typings.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: Double,
    tracks: js.UndefOr[scala.Nothing],
    blendMode: typings.three.constantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: Double,
    tracks: js.Array[typings.three.keyframeTrackMod.KeyframeTrack],
    blendMode: typings.three.constantsMod.AnimationBlendMode
  ) = this()
}
/* static members */
object AnimationClip {
  
  @JSImport("three", "AnimationClip.CreateClipsFromMorphTargetSequences")
  @js.native
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typings.three.animationClipMod.AnimationClip] = js.native
  
  @JSImport("three", "AnimationClip.CreateFromMorphTargetSequence")
  @js.native
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typings.three.animationClipMod.AnimationClip = js.native
  
  @JSImport("three", "AnimationClip.findByName")
  @js.native
  def findByName(clipArray: js.Array[typings.three.animationClipMod.AnimationClip], name: String): typings.three.animationClipMod.AnimationClip = js.native
  
  @JSImport("three", "AnimationClip.parse")
  @js.native
  def parse(json: js.Any): typings.three.animationClipMod.AnimationClip = js.native
  
  @JSImport("three", "AnimationClip.parseAnimation")
  @js.native
  def parseAnimation(animation: js.Any, bones: js.Array[typings.three.boneMod.Bone]): typings.three.animationClipMod.AnimationClip = js.native
  
  @JSImport("three", "AnimationClip.toJSON")
  @js.native
  def toJSON(clip: typings.three.animationClipMod.AnimationClip): js.Any = js.native
}
