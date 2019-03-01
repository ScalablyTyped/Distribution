package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item[T] extends js.Object {
  var item: T
  var position: winjsLib.WinJSNs.UtilitiesNs.IPosition
}

object Anon_Item {
  @scala.inline
  def apply[T](item: T, position: winjsLib.WinJSNs.UtilitiesNs.IPosition): Anon_Item[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Item[T]]
  }
}

