package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailablePhoneNumberResourceGroup
  extends StObject
     with ListableResource {
  
  def search(args: js.Any): Promise[js.Any]
  def search(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def search(callback: RequestCallback): Promise[js.Any]
  @JSName("search")
  var search_Original: RestMethod
}
object AvailablePhoneNumberResourceGroup {
  
  inline def apply(get: RestMethod, list: RestMethod, search: RestMethod): AvailablePhoneNumberResourceGroup = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailablePhoneNumberResourceGroup]
  }
  
  extension [Self <: AvailablePhoneNumberResourceGroup](x: Self) {
    
    inline def setSearch(value: RestMethod): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
