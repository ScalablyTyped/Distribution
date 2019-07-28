package typings.tarn.libPromiseInspectionMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseInspectionArgs[T] extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

object PromiseInspectionArgs {
  @scala.inline
  def apply[T](error: Error = null, value: T = null): PromiseInspectionArgs[T] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseInspectionArgs[T]]
  }
}

