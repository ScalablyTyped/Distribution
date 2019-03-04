package typings
package topojsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Countries extends js.Object {
  var countries: Anon_Geometries
  var land: topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryCollection[js.Object]
}

object Anon_Countries {
  @scala.inline
  def apply(
    countries: Anon_Geometries,
    land: topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryCollection[js.Object]
  ): Anon_Countries = {
    val __obj = js.Dynamic.literal(countries = countries, land = land)
  
    __obj.asInstanceOf[Anon_Countries]
  }
}

