package typings.typescript.anon

import typings.typescript.typescriptBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Done[T] extends js.Object {
  var done: js.UndefOr[`false`] = js.undefined
  var value: T
}

object Done {
  @scala.inline
  def apply[T](value: T, done: `false` = null): Done[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done[T]]
  }
}

