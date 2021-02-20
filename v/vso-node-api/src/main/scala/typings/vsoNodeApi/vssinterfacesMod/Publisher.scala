package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Publisher extends StObject {
  
  /**
    * Name of the publishing service.
    */
  var name: String = js.native
  
  /**
    * Service Owner Guid Eg. Tfs : 00025394-6065-48CA-87D9-7F5672854EF7
    */
  var serviceOwnerId: String = js.native
}
object Publisher {
  
  @scala.inline
  def apply(name: String, serviceOwnerId: String): Publisher = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serviceOwnerId = serviceOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Publisher]
  }
  
  @scala.inline
  implicit class PublisherMutableBuilder[Self <: Publisher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceOwnerId(value: String): Self = StObject.set(x, "serviceOwnerId", value.asInstanceOf[js.Any])
  }
}
