package typings.stripeV3.anon

import typings.stripeV3.stripe.OwnerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Owner extends StObject {
  
  var owner: js.UndefOr[OwnerInfo] = js.undefined
}
object Owner {
  
  @scala.inline
  def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  
  @scala.inline
  implicit class OwnerMutableBuilder[Self <: Owner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: OwnerInfo): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
