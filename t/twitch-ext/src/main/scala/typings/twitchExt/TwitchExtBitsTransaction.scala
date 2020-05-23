package typings.twitchExt

import typings.twitchExt.twitchExtStrings.CURRENT_USER
import typings.twitchExt.twitchExtStrings.OTHER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitchExtBitsTransaction extends js.Object {
  /**
    * Display name of the user who executed the Bits in Extensions transaction.
    */
  var displayName: String
  var initiator: CURRENT_USER | OTHER
  /**
    * Full product object from getProducts call
    */
  var product: TwitchExtBitsProduct
  /**
    * ID of the transaction.
    */
  var transactionID: String
  /**
    * JWT containing the following transaction information in the payload.
    * The JWT is a large, base64-encoded string. It can be verified using your developer secret.
    */
  var transactionReceipt: String
  /**
    * Twitch ID of the user who executed the transaction.
    */
  var userId: String
}

object TwitchExtBitsTransaction {
  @scala.inline
  def apply(
    displayName: String,
    initiator: CURRENT_USER | OTHER,
    product: TwitchExtBitsProduct,
    transactionID: String,
    transactionReceipt: String,
    userId: String
  ): TwitchExtBitsTransaction = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], transactionReceipt = transactionReceipt.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtBitsTransaction]
  }
}

