package typings.webpagetest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  var Browsers: String = js.native
  var Label: String = js.native
  var PendingTests: StringDictionary[Double] = js.native
  var id: String = js.native
  var labelShort: String = js.native
  var location: String = js.native
}

object Location {
  @scala.inline
  def apply(
    Browsers: String,
    Label: String,
    PendingTests: StringDictionary[Double],
    id: String,
    labelShort: String,
    location: String
  ): Location = {
    val __obj = js.Dynamic.literal(Browsers = Browsers.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], PendingTests = PendingTests.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labelShort = labelShort.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
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
    def setBrowsers(value: String): Self = this.set("Browsers", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def setPendingTests(value: StringDictionary[Double]): Self = this.set("PendingTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelShort(value: String): Self = this.set("labelShort", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
  }
  
}

