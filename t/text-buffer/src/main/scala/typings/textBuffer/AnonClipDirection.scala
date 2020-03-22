package typings.textBuffer

import typings.textBuffer.textBufferStrings.backward
import typings.textBuffer.textBufferStrings.closest
import typings.textBuffer.textBufferStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClipDirection extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object AnonClipDirection {
  @scala.inline
  def apply(clipDirection: backward | forward | closest = null, reversed: js.UndefOr[Boolean] = js.undefined): AnonClipDirection = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClipDirection]
  }
}

