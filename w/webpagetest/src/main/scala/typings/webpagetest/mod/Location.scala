package typings.webpagetest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var Browsers: String
  var Label: String
  var PendingTests: StringDictionary[Double]
  var id: String
  var labelShort: String
  var location: String
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
}

