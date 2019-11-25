package typings.topojson

import typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Countries extends js.Object {
  var countries: Anon_Geometries
  var land: GeometryCollection[js.Object]
}

object Anon_Countries {
  @scala.inline
  def apply(countries: Anon_Geometries, land: GeometryCollection[js.Object]): Anon_Countries = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], land = land.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Countries]
  }
}

