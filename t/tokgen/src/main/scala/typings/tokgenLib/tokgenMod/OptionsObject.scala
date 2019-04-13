package typings
package tokgenLib.tokgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsObject extends js.Object {
  var chars: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
}

object OptionsObject {
  @scala.inline
  def apply(chars: java.lang.String = null, length: scala.Int | scala.Double = null): OptionsObject = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsObject]
  }
}

