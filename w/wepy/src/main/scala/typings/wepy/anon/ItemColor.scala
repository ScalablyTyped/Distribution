package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemColor extends js.Object {
  var itemColor: String
  var itemList: js.Array[String]
}

object ItemColor {
  @scala.inline
  def apply(itemColor: String, itemList: js.Array[String]): ItemColor = {
    val __obj = js.Dynamic.literal(itemColor = itemColor.asInstanceOf[js.Any], itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemColor]
  }
}

