package typings.winjs

import typings.winjs.WinJS.Utilities.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem[T] extends js.Object {
  var item: T
  var position: IPosition
}

object AnonItem {
  @scala.inline
  def apply[T](item: T, position: IPosition): AnonItem[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem[T]]
  }
}

