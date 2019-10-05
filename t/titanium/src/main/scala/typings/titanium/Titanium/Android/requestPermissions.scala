package typings.titanium.Titanium.Android

import typings.titanium.RequestPermissionAccessResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Android.requestPermissions")
@js.native
object requestPermissions extends js.Object {
  /**
  		 * Request for permission access.
  		 */
  def apply(permissions: String): Unit = js.native
  def apply(permissions: String, callback: js.Function1[/* param0 */ RequestPermissionAccessResult, _]): Unit = js.native
  /**
  		 * Request for permission access.
  		 */
  def apply(permissions: js.Array[String]): Unit = js.native
  def apply(
    permissions: js.Array[String],
    callback: js.Function1[/* param0 */ RequestPermissionAccessResult, _]
  ): Unit = js.native
}

