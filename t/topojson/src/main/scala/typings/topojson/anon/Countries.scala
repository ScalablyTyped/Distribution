package typings.topojson.anon

import typings.topojsonSpecification.mod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Countries extends js.Object {
  var countries: Geometries = js.native
  var land: GeometryCollection[js.Object] = js.native
}

object Countries {
  @scala.inline
  def apply(countries: Geometries, land: GeometryCollection[js.Object]): Countries = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], land = land.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countries]
  }
  @scala.inline
  implicit class CountriesOps[Self <: Countries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountries(value: Geometries): Self = this.set("countries", value.asInstanceOf[js.Any])
    @scala.inline
    def setLand(value: GeometryCollection[js.Object]): Self = this.set("land", value.asInstanceOf[js.Any])
  }
  
}

