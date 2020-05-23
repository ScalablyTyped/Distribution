package typings.unusedFilesWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ignore extends js.Object {
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Ignore {
  @scala.inline
  def apply(ignore: String | js.Array[String] = null): Ignore = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ignore]
  }
}

