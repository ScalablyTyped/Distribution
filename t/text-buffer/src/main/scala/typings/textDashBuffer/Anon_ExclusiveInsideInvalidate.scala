package typings.textDashBuffer

import typings.textDashBuffer.textDashBufferStrings.inside
import typings.textDashBuffer.textDashBufferStrings.never
import typings.textDashBuffer.textDashBufferStrings.overlap
import typings.textDashBuffer.textDashBufferStrings.surround
import typings.textDashBuffer.textDashBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExclusiveInsideInvalidate extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
}

object Anon_ExclusiveInsideInvalidate {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[Boolean] = js.undefined,
    invalidate: never | surround | overlap | inside | touch = null
  ): Anon_ExclusiveInsideInvalidate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExclusiveInsideInvalidate]
  }
}

