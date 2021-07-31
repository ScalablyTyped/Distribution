package typings.three

import typings.three.constantsMod.InterpolationModes
import typings.three.keyframeTrackMod.KeyframeTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringKeyframeTrackMod {
  
  @JSImport("three/src/animation/tracks/StringKeyframeTrack", "StringKeyframeTrack")
  @js.native
  class StringKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any]) = this()
    def this(name: String, times: js.Array[js.Any], values: js.Array[js.Any], interpolation: InterpolationModes) = this()
  }
}
