package typings.svgrRollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var babel: Boolean
  var exclude: String
  var include: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(babel: Boolean, exclude: String, include: String = null): Options = {
    val __obj = js.Dynamic.literal(babel = babel.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

