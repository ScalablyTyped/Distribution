package typings
package stripeLib.stripeMod.StripeNs.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAccountCreationOptions extends IAccountUpdateOptions {
  /**
               * The country the account holder resides in or that the business is legally
               * established in. For example, if you are in the United States and the
               * business you’re creating an account for is legally represented in Canada,
               * you would use “CA” as the country for the account being created.
               *
               * optional, default is your own country
               */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whether you'd like to create a Custom or Standard account. Custom
               * accounts have extra parameters available to them, and require that you,
               * the platform, handle all communication with the account holder.
               * Standard accounts are normal Stripe accounts: Stripe will email the
               * account holder to setup a username and password, and handle all account
               * management directly with them. Possible values are custom and standard.
               */
  var `type`: stripeLib.stripeLibStrings.custom | stripeLib.stripeLibStrings.standard
}

