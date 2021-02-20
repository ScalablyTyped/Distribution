package typings.stripe.mod.accounts

import typings.stripe.stripeStrings.login_link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoginLink extends StObject {
  
  var created: Double = js.native
  
  var `object`: login_link = js.native
  
  /**
    * A single-use login link for an Express account to access their Stripe dashboard.
    */
  var url: String = js.native
}
object ILoginLink {
  
  @scala.inline
  def apply(created: Double, `object`: login_link, url: String): ILoginLink = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginLink]
  }
  
  @scala.inline
  implicit class ILoginLinkMutableBuilder[Self <: ILoginLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: login_link): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
