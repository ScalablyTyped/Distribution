package typings.topojson.mod

import typings.topojsonSpecification.mod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson", "neighbors")
@js.native
object neighbors extends js.Object {
  def apply(objects: js.Array[GeometryObject[js.Object]]): js.Array[js.Array[Double]] = js.native
}

