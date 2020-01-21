package typings.uiRouterExtras

import typings.uiRouterExtras.mod.ui.IRedirectParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRedirect extends js.Object {
  var redirect: IRedirectParams
  var to: IRedirectParams
}

object AnonRedirect {
  @scala.inline
  def apply(redirect: IRedirectParams, to: IRedirectParams): AnonRedirect = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRedirect]
  }
}

