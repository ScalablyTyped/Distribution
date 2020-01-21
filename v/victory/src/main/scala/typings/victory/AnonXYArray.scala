package typings.victory

import typings.victory.mod._CategoryPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXYArray extends _CategoryPropType {
  var x: js.Array[String]
  var y: js.Array[String]
}

object AnonXYArray {
  @scala.inline
  def apply(x: js.Array[String], y: js.Array[String]): AnonXYArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonXYArray]
  }
}

