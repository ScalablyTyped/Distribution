package typings.uuid.interfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V1Options extends js.Object {
  var clockseq: js.UndefOr[Double] = js.undefined
  var msecs: js.UndefOr[Double | Date] = js.undefined
  var node: js.UndefOr[InputBuffer] = js.undefined
  var nsecs: js.UndefOr[Double] = js.undefined
}

object V1Options {
  @scala.inline
  def apply(
    clockseq: Int | Double = null,
    msecs: Double | Date = null,
    node: InputBuffer = null,
    nsecs: Int | Double = null
  ): V1Options = {
    val __obj = js.Dynamic.literal()
    if (clockseq != null) __obj.updateDynamic("clockseq")(clockseq.asInstanceOf[js.Any])
    if (msecs != null) __obj.updateDynamic("msecs")(msecs.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (nsecs != null) __obj.updateDynamic("nsecs")(nsecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[V1Options]
  }
}

