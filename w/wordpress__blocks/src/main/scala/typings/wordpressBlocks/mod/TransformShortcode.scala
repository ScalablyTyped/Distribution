package typings.wordpressBlocks.mod

import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.shortcode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformShortcode[T /* <: Record[String, _] */] extends Transform[T] {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var tag: String
  var `type`: shortcode
}

object TransformShortcode {
  @scala.inline
  def apply[T](
    tag: String,
    `type`: shortcode,
    attributes: js.Any = null,
    priority: js.UndefOr[Double] = js.undefined
  ): TransformShortcode[T] = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformShortcode[T]]
  }
}

