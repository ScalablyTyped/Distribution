package typings.winjs

import typings.winjs.WinJSNs.UtilitiesNs.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item[T] extends js.Object {
  var item: T
  var position: IPosition
}

object Anon_Item {
  @scala.inline
  def apply[T](item: T, position: IPosition): Anon_Item[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position)
  
    __obj.asInstanceOf[Anon_Item[T]]
  }
}

