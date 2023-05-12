package typings.three.srcThreeMod

import typings.std.ArrayLike
import typings.three.srcConstantsMod.InterpolationModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "VectorKeyframeTrack")
@js.native
open class VectorKeyframeTrack protected ()
  extends typings.three.srcAnimationTracksVectorKeyframeTrackMod.VectorKeyframeTrack {
  def this(name: String, times: ArrayLike[Double], values: ArrayLike[Double]) = this()
  def this(
    name: String,
    times: ArrayLike[Double],
    values: ArrayLike[Double],
    interpolation: InterpolationModes
  ) = this()
}
