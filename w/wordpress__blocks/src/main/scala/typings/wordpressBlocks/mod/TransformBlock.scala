package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.block_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformBlock[T /* <: Record[String, _] */] extends Transform[T] {
  var blocks: js.Array[String]
  var isMatch: js.UndefOr[js.Function1[/* attributes */ T, Boolean]] = js.undefined
  var isMultiBlock: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var `type`: block_
  def transform(attributes: T): BlockInstance[Partial[T]]
}

object TransformBlock {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](
    blocks: js.Array[String],
    transform: T => BlockInstance[Partial[T]],
    `type`: block_,
    isMatch: /* attributes */ T => Boolean = null,
    isMultiBlock: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined
  ): TransformBlock[T] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (isMatch != null) __obj.updateDynamic("isMatch")(js.Any.fromFunction1(isMatch))
    if (!js.isUndefined(isMultiBlock)) __obj.updateDynamic("isMultiBlock")(isMultiBlock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformBlock[T]]
  }
}

