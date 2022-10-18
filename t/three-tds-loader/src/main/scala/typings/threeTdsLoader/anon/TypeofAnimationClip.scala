package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.Instantiable0
import typings.three.mod.AnimationClip
import typings.three.srcAnimationAnimationClipMod.MorphTarget
import typings.three.srcObjectsBoneMod.Bone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimationClip
  extends StObject
     with Instantiable0[AnimationClip] {
  
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typings.three.srcAnimationAnimationClipMod.AnimationClip] = js.native
  
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typings.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  
  def findByName(clipArray: js.Array[typings.three.srcAnimationAnimationClipMod.AnimationClip], name: String): typings.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  
  def parse(json: Any): typings.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  
  def parseAnimation(animation: Any, bones: js.Array[Bone]): typings.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  
  def toJSON(clip: typings.three.srcAnimationAnimationClipMod.AnimationClip): Any = js.native
}
