package typings.stripe.stripeMod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoginLinkOptions extends js.Object {
  /**
    * Where to redirect the user after they log out of their dashboard.
    */
  var redirect_url: String
}

object ILoginLinkOptions {
  @scala.inline
  def apply(redirect_url: String): ILoginLinkOptions = {
    val __obj = js.Dynamic.literal(redirect_url = redirect_url)
  
    __obj.asInstanceOf[ILoginLinkOptions]
  }
}

