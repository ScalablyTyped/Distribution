package typings.three

import typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack
import typings.three.srcConstantsMod.InterpolationModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/tracks/QuaternionKeyframeTrack", JSImport.Namespace)
@js.native
object srcAnimationTracksQuaternionKeyframeTrackMod extends js.Object {
  @js.native
  class QuaternionKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
  }
  
}

