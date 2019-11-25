package typings.tarn

import typings.std.Error
import typings.tarn.libPromiseInspectionMod.PromiseInspectionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorValue[T] extends PromiseInspectionArgs[T] {
  var error: Error
  var value: js.UndefOr[T] = js.undefined
}

object Anon_ErrorValue {
  @scala.inline
  def apply[T](error: Error, value: T = null): Anon_ErrorValue[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorValue[T]]
  }
}

