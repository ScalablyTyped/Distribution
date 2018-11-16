package typings
package w3cDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/permissions/#status-of-a-permission
@JSGlobal("PermissionStatus")
@js.native
class PermissionStatus ()
  extends stdLib.EventTarget {
  val state: PermissionState = js.native
  def onchange(): js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _] = js.native
}

