package typings.victory

import typings.victory.mod._CategoryPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonYArray extends _CategoryPropType {
  var y: js.Array[String]
}

object AnonYArray {
  @scala.inline
  def apply(y: js.Array[String]): AnonYArray = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonYArray]
  }
}

