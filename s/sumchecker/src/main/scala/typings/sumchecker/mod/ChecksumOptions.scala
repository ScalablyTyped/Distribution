package typings.sumchecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksumOptions extends js.Object {
  var defaultTextEncoding: js.UndefOr[String] = js.undefined
}

object ChecksumOptions {
  @scala.inline
  def apply(defaultTextEncoding: String = null): ChecksumOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultTextEncoding != null) __obj.updateDynamic("defaultTextEncoding")(defaultTextEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksumOptions]
  }
}

