package typings.wikidataDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseInsensitive extends js.Object {
  var caseInsensitive: js.UndefOr[Boolean] = js.undefined
  var keepProperties: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object Anon_CaseInsensitive {
  @scala.inline
  def apply(
    caseInsensitive: js.UndefOr[Boolean] = js.undefined,
    keepProperties: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null
  ): Anon_CaseInsensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive)
    if (!js.isUndefined(keepProperties)) __obj.updateDynamic("keepProperties")(keepProperties)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CaseInsensitive]
  }
}

