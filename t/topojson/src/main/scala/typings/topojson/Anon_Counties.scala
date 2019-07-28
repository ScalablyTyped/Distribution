package typings.topojson

import typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Counties extends js.Object {
  var counties: Anon_Geometries
  var nation: GeometryCollection[js.Object]
  var states: Anon_Geometries
}

object Anon_Counties {
  @scala.inline
  def apply(counties: Anon_Geometries, nation: GeometryCollection[js.Object], states: Anon_Geometries): Anon_Counties = {
    val __obj = js.Dynamic.literal(counties = counties, nation = nation, states = states)
  
    __obj.asInstanceOf[Anon_Counties]
  }
}

