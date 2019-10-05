package typings.stripe.stripeMod.setupIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentRetrieveOptions extends js.Object {
  /**
    * The client secret of the SetupIntent. Required if a publishable key is used to retrieve
    * the SetupIntent. REQUIRED IF USING PUBLISHABLE KEY
    */
  var client_secret: js.UndefOr[String] = js.undefined
}

object ISetupIntentRetrieveOptions {
  @scala.inline
  def apply(client_secret: String = null): ISetupIntentRetrieveOptions = {
    val __obj = js.Dynamic.literal()
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    __obj.asInstanceOf[ISetupIntentRetrieveOptions]
  }
}

