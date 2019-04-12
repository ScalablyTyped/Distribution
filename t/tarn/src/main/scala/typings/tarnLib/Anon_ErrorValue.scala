package typings
package tarnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorValue[T]
  extends tarnLib.libPromiseInspectionMod.PromiseInspectionArgs[T] {
  var error: stdLib.Error
  var value: js.UndefOr[T] = js.undefined
}

object Anon_ErrorValue {
  @scala.inline
  def apply[T](error: stdLib.Error, value: T = null): Anon_ErrorValue[T] = {
    val __obj = js.Dynamic.literal(error = error)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorValue[T]]
  }
}

