package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemColor extends js.Object {
  var itemColor: java.lang.String
  var itemList: js.Array[java.lang.String]
}

object Anon_ItemColor {
  @scala.inline
  def apply(itemColor: java.lang.String, itemList: js.Array[java.lang.String]): Anon_ItemColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("itemColor")(itemColor)
    __obj.updateDynamic("itemList")(itemList)
    __obj.asInstanceOf[Anon_ItemColor]
  }
}

