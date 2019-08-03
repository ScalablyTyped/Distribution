package typings.wxDashServerDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buckets extends js.Object {
  var buckets: Double
  var granularity: js.UndefOr[js.Any] = js.undefined
  var groupBy: js.Any
  var output: js.UndefOr[js.Object] = js.undefined
}

object Anon_Buckets {
  @scala.inline
  def apply(buckets: Double, groupBy: js.Any, granularity: js.Any = null, output: js.Object = null): Anon_Buckets = {
    val __obj = js.Dynamic.literal(buckets = buckets, groupBy = groupBy)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[Anon_Buckets]
  }
}

