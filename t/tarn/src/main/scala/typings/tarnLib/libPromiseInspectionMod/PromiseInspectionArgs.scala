package typings
package tarnLib.libPromiseInspectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseInspectionArgs[T] extends js.Object {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

object PromiseInspectionArgs {
  @scala.inline
  def apply[T](error: stdLib.Error = null, value: T = null): PromiseInspectionArgs[T] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseInspectionArgs[T]]
  }
}

