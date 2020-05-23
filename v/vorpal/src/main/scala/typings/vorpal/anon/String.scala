package typings.vorpal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  var string: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object String {
  @scala.inline
  def apply(string: js.Array[java.lang.String] = null): String = {
    val __obj = js.Dynamic.literal()
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
}

