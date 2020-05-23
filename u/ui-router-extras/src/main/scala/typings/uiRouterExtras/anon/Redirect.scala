package typings.uiRouterExtras.anon

import typings.uiRouterExtras.mod.ui.IRedirectParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends js.Object {
  var redirect: IRedirectParams
  var to: IRedirectParams
}

object Redirect {
  @scala.inline
  def apply(redirect: IRedirectParams, to: IRedirectParams): Redirect = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
}

