package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.INLINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var mode: INLINE
}

object Mode {
  @scala.inline
  def apply(mode: INLINE): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

