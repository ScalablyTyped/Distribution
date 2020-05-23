package typings.uuid.interfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V1RandomOptions
  extends RandomOptions
     with V1BaseOptions
     with V1Options

object V1RandomOptions {
  @scala.inline
  def apply(
    clockseq: js.UndefOr[Double] = js.undefined,
    msecs: Double | Date = null,
    node: InputBuffer = null,
    nsecs: js.UndefOr[Double] = js.undefined,
    random: InputBuffer = null
  ): V1RandomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clockseq)) __obj.updateDynamic("clockseq")(clockseq.get.asInstanceOf[js.Any])
    if (msecs != null) __obj.updateDynamic("msecs")(msecs.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (!js.isUndefined(nsecs)) __obj.updateDynamic("nsecs")(nsecs.get.asInstanceOf[js.Any])
    if (random != null) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    __obj.asInstanceOf[V1RandomOptions]
  }
}

