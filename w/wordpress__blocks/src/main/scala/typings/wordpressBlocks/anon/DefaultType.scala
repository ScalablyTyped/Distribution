package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultType extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var `type`: string
}

object DefaultType {
  @scala.inline
  def apply(`type`: string, default: String = null): DefaultType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultType]
  }
}

