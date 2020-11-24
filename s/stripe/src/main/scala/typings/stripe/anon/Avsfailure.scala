package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Avsfailure extends js.Object {
  
  /**
    * Whether Stripe automatically declines charges with an incorrect ZIP or
    * postal code. This setting only applies when a ZIP or postal code is
    * provided and they fail bank verification.
    */
  var avs_failure: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether Stripe automatically declines charges with an incorrect CVC.
    * This setting only applies when a CVC is provided and it fails bank
    * verification.
    */
  var cvc_failure: js.UndefOr[Boolean] = js.native
}
object Avsfailure {
  
  @scala.inline
  def apply(): Avsfailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avsfailure]
  }
  
  @scala.inline
  implicit class AvsfailureOps[Self <: Avsfailure] (val x: Self) extends AnyVal {
    
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
    def setAvs_failure(value: Boolean): Self = this.set("avs_failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvs_failure: Self = this.set("avs_failure", js.undefined)
    
    @scala.inline
    def setCvc_failure(value: Boolean): Self = this.set("cvc_failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCvc_failure: Self = this.set("cvc_failure", js.undefined)
  }
}
