package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemColor extends js.Object {
  var itemColor: String
  var itemList: js.Array[String]
}

object Anon_ItemColor {
  @scala.inline
  def apply(itemColor: String, itemList: js.Array[String]): Anon_ItemColor = {
    val __obj = js.Dynamic.literal(itemColor = itemColor.asInstanceOf[js.Any], itemList = itemList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemColor]
  }
}

