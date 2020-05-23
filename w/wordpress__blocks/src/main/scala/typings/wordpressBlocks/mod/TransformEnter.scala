package typings.wordpressBlocks.mod

import typings.std.Partial
import typings.std.Record
import typings.std.RegExp
import typings.wordpressBlocks.wordpressBlocksStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformEnter[T /* <: Record[String, _] */] extends Transform[T] {
  var priority: js.UndefOr[Double] = js.undefined
  var regExp: RegExp
  var `type`: enter
  def transform(): BlockInstance[Partial[T]]
}

object TransformEnter {
  @scala.inline
  def apply[T](
    regExp: RegExp,
    transform: () => BlockInstance[Partial[T]],
    `type`: enter,
    priority: js.UndefOr[Double] = js.undefined
  ): TransformEnter[T] = {
    val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any], transform = js.Any.fromFunction0(transform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformEnter[T]]
  }
}

