package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buckets extends js.Object {
  var buckets: Double
  var granularity: js.UndefOr[js.Any] = js.undefined
  var groupBy: js.Any
  var output: js.UndefOr[js.Object] = js.undefined
}

object Buckets {
  @scala.inline
  def apply(buckets: Double, groupBy: js.Any, granularity: js.Any = null, output: js.Object = null): Buckets = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buckets]
  }
}

