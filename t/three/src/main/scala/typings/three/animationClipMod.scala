package typings.three

import typings.three.boneMod.Bone
import typings.three.constantsMod.AnimationBlendMode
import typings.three.geometryMod.MorphTarget
import typings.three.keyframeTrackMod.KeyframeTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationClipMod {
  
  @JSImport("three/src/animation/AnimationClip", "AnimationClip")
  @js.native
  class AnimationClip () extends StObject {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], duration: Double) = this()
    def this(name: String, duration: Double) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      duration: js.UndefOr[scala.Nothing],
      tracks: js.Array[KeyframeTrack]
    ) = this()
    def this(name: js.UndefOr[scala.Nothing], duration: Double, tracks: js.Array[KeyframeTrack]) = this()
    def this(name: String, duration: js.UndefOr[scala.Nothing], tracks: js.Array[KeyframeTrack]) = this()
    def this(name: String, duration: Double, tracks: js.Array[KeyframeTrack]) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      duration: js.UndefOr[scala.Nothing],
      tracks: js.UndefOr[scala.Nothing],
      blendMode: AnimationBlendMode
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      duration: js.UndefOr[scala.Nothing],
      tracks: js.Array[KeyframeTrack],
      blendMode: AnimationBlendMode
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      duration: Double,
      tracks: js.UndefOr[scala.Nothing],
      blendMode: AnimationBlendMode
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      duration: Double,
      tracks: js.Array[KeyframeTrack],
      blendMode: AnimationBlendMode
    ) = this()
    def this(
      name: String,
      duration: js.UndefOr[scala.Nothing],
      tracks: js.UndefOr[scala.Nothing],
      blendMode: AnimationBlendMode
    ) = this()
    def this(
      name: String,
      duration: js.UndefOr[scala.Nothing],
      tracks: js.Array[KeyframeTrack],
      blendMode: AnimationBlendMode
    ) = this()
    def this(name: String, duration: Double, tracks: js.UndefOr[scala.Nothing], blendMode: AnimationBlendMode) = this()
    def this(name: String, duration: Double, tracks: js.Array[KeyframeTrack], blendMode: AnimationBlendMode) = this()
    
    /**
    	 * @default THREE.NormalAnimationBlendMode
    	 */
    var blendMode: AnimationBlendMode = js.native
    
    /**
    	 * @default -1
    	 */
    var duration: Double = js.native
    
    var name: String = js.native
    
    def optimize(): AnimationClip = js.native
    
    def resetDuration(): AnimationClip = js.native
    
    var results: js.Array[_] = js.native
    
    var tracks: js.Array[KeyframeTrack] = js.native
    
    def trim(): AnimationClip = js.native
    
    var uuid: String = js.native
    
    def validate(): Boolean = js.native
  }
  /* static members */
  object AnimationClip {
    
    @JSImport("three/src/animation/AnimationClip", "AnimationClip.CreateClipsFromMorphTargetSequences")
    @js.native
    def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[AnimationClip] = js.native
    
    @JSImport("three/src/animation/AnimationClip", "AnimationClip.CreateFromMorphTargetSequence")
    @js.native
    def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): AnimationClip = js.native
    
    @JSImport("three/src/animation/AnimationClip", "AnimationClip.findByName")
    @js.native
    def findByName(clipArray: js.Array[AnimationClip], name: String): AnimationClip = js.native
    
    @JSImport("three/src/animation/AnimationClip", "AnimationClip.parse")
    @js.native
    def parse(json: js.Any): AnimationClip = js.native
    
    @JSImport("three/src/animation/AnimationClip", "AnimationClip.parseAnimation")
    @js.native
    def parseAnimation(animation: js.Any, bones: js.Array[Bone]): AnimationClip = js.native
    
    @JSImport("three/src/animation/AnimationClip", "AnimationClip.toJSON")
    @js.native
    def toJSON(clip: AnimationClip): js.Any = js.native
  }
}
