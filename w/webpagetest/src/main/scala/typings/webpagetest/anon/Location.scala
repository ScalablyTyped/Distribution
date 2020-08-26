package typings.webpagetest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  var location: js.Array[typings.webpagetest.mod.Location] = js.native
}

object Location {
  @scala.inline
  def apply(location: js.Array[typings.webpagetest.mod.Location]): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setLocationVarargs(value: typings.webpagetest.mod.Location*): Self = this.set("location", js.Array(value :_*))
    @scala.inline
    def setLocation(value: js.Array[typings.webpagetest.mod.Location]): Self = this.set("location", value.asInstanceOf[js.Any])
  }
  
}

