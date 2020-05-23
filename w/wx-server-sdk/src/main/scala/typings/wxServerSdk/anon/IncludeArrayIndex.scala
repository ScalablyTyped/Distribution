package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeArrayIndex extends js.Object {
  var includeArrayIndex: js.UndefOr[String] = js.undefined
  var path: String
  var preserveNullAndEmptyArrays: js.UndefOr[Boolean] = js.undefined
}

object IncludeArrayIndex {
  @scala.inline
  def apply(
    path: String,
    includeArrayIndex: String = null,
    preserveNullAndEmptyArrays: js.UndefOr[Boolean] = js.undefined
  ): IncludeArrayIndex = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (includeArrayIndex != null) __obj.updateDynamic("includeArrayIndex")(includeArrayIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveNullAndEmptyArrays)) __obj.updateDynamic("preserveNullAndEmptyArrays")(preserveNullAndEmptyArrays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeArrayIndex]
  }
}

