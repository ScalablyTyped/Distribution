package typings
package uiDashRouterDashExtrasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Redirect extends js.Object {
  var redirect: uiDashRouterDashExtrasLib.angularMod.uiNs.IRedirectParams
  var to: uiDashRouterDashExtrasLib.angularMod.uiNs.IRedirectParams
}

object Anon_Redirect {
  @scala.inline
  def apply(
    redirect: uiDashRouterDashExtrasLib.angularMod.uiNs.IRedirectParams,
    to: uiDashRouterDashExtrasLib.angularMod.uiNs.IRedirectParams
  ): Anon_Redirect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redirect")(redirect)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_Redirect]
  }
}

