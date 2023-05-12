package typings.three.buildThreeMod

import typings.std.ArrayLike
import typings.three.srcConstantsMod.InterpolationModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "VectorKeyframeTrack")
@js.native
open class VectorKeyframeTrack protected ()
  extends typings.three.srcThreeMod.VectorKeyframeTrack {
  def this(name: String, times: ArrayLike[Double], values: ArrayLike[Double]) = this()
  def this(
    name: String,
    times: ArrayLike[Double],
    values: ArrayLike[Double],
    interpolation: InterpolationModes
  ) = this()
}
