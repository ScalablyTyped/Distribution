package typings.victory

import typings.victory.mod._CategoryPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXArray extends _CategoryPropType {
  var x: js.Array[String]
}

object AnonXArray {
  @scala.inline
  def apply(x: js.Array[String]): AnonXArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonXArray]
  }
}

