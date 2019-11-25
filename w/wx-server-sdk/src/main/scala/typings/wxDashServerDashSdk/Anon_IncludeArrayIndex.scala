package typings.wxDashServerDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeArrayIndex extends js.Object {
  var includeArrayIndex: js.UndefOr[String] = js.undefined
  var path: String
  var preserveNullAndEmptyArrays: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeArrayIndex {
  @scala.inline
  def apply(
    path: String,
    includeArrayIndex: String = null,
    preserveNullAndEmptyArrays: js.UndefOr[Boolean] = js.undefined
  ): Anon_IncludeArrayIndex = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (includeArrayIndex != null) __obj.updateDynamic("includeArrayIndex")(includeArrayIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveNullAndEmptyArrays)) __obj.updateDynamic("preserveNullAndEmptyArrays")(preserveNullAndEmptyArrays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IncludeArrayIndex]
  }
}

