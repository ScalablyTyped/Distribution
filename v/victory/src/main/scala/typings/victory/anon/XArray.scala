package typings.victory.anon

import typings.victory.mod._CategoryPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XArray extends _CategoryPropType {
  var x: js.Array[String]
}

object XArray {
  @scala.inline
  def apply(x: js.Array[String]): XArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[XArray]
  }
}

