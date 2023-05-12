package typings.three

import typings.std.ArrayLike
import typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack
import typings.three.srcConstantsMod.InterpolationModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnimationTracksStringKeyframeTrackMod {
  
  @JSImport("three/src/animation/tracks/StringKeyframeTrack", "StringKeyframeTrack")
  @js.native
  open class StringKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: ArrayLike[Double], values: ArrayLike[Any]) = this()
    def this(name: String, times: ArrayLike[Double], values: ArrayLike[Any], interpolation: InterpolationModes) = this()
  }
}
