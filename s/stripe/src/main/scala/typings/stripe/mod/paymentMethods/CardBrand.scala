package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.discover_
import typings.stripe.stripeStrings.jcb_
import typings.stripe.stripeStrings.mastercard_
import typings.stripe.stripeStrings.unknown_
import typings.stripe.stripeStrings.visa_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.amex
  - typings.stripe.stripeStrings.diners
  - typings.stripe.stripeStrings.discover_
  - typings.stripe.stripeStrings.jcb_
  - typings.stripe.stripeStrings.mastercard_
  - typings.stripe.stripeStrings.unionpay
  - typings.stripe.stripeStrings.visa_
  - typings.stripe.stripeStrings.unknown_
*/
trait CardBrand extends StObject
object CardBrand {
  
  @scala.inline
  def amex: typings.stripe.stripeStrings.amex = "amex".asInstanceOf[typings.stripe.stripeStrings.amex]
  
  @scala.inline
  def diners: typings.stripe.stripeStrings.diners = "diners".asInstanceOf[typings.stripe.stripeStrings.diners]
  
  @scala.inline
  def discover: discover_ = "discover".asInstanceOf[discover_]
  
  @scala.inline
  def jcb: jcb_ = "jcb".asInstanceOf[jcb_]
  
  @scala.inline
  def mastercard: mastercard_ = "mastercard".asInstanceOf[mastercard_]
  
  @scala.inline
  def unionpay: typings.stripe.stripeStrings.unionpay = "unionpay".asInstanceOf[typings.stripe.stripeStrings.unionpay]
  
  @scala.inline
  def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  
  @scala.inline
  def visa: visa_ = "visa".asInstanceOf[visa_]
}
