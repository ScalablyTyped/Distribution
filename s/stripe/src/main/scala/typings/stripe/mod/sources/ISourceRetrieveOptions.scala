package typings.stripe.mod.sources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceRetrieveOptions extends js.Object {
  var client_secret: js.UndefOr[String] = js.undefined
}

object ISourceRetrieveOptions {
  @scala.inline
  def apply(client_secret: String = null): ISourceRetrieveOptions = {
    val __obj = js.Dynamic.literal()
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceRetrieveOptions]
  }
}

