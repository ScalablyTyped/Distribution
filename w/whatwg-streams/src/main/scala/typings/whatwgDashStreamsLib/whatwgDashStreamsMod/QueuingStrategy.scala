package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuingStrategy[T] extends js.Object {
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[js.Function1[/* chunk */ T, scala.Double]] = js.undefined
}

object QueuingStrategy {
  @scala.inline
  def apply[T](
    highWaterMark: scala.Int | scala.Double = null,
    size: js.Function1[/* chunk */ T, scala.Double] = null
  ): QueuingStrategy[T] = {
    val __obj = js.Dynamic.literal()
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[QueuingStrategy[T]]
  }
}

