package typings
package threeLib.srcAnimationAnimationClipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/AnimationClip", "AnimationClip")
@js.native
class AnimationClip () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, duration: scala.Double) = this()
  def this(name: java.lang.String, duration: scala.Double, tracks: js.Array[threeLib.srcAnimationKeyframeTrackMod.KeyframeTrack]) = this()
  var duration: scala.Double = js.native
  var name: java.lang.String = js.native
  var results: js.Array[_] = js.native
  var tracks: js.Array[threeLib.srcAnimationKeyframeTrackMod.KeyframeTrack] = js.native
  var uuid: java.lang.String = js.native
  def optimize(): AnimationClip = js.native
  def resetDuration(): scala.Unit = js.native
  def trim(): AnimationClip = js.native
}

/* static members */
@JSImport("three/src/animation/AnimationClip", "AnimationClip")
@js.native
object AnimationClip extends js.Object {
  def CreateClipsFromMorphTargetSequences(
    morphTargets: js.Array[threeLib.srcCoreGeometryMod.MorphTarget],
    fps: scala.Double,
    noLoop: scala.Boolean
  ): js.Array[threeLib.srcAnimationAnimationClipMod.AnimationClip] = js.native
  def CreateFromMorphTargetSequence(
    name: java.lang.String,
    morphTargetSequence: js.Array[threeLib.srcCoreGeometryMod.MorphTarget],
    fps: scala.Double,
    noLoop: scala.Boolean
  ): threeLib.srcAnimationAnimationClipMod.AnimationClip = js.native
  def findByName(clipArray: js.Array[threeLib.srcAnimationAnimationClipMod.AnimationClip], name: java.lang.String): threeLib.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parse(json: js.Any): threeLib.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[threeLib.srcObjectsBoneMod.Bone], nodeName: java.lang.String): threeLib.srcAnimationAnimationClipMod.AnimationClip = js.native
  def toJSON(): js.Any = js.native
}

