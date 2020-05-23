package typings.useSidecar.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidePush[T] extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  def filter(cb: js.Function1[/* x */ T, Boolean]): SidePush[T]
  def push(data: T): Unit
}

object SidePush {
  @scala.inline
  def apply[T](
    filter: js.Function1[/* x */ T, Boolean] => SidePush[T],
    push: T => Unit,
    length: js.UndefOr[Double] = js.undefined
  ): SidePush[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), push = js.Any.fromFunction1(push))
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidePush[T]]
  }
}

