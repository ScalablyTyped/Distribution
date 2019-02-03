package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "AnimationClip")
@js.native
class AnimationClip () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, duration: scala.Double) = this()
  def this(name: java.lang.String, duration: scala.Double, tracks: js.Array[KeyframeTrack]) = this()
  var duration: scala.Double = js.native
  var name: java.lang.String = js.native
  var results: js.Array[_] = js.native
  var tracks: js.Array[KeyframeTrack] = js.native
  var uuid: java.lang.String = js.native
  def optimize(): AnimationClip = js.native
  def resetDuration(): scala.Unit = js.native
  def trim(): AnimationClip = js.native
}

/* static members */
@JSImport("three/three-core", "AnimationClip")
@js.native
object AnimationClip extends js.Object {
  def CreateClipsFromMorphTargetSequences(
    morphTargets: js.Array[threeLib.threeDashCoreMod.MorphTarget],
    fps: scala.Double,
    noLoop: scala.Boolean
  ): js.Array[threeLib.threeDashCoreMod.AnimationClip] = js.native
  def CreateFromMorphTargetSequence(
    name: java.lang.String,
    morphTargetSequence: js.Array[threeLib.threeDashCoreMod.MorphTarget],
    fps: scala.Double,
    noLoop: scala.Boolean
  ): threeLib.threeDashCoreMod.AnimationClip = js.native
  def findByName(clipArray: js.Array[threeLib.threeDashCoreMod.AnimationClip], name: java.lang.String): threeLib.threeDashCoreMod.AnimationClip = js.native
  def parse(json: js.Any): threeLib.threeDashCoreMod.AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[threeLib.threeDashCoreMod.Bone], nodeName: java.lang.String): threeLib.threeDashCoreMod.AnimationClip = js.native
  def toJSON(): js.Any = js.native
}

