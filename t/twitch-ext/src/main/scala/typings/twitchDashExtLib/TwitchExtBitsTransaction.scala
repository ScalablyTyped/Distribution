package typings
package twitchDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TwitchExtBitsTransaction extends js.Object {
  /**
  	 * Display name of the user who executed the Bits in Extensions transaction.
  	 */
  var displayName: java.lang.String
  var initiator: twitchDashExtLib.twitchDashExtLibStrings.CURRENT_USER | twitchDashExtLib.twitchDashExtLibStrings.OTHER
  /**
  	 * Full product object from getProducts call
  	 */
  var product: TwitchExtBitsProduct
  /**
  	 * ID of the transaction.
  	 */
  var transactionID: java.lang.String
  /**
  	 * JWT containing the following transaction information in the payload.
  	 * The JWT is a large, base64-encoded string. It can be verified using your developer secret.
  	 */
  var transactionReceipt: java.lang.String
  /**
  	 * Twitch ID of the user who executed the transaction.
  	 */
  var userId: java.lang.String
}

