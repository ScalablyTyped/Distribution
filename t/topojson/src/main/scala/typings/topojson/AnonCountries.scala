package typings.topojson

import typings.topojsonSpecification.mod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountries extends js.Object {
  var countries: AnonGeometries
  var land: GeometryCollection[js.Object]
}

object AnonCountries {
  @scala.inline
  def apply(countries: AnonGeometries, land: GeometryCollection[js.Object]): AnonCountries = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], land = land.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountries]
  }
}

