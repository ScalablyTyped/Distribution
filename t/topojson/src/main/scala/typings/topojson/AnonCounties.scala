package typings.topojson

import typings.topojsonSpecification.mod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCounties extends js.Object {
  var counties: AnonGeometries
  var nation: GeometryCollection[js.Object]
  var states: AnonGeometries
}

object AnonCounties {
  @scala.inline
  def apply(counties: AnonGeometries, nation: GeometryCollection[js.Object], states: AnonGeometries): AnonCounties = {
    val __obj = js.Dynamic.literal(counties = counties.asInstanceOf[js.Any], nation = nation.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCounties]
  }
}

