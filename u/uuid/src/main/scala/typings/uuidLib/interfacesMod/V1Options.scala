package typings
package uuidLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V1Options extends js.Object {
  var clockseq: js.UndefOr[scala.Double] = js.undefined
  var msecs: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  var node: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var nsecs: js.UndefOr[scala.Double] = js.undefined
}

object V1Options {
  @scala.inline
  def apply(
    clockseq: scala.Int | scala.Double = null,
    msecs: scala.Double | stdLib.Date = null,
    node: js.Array[scala.Double] = null,
    nsecs: scala.Int | scala.Double = null
  ): V1Options = {
    val __obj = js.Dynamic.literal()
    if (clockseq != null) __obj.updateDynamic("clockseq")(clockseq.asInstanceOf[js.Any])
    if (msecs != null) __obj.updateDynamic("msecs")(msecs.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (nsecs != null) __obj.updateDynamic("nsecs")(nsecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[V1Options]
  }
}

