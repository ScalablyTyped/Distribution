package typings.atWebpackDashBlocksCore.atWebpackDashBlocksCoreMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchOptions extends js.Object {
  var exclude: js.UndefOr[RegExp] = js.undefined
  var include: js.UndefOr[String] = js.undefined
}

object MatchOptions {
  @scala.inline
  def apply(exclude: RegExp = null, include: String = null): MatchOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchOptions]
  }
}

