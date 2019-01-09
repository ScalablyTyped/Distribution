package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Animation
  extends org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.AnimationClip]
     with org.scalablytyped.runtime.Instantiable1[/* name */ java.lang.String, threeLib.threeMod.AnimationClip]
     with org.scalablytyped.runtime.Instantiable2[
      /* name */ java.lang.String, 
      /* duration */ scala.Double, 
      threeLib.threeMod.AnimationClip
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* name */ java.lang.String, 
      /* duration */ scala.Double, 
      /* tracks */ js.Array[threeLib.threeDashCoreMod.KeyframeTrack], 
      threeLib.threeMod.AnimationClip
    ] {
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

