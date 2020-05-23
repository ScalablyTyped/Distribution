package typings.webpagetest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var location: js.Array[typings.webpagetest.mod.Location]
}

object Location {
  @scala.inline
  def apply(location: js.Array[typings.webpagetest.mod.Location]): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

