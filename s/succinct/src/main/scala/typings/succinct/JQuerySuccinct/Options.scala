package typings.succinct.JQuerySuccinct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ignore: js.UndefOr[Boolean] = js.undefined
  var omission: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(ignore: js.UndefOr[Boolean] = js.undefined, omission: String = null, size: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore)
    if (omission != null) __obj.updateDynamic("omission")(omission)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

