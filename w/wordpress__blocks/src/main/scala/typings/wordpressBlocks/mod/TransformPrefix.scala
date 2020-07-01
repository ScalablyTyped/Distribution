package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformPrefix[T /* <: Record[String, _] */] extends Transform[T] {
  var prefix: String
  var priority: js.UndefOr[Double] = js.undefined
  var `type`: prefix
  def transform(content: String): BlockInstance[Partial[T]]
}

object TransformPrefix {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](
    prefix: String,
    transform: String => BlockInstance[Partial[T]],
    `type`: prefix,
    priority: js.UndefOr[Double] = js.undefined
  ): TransformPrefix[T] = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformPrefix[T]]
  }
}

