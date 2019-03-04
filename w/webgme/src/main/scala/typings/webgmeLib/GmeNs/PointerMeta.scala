package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerMeta extends js.Object {
  var items: js.Array[webgmeLib.Anon_Id]
  /**
    * the maximum allowed targets for a pointer is 1.
    * more than 1 requires a set.
    */
  var max: scala.Double
}

object PointerMeta {
  @scala.inline
  def apply(items: js.Array[webgmeLib.Anon_Id], max: scala.Double): PointerMeta = {
    val __obj = js.Dynamic.literal(items = items, max = max)
  
    __obj.asInstanceOf[PointerMeta]
  }
}

