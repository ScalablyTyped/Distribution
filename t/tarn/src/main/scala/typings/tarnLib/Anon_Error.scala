package typings
package tarnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error[T]
  extends tarnLib.libPromiseInspectionMod.PromiseInspectionArgs[T] {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var value: T
}

object Anon_Error {
  @scala.inline
  def apply[T](value: T, error: stdLib.Error = null): Anon_Error[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_Error[T]]
  }
}

