package typings
package trezorDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Instance extends js.Object {
  var instance: js.UndefOr[scala.Double] = js.undefined
  var path: java.lang.String
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Instance {
  @scala.inline
  def apply(path: java.lang.String, instance: scala.Int | scala.Double = null, state: java.lang.String = null): Anon_Instance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Instance]
  }
}

