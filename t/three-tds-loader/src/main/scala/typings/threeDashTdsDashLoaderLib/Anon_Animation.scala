package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Animation
  extends org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.AnimationClip] {
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

