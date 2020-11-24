package typings.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoginLinkOptions extends js.Object {
  
  /**
    * Where to redirect the user after they log out of their dashboard.
    */
  var redirect_url: String = js.native
}
object ILoginLinkOptions {
  
  @scala.inline
  def apply(redirect_url: String): ILoginLinkOptions = {
    val __obj = js.Dynamic.literal(redirect_url = redirect_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginLinkOptions]
  }
  
  @scala.inline
  implicit class ILoginLinkOptionsOps[Self <: ILoginLinkOptions] (val x: Self) extends AnyVal {
    
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
    def setRedirect_url(value: String): Self = this.set("redirect_url", value.asInstanceOf[js.Any])
  }
}
