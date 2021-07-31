package typings.stripe.mod.resources

import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated
  */
@JSImport("stripe", "resources.Recipients")
@js.native
class Recipients protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  /**
    * @deprecated
    */
  def create(): Unit = js.native
  
  // options: IDataOptions
  /**
    * @deprecated
    */
  def del(id: String): Unit = js.native
  
  /**
    * @deprecated
    */
  def list(): Unit = js.native
  
  /**
    * @deprecated
    */
  def retrieve(id: String): Unit = js.native
  
  /**
    * @deprecated
    */
  def update(id: String): Unit = js.native
}
