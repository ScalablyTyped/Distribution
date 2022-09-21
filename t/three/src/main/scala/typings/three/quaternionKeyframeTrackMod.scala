package typings.three

import typings.three.keyframeTrackMod.KeyframeTrack
import typings.three.srcConstantsMod.InterpolationModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quaternionKeyframeTrackMod {
  
  @JSImport("three/src/animation/tracks/QuaternionKeyframeTrack", "QuaternionKeyframeTrack")
  @js.native
  open class QuaternionKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: js.Array[Any], values: js.Array[Any]) = this()
    def this(name: String, times: js.Array[Any], values: js.Array[Any], interpolation: InterpolationModes) = this()
  }
}
