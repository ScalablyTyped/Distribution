package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdNumber extends js.Object {
  var id: String | Double
}

object AnonIdNumber {
  @scala.inline
  def apply(id: String | Double): AnonIdNumber = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdNumber]
  }
}

