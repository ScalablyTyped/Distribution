package typings.tarn

import typings.std.Error
import typings.tarn.promiseInspectionMod.PromiseInspectionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorValue[T] extends PromiseInspectionArgs[T] {
  var error: Error
  var value: js.UndefOr[T] = js.undefined
}

object AnonErrorValue {
  @scala.inline
  def apply[T](error: Error, value: T = null): AnonErrorValue[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorValue[T]]
  }
}

