package typings.victory.anon

import typings.victory.mod._CategoryPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YArray extends _CategoryPropType {
  var y: js.Array[String]
}

object YArray {
  @scala.inline
  def apply(y: js.Array[String]): YArray = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[YArray]
  }
}

