package typings.uiDashRouterDashExtras

import typings.uiDashRouterDashExtras.angularMod.ui.IRedirectParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Redirect extends js.Object {
  var redirect: IRedirectParams
  var to: IRedirectParams
}

object Anon_Redirect {
  @scala.inline
  def apply(redirect: IRedirectParams, to: IRedirectParams): Anon_Redirect = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Redirect]
  }
}

