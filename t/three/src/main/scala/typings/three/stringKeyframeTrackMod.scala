package typings.three

import typings.three.keyframeTrackMod.KeyframeTrack
import typings.three.srcConstantsMod.InterpolationModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringKeyframeTrackMod {
  
  @JSImport("three/src/animation/tracks/StringKeyframeTrack", "StringKeyframeTrack")
  @js.native
  open class StringKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: js.Array[Any], values: js.Array[Any]) = this()
    def this(name: String, times: js.Array[Any], values: js.Array[Any], interpolation: InterpolationModes) = this()
  }
}
