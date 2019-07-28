package typings.viewportDashMercatorDashProject

import typings.viewportDashMercatorDashProject.Anon_Bottom
import typings.viewportDashMercatorDashProject.Anon_Scale
import typings.viewportDashMercatorDashProject.Anon_Zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewportDashMercatorDashProjectMod {
  type Bounds = js.Tuple2[Coordinates, Coordinates]
  type Coordinates = js.Tuple2[Double, Double]
  type CoordinatesZ = js.Tuple3[Double, Double, Double]
  type DistanceScalesInput = (BaseDistanceScalesInput with Anon_Zoom) | (BaseDistanceScalesInput with Anon_Scale)
  type HighPrecisionDistanceScalesInput = (BaseHighPrecisionDistanceScalesInput with Anon_Zoom) | (BaseHighPrecisionDistanceScalesInput with Anon_Scale)
  type Padding = Double | Anon_Bottom
  type ViewMatrix = js.Array[Double]
}
