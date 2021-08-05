package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.twilio.mod.Resource because Already inherited
- typings.twilio.mod.DeletableResource because var conflicts: get_Original. Inlined delete, delete, delete, delete_Original */ trait AddressInstance
  extends StObject
     with PostableResource {
  
  def delete(args: js.Any): Promise[js.Any]
  def delete(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def delete(callback: RequestCallback): Promise[js.Any]
  @JSName("delete")
  var delete_Original: RestMethod
  
  // Mixins
  var dependentPhoneNumbers: DependentPhoneNumberResource
}
object AddressInstance {
  
  inline def apply(
    delete: RestMethod,
    dependentPhoneNumbers: DependentPhoneNumberResource,
    get: RestMethod,
    post: RestMethod
  ): AddressInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], dependentPhoneNumbers = dependentPhoneNumbers.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressInstance]
  }
  
  extension [Self <: AddressInstance](x: Self) {
    
    inline def setDelete(value: RestMethod): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDependentPhoneNumbers(value: DependentPhoneNumberResource): Self = StObject.set(x, "dependentPhoneNumbers", value.asInstanceOf[js.Any])
  }
}
