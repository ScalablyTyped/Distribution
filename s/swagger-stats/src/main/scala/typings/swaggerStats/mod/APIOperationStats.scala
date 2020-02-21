package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIOperationStats extends js.Object {
  var defs: js.UndefOr[APIOperationDefinition] = js.undefined
  var details: js.UndefOr[APIOperationDefinition] = js.undefined
  var stats: js.UndefOr[APIOperationDefinition] = js.undefined
}

object APIOperationStats {
  @scala.inline
  def apply(
    defs: APIOperationDefinition = null,
    details: APIOperationDefinition = null,
    stats: APIOperationDefinition = null
  ): APIOperationStats = {
    val __obj = js.Dynamic.literal()
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIOperationStats]
  }
}

