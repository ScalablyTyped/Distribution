package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptionsArray extends js.Object {
  var options: js.Array[String]
}

object AnonOptionsArray {
  @scala.inline
  def apply(options: js.Array[String]): AnonOptionsArray = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptionsArray]
  }
}

