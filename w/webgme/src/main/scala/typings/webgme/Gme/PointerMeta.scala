package typings.webgme.Gme

import typings.webgme.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerMeta extends js.Object {
  var items: js.Array[Id]
  /**
    * the maximum allowed targets for a pointer is 1.
    * more than 1 requires a set.
    */
  var max: Double
}

object PointerMeta {
  @scala.inline
  def apply(items: js.Array[Id], max: Double): PointerMeta = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerMeta]
  }
}

