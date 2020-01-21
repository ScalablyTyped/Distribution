package typings.webpagetest

import typings.webpagetest.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  var location: js.Array[Location]
}

object AnonLocation {
  @scala.inline
  def apply(location: js.Array[Location]): AnonLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocation]
  }
}

