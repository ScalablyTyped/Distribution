package typings.three.srcAnimationAnimationClipMod

import typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack
import typings.three.srcCoreGeometryMod.MorphTarget
import typings.three.srcObjectsBoneMod.Bone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/AnimationClip", "AnimationClip")
@js.native
class AnimationClip () extends js.Object {
  def this(name: String) = this()
  def this(name: String, duration: Double) = this()
  def this(name: String, duration: Double, tracks: js.Array[KeyframeTrack]) = this()
  var duration: Double = js.native
  var name: String = js.native
  var results: js.Array[_] = js.native
  var tracks: js.Array[KeyframeTrack] = js.native
  var uuid: String = js.native
  def optimize(): AnimationClip = js.native
  def resetDuration(): Unit = js.native
  def trim(): AnimationClip = js.native
}

/* static members */
@JSImport("three/src/animation/AnimationClip", "AnimationClip")
@js.native
object AnimationClip extends js.Object {
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[AnimationClip] = js.native
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): AnimationClip = js.native
  def findByName(clipArray: js.Array[AnimationClip], name: String): AnimationClip = js.native
  def parse(json: js.Any): AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[Bone], nodeName: String): AnimationClip = js.native
  def toJSON(): js.Any = js.native
}

