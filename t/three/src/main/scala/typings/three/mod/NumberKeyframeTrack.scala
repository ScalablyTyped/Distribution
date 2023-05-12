package typings.three.mod

import typings.std.ArrayLike
import typings.three.srcConstantsMod.InterpolationModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "NumberKeyframeTrack")
@js.native
open class NumberKeyframeTrack protected ()
  extends typings.three.srcThreeMod.NumberKeyframeTrack {
  def this(name: String, times: ArrayLike[Double], values: ArrayLike[Double]) = this()
  def this(
    name: String,
    times: ArrayLike[Double],
    values: ArrayLike[Double],
    interpolation: InterpolationModes
  ) = this()
}
