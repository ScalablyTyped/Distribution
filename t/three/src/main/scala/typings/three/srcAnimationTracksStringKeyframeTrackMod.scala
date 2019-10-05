package typings.three

import typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack
import typings.three.srcConstantsMod.InterpolationModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/tracks/StringKeyframeTrack", JSImport.Namespace)
@js.native
object srcAnimationTracksStringKeyframeTrackMod extends js.Object {
  @js.native
  class StringKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
  }
  
}

