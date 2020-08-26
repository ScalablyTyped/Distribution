package typings.topojson.anon

import typings.topojsonSpecification.mod.GeometryCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Counties extends js.Object {
  var counties: Geometries = js.native
  var nation: GeometryCollection[js.Object] = js.native
  var states: Geometries = js.native
}

object Counties {
  @scala.inline
  def apply(counties: Geometries, nation: GeometryCollection[js.Object], states: Geometries): Counties = {
    val __obj = js.Dynamic.literal(counties = counties.asInstanceOf[js.Any], nation = nation.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counties]
  }
  @scala.inline
  implicit class CountiesOps[Self <: Counties] (val x: Self) extends AnyVal {
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
    def setCounties(value: Geometries): Self = this.set("counties", value.asInstanceOf[js.Any])
    @scala.inline
    def setNation(value: GeometryCollection[js.Object]): Self = this.set("nation", value.asInstanceOf[js.Any])
    @scala.inline
    def setStates(value: Geometries): Self = this.set("states", value.asInstanceOf[js.Any])
  }
  
}

