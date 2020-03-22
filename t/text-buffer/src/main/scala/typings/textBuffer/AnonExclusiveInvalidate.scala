package typings.textBuffer

import typings.textBuffer.textBufferStrings.inside
import typings.textBuffer.textBufferStrings.never
import typings.textBuffer.textBufferStrings.overlap
import typings.textBuffer.textBufferStrings.surround
import typings.textBuffer.textBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExclusiveInvalidate extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
}

object AnonExclusiveInvalidate {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[Boolean] = js.undefined,
    invalidate: never | surround | overlap | inside | touch = null
  ): AnonExclusiveInvalidate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExclusiveInvalidate]
  }
}

