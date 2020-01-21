package typings.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReplace extends js.Object {
  var replace: js.UndefOr[String | Boolean] = js.undefined
}

object AnonReplace {
  @scala.inline
  def apply(replace: String | Boolean = null): AnonReplace = {
    val __obj = js.Dynamic.literal()
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReplace]
  }
}

