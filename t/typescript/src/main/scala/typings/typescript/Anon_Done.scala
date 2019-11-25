package typings.typescript

import typings.typescript.typescriptNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Done[T] extends js.Object {
  var done: js.UndefOr[`false`] = js.undefined
  var value: T
}

object Anon_Done {
  @scala.inline
  def apply[T](value: T, done: `false` = null): Anon_Done[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Done[T]]
  }
}

