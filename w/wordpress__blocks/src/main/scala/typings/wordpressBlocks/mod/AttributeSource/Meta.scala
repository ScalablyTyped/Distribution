package typings.wordpressBlocks.mod.AttributeSource

import typings.wordpressBlocks.mod._BlockAttribute
import typings.wordpressBlocks.wordpressBlocksStrings.meta
import typings.wordpressBlocks.wordpressBlocksStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta
  extends _BlockAttribute[js.Any] {
  var default: js.UndefOr[String] = js.undefined
  var meta: String
  var source: meta
  var `type`: string
}

object Meta {
  @scala.inline
  def apply(meta: String, source: meta, `type`: string, default: String = null): Meta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
}

