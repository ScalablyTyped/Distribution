package typings.three

import typings.std.ArrayLike
import typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack
import typings.three.srcConstantsMod.InterpolationModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnimationTracksNumberKeyframeTrackMod {
  
  @JSImport("three/src/animation/tracks/NumberKeyframeTrack", "NumberKeyframeTrack")
  @js.native
  open class NumberKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: ArrayLike[Double], values: ArrayLike[Double]) = this()
    def this(
      name: String,
      times: ArrayLike[Double],
      values: ArrayLike[Double],
      interpolation: InterpolationModes
    ) = this()
  }
}
