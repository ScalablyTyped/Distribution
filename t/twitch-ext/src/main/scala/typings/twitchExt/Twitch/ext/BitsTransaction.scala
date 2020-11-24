package typings.twitchExt.Twitch.ext

import typings.twitchExt.twitchExtStrings.CURRENT_USER
import typings.twitchExt.twitchExtStrings.OTHER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitsTransaction extends js.Object {
  
  /**
    * Display name of the user who executed the Bits in Extensions transaction.
    */
  var displayName: String = js.native
  
  /**
    * Will be "twitch.ext" + your extension ID.
    */
  var domainID: String = js.native
  
  var initiator: CURRENT_USER | OTHER = js.native
  
  /**
    * Full product object from getProducts call
    */
  var product: BitsProduct = js.native
  
  /**
    * ID of the transaction.
    */
  var transactionID: String = js.native
  
  /**
    * JWT containing the following transaction information in the payload.
    * The JWT is a large, base64-encoded string. It can be verified using your developer secret.
    */
  var transactionReceipt: String = js.native
  
  /**
    * Twitch ID of the user who executed the transaction.
    */
  var userId: String = js.native
}
object BitsTransaction {
  
  @scala.inline
  def apply(
    displayName: String,
    domainID: String,
    initiator: CURRENT_USER | OTHER,
    product: BitsProduct,
    transactionID: String,
    transactionReceipt: String,
    userId: String
  ): BitsTransaction = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], domainID = domainID.asInstanceOf[js.Any], initiator = initiator.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], transactionReceipt = transactionReceipt.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitsTransaction]
  }
  
  @scala.inline
  implicit class BitsTransactionOps[Self <: BitsTransaction] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainID(value: String): Self = this.set("domainID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiator(value: CURRENT_USER | OTHER): Self = this.set("initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: BitsProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: String): Self = this.set("transactionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionReceipt(value: String): Self = this.set("transactionReceipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
