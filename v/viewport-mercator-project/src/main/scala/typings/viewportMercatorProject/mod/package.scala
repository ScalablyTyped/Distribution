package typings.viewportMercatorProject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Bounds = js.Tuple2[
    typings.viewportMercatorProject.mod.Coordinates, 
    typings.viewportMercatorProject.mod.Coordinates
  ]
  type Coordinates = js.Tuple2[scala.Double, scala.Double]
  type CoordinatesZ = js.Tuple3[scala.Double, scala.Double, scala.Double]
  type DistanceScalesInput = (typings.viewportMercatorProject.mod.BaseDistanceScalesInput with typings.viewportMercatorProject.AnonZoom) | (typings.viewportMercatorProject.mod.BaseDistanceScalesInput with typings.viewportMercatorProject.AnonScale)
  type HighPrecisionDistanceScalesInput = (typings.viewportMercatorProject.mod.BaseHighPrecisionDistanceScalesInput with typings.viewportMercatorProject.AnonZoom) | (typings.viewportMercatorProject.mod.BaseHighPrecisionDistanceScalesInput with typings.viewportMercatorProject.AnonScale)
  type Padding = scala.Double | typings.viewportMercatorProject.AnonBottom
  type ViewMatrix = js.Array[scala.Double]
}
