package typings.topojson.anon

import typings.topojsonSpecification.mod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Countries extends js.Object {
  var countries: Geometries
  var land: GeometryCollection[js.Object]
}

object Countries {
  @scala.inline
  def apply(countries: Geometries, land: GeometryCollection[js.Object]): Countries = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], land = land.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countries]
  }
}

