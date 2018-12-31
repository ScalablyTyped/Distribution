package typings
package topojsonLib.topojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldAtlas
  extends topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ] {
  @JSName("bbox")
  var bbox_WorldAtlas: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  @JSName("objects")
  var objects_WorldAtlas: topojsonLib.Anon_Countries
  @JSName("transform")
  var transform_WorldAtlas: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Transform
}

