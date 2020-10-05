package typings.three

import typings.three.constantsMod.InterpolationModes
import typings.three.keyframeTrackMod.KeyframeTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/animation/tracks/VectorKeyframeTrack", JSImport.Namespace)
@js.native
object vectorKeyframeTrackMod extends js.Object {
  @js.native
  class VectorKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
  }
  
}

