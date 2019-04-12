package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "AnimationClip")
@js.native
class AnimationClip ()
  extends threeLib.srcAnimationAnimationClipMod.AnimationClip {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, duration: scala.Double) = this()
  def this(name: java.lang.String, duration: scala.Double, tracks: js.Array[threeLib.srcAnimationKeyframeTrackMod.KeyframeTrack]) = this()
}

/* static members */
@JSImport("three", "AnimationClip")
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

