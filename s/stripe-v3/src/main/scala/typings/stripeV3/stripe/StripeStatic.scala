package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeStatic extends StObject {
  
  def apply(publicKey: String): Stripe = js.native
  def apply(publicKey: String, options: StripeOptions): Stripe = js.native
  
  var version: Double = js.native
}
