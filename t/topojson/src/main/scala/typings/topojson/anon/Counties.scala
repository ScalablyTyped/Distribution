package typings.topojson.anon

import typings.topojsonSpecification.mod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counties extends js.Object {
  var counties: Geometries
  var nation: GeometryCollection[js.Object]
  var states: Geometries
}

object Counties {
  @scala.inline
  def apply(counties: Geometries, nation: GeometryCollection[js.Object], states: Geometries): Counties = {
    val __obj = js.Dynamic.literal(counties = counties.asInstanceOf[js.Any], nation = nation.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counties]
  }
}

