package typings
package viewportDashMercatorDashProjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewportDashMercatorDashProjectMod {
  type Bounds = js.Tuple2[Coordinates, Coordinates]
  type Coordinates = js.Tuple2[scala.Double, scala.Double]
  type CoordinatesZ = js.Tuple3[scala.Double, scala.Double, scala.Double]
  type DistanceScalesInput = BaseDistanceScalesInput with (viewportDashMercatorDashProjectLib.Anon_Zoom | BaseDistanceScalesInput) with viewportDashMercatorDashProjectLib.Anon_Scale
  type HighPrecisionDistanceScalesInput = BaseHighPrecisionDistanceScalesInput with (viewportDashMercatorDashProjectLib.Anon_Zoom | BaseHighPrecisionDistanceScalesInput) with viewportDashMercatorDashProjectLib.Anon_Scale
  type Padding = scala.Double | viewportDashMercatorDashProjectLib.Anon_Bottom
  type ViewMatrix = js.Array[scala.Double]
}
