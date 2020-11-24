package typings.stripe.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebHookGenerateTestHeaderStringOptions extends js.Object {
  
  /**
    * JSON stringified payload object, containing the 'id' and 'object' parameters
    */
  var payload: js.UndefOr[String] = js.native
  
  /**
    * Version of API to hit. Defaults to 'v1'.
    */
  var scheme: js.UndefOr[String] = js.native
  
  /**
    * Stripe webhook secret 'whsec_...'
    */
  var secret: js.UndefOr[String] = js.native
  
  /**
    * Computed webhook signature
    */
  var signature: js.UndefOr[String] = js.native
  
  /**
    * Timestamp of the header. Defaults to Date.now()
    */
  var timestamp: js.UndefOr[Double] = js.native
}
object IWebHookGenerateTestHeaderStringOptions {
  
  @scala.inline
  def apply(): IWebHookGenerateTestHeaderStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebHookGenerateTestHeaderStringOptions]
  }
  
  @scala.inline
  implicit class IWebHookGenerateTestHeaderStringOptionsOps[Self <: IWebHookGenerateTestHeaderStringOptions] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
