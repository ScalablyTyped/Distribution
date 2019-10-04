package typings.unusedDashFilesDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ignore extends js.Object {
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Anon_Ignore {
  @scala.inline
  def apply(ignore: String | js.Array[String] = null): Anon_Ignore = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ignore]
  }
}

