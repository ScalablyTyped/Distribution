package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replace extends js.Object {
  var replace: js.UndefOr[String | Boolean] = js.undefined
}

object Replace {
  @scala.inline
  def apply(replace: String | Boolean = null): Replace = {
    val __obj = js.Dynamic.literal()
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
}

