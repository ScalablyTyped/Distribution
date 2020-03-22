package typings.uuid.interfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V1RngOptions
  extends RngOptions
     with V1BaseOptions
     with V1Options

object V1RngOptions {
  @scala.inline
  def apply(
    clockseq: Int | Double = null,
    msecs: Double | Date = null,
    node: InputBuffer = null,
    nsecs: Int | Double = null,
    rng: () => InputBuffer = null
  ): V1RngOptions = {
    val __obj = js.Dynamic.literal()
    if (clockseq != null) __obj.updateDynamic("clockseq")(clockseq.asInstanceOf[js.Any])
    if (msecs != null) __obj.updateDynamic("msecs")(msecs.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (nsecs != null) __obj.updateDynamic("nsecs")(nsecs.asInstanceOf[js.Any])
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction0(rng))
    __obj.asInstanceOf[V1RngOptions]
  }
}

