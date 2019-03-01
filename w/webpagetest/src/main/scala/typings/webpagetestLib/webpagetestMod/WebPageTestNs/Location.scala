package typings
package webpagetestLib.webpagetestMod.WebPageTestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var Browsers: java.lang.String
  var Label: java.lang.String
  var PendingTests: org.scalablytyped.runtime.StringDictionary[scala.Double]
  var id: java.lang.String
  var labelShort: java.lang.String
  var location: java.lang.String
}

object Location {
  @scala.inline
  def apply(
    Browsers: java.lang.String,
    Label: java.lang.String,
    PendingTests: org.scalablytyped.runtime.StringDictionary[scala.Double],
    id: java.lang.String,
    labelShort: java.lang.String,
    location: java.lang.String
  ): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Browsers")(Browsers)
    __obj.updateDynamic("Label")(Label)
    __obj.updateDynamic("PendingTests")(PendingTests)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("labelShort")(labelShort)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[Location]
  }
}

