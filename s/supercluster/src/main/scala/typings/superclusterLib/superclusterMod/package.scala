package typings
package superclusterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object superclusterMod {
  type BBox = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type Clusters = js.Array[Cluster]
  type Point = geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Point, geojsonLib.geojsonMod.GeoJsonProperties]
  type Points = js.Array[Point]
  type TileFeatures = js.Array[TileFeature]
}
