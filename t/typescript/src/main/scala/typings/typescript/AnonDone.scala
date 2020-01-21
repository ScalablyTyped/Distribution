package typings.typescript

import typings.typescript.typescriptBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDone[T] extends js.Object {
  var done: js.UndefOr[`false`] = js.undefined
  var value: T
}

object AnonDone {
  @scala.inline
  def apply[T](value: T, done: `false` = null): AnonDone[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDone[T]]
  }
}

