package typings.stripeV3.anon

import typings.stripeV3.stripe.OwnerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Owner extends StObject {
  
  var owner: js.UndefOr[OwnerInfo] = js.undefined
}
object Owner {
  
  inline def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Owner] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: OwnerInfo): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
