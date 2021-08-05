package typings.three

import typings.three.boneMod.Bone
import typings.three.constantsMod.AnimationBlendMode
import typings.three.geometryMod.MorphTarget
import typings.three.keyframeTrackMod.KeyframeTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationClipMod {
  
  @JSImport("three/src/animation/AnimationClip", "AnimationClip")
  @js.native
  class AnimationClip () extends StObject {
    def this(name: String) = this()
    def this(name: String, duration: Double) = this()
    def this(name: Unit, duration: Double) = this()
    def this(name: String, duration: Double, tracks: js.Array[KeyframeTrack]) = this()
    def this(name: String, duration: Unit, tracks: js.Array[KeyframeTrack]) = this()
    def this(name: Unit, duration: Double, tracks: js.Array[KeyframeTrack]) = this()
    def this(name: Unit, duration: Unit, tracks: js.Array[KeyframeTrack]) = this()
    def this(name: String, duration: Double, tracks: js.Array[KeyframeTrack], blendMode: AnimationBlendMode) = this()
    def this(name: String, duration: Double, tracks: Unit, blendMode: AnimationBlendMode) = this()
    def this(name: String, duration: Unit, tracks: js.Array[KeyframeTrack], blendMode: AnimationBlendMode) = this()
    def this(name: String, duration: Unit, tracks: Unit, blendMode: AnimationBlendMode) = this()
    def this(name: Unit, duration: Double, tracks: js.Array[KeyframeTrack], blendMode: AnimationBlendMode) = this()
    def this(name: Unit, duration: Double, tracks: Unit, blendMode: AnimationBlendMode) = this()
    def this(name: Unit, duration: Unit, tracks: js.Array[KeyframeTrack], blendMode: AnimationBlendMode) = this()
    def this(name: Unit, duration: Unit, tracks: Unit, blendMode: AnimationBlendMode) = this()
    
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
    
    var results: js.Array[js.Any] = js.native
    
    var tracks: js.Array[KeyframeTrack] = js.native
    
    def trim(): AnimationClip = js.native
    
    var uuid: String = js.native
    
    def validate(): Boolean = js.native
  }
  /* static members */
  object AnimationClip {
    
    @JSImport("three/src/animation/AnimationClip", "AnimationClip")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[AnimationClip] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateClipsFromMorphTargetSequences")(morphTargets.asInstanceOf[js.Any], fps.asInstanceOf[js.Any], noLoop.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnimationClip]]
    
    inline def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromMorphTargetSequence")(name.asInstanceOf[js.Any], morphTargetSequence.asInstanceOf[js.Any], fps.asInstanceOf[js.Any], noLoop.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
    
    inline def findByName(clipArray: js.Array[AnimationClip], name: String): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("findByName")(clipArray.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
    
    inline def parse(json: js.Any): AnimationClip = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any]).asInstanceOf[AnimationClip]
    
    inline def parseAnimation(animation: js.Any, bones: js.Array[Bone]): AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAnimation")(animation.asInstanceOf[js.Any], bones.asInstanceOf[js.Any])).asInstanceOf[AnimationClip]
    
    inline def toJSON(clip: AnimationClip): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(clip.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
