package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Declineon extends js.Object {
  
  /**
    * Automatically declines certain charge types regardless of whether the card
    * issuer accepted or declined the charge.
    */
  var decline_on: js.UndefOr[Avsfailure] = js.native
  
  /**
    * The default text that appears on credit card statements when a charge is
    * made. This field prefixes any dynamic statement_descriptor specified on the
    * charge. statement_descriptor_prefix is useful for maximizing descriptor space
    * for the dynamic portion.
    */
  var statement_descriptor_prefix: js.UndefOr[String] = js.native
}
object Declineon {
  
  @scala.inline
  def apply(): Declineon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declineon]
  }
  
  @scala.inline
  implicit class DeclineonOps[Self <: Declineon] (val x: Self) extends AnyVal {
    
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
    def setDecline_on(value: Avsfailure): Self = this.set("decline_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecline_on: Self = this.set("decline_on", js.undefined)
    
    @scala.inline
    def setStatement_descriptor_prefix(value: String): Self = this.set("statement_descriptor_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatement_descriptor_prefix: Self = this.set("statement_descriptor_prefix", js.undefined)
  }
}
