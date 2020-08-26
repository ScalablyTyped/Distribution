package typings.uiRouterExtras.anon

import typings.uiRouterExtras.mod.ui.IRedirectParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redirect extends js.Object {
  var redirect: IRedirectParams = js.native
  var to: IRedirectParams = js.native
}

object Redirect {
  @scala.inline
  def apply(redirect: IRedirectParams, to: IRedirectParams): Redirect = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
  @scala.inline
  implicit class RedirectOps[Self <: Redirect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRedirect(value: IRedirectParams): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: IRedirectParams): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

