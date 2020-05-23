package typings.textBuffer.anon

import typings.textBuffer.textBufferStrings.backward
import typings.textBuffer.textBufferStrings.closest
import typings.textBuffer.textBufferStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipDirection extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object ClipDirection {
  @scala.inline
  def apply(clipDirection: backward | forward | closest = null, reversed: js.UndefOr[Boolean] = js.undefined): ClipDirection = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipDirection]
  }
}

