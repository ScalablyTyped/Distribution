package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encodable[T] extends js.Object {
  var encode: js.UndefOr[Encode[T]] = js.undefined
}

object Encodable {
  @scala.inline
  def apply[T](encode: Encode[T] = null): Encodable[T] = {
    val __obj = js.Dynamic.literal()
    if (encode != null) __obj.updateDynamic("encode")(encode)
    __obj.asInstanceOf[Encodable[T]]
  }
}

