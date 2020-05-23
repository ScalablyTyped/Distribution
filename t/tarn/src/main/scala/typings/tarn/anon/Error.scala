package typings.tarn.anon

import typings.tarn.promiseInspectionMod.PromiseInspectionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error[T] extends PromiseInspectionArgs[T] {
  var error: js.UndefOr[typings.std.Error] = js.undefined
  var value: T
}

object Error {
  @scala.inline
  def apply[T](value: T, error: typings.std.Error = null): Error[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error[T]]
  }
}

