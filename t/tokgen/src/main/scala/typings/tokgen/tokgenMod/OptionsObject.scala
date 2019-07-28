package typings.tokgen.tokgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsObject extends js.Object {
  var chars: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
}

object OptionsObject {
  @scala.inline
  def apply(chars: String = null, length: Int | Double = null): OptionsObject = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsObject]
  }
}

