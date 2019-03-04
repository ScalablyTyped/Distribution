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
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position)
  
    __obj.asInstanceOf[Anon_Item[T]]
  }
}

