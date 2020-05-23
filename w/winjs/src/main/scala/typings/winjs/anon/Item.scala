package typings.winjs.anon

import typings.winjs.WinJS.Utilities.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item[T] extends js.Object {
  var item: T
  var position: IPosition
}

object Item {
  @scala.inline
  def apply[T](item: T, position: IPosition): Item[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[T]]
  }
}

