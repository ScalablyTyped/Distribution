package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExclude extends js.Object {
  var exclude: js.Array[String]
  var format: String
}

object AnonExclude {
  @scala.inline
  def apply(exclude: js.Array[String], format: String): AnonExclude = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExclude]
  }
}

