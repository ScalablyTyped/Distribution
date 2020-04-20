package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemColor extends js.Object {
  var itemColor: String
  var itemList: js.Array[String]
}

object AnonItemColor {
  @scala.inline
  def apply(itemColor: String, itemList: js.Array[String]): AnonItemColor = {
    val __obj = js.Dynamic.literal(itemColor = itemColor.asInstanceOf[js.Any], itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemColor]
  }
}

