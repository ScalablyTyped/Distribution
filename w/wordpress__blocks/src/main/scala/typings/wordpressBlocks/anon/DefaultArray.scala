package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultArray extends js.Object {
  var default: js.UndefOr[js.Array[_]] = js.undefined
  var `type`: array
}

object DefaultArray {
  @scala.inline
  def apply(`type`: array, default: js.Array[_] = null): DefaultArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultArray]
  }
}

