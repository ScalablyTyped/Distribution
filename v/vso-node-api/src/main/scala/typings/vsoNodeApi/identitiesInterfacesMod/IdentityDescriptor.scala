package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityDescriptor extends StObject {
  
  /**
    * The unique identifier for this identity, not exceeding 256 chars, which will be persisted.
    */
  var identifier: String
  
  /**
    * Type of descriptor (for example, Windows, Passport, etc.).
    */
  var identityType: String
}
object IdentityDescriptor {
  
  @scala.inline
  def apply(identifier: String, identityType: String): IdentityDescriptor = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], identityType = identityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityDescriptor]
  }
  
  @scala.inline
  implicit class IdentityDescriptorMutableBuilder[Self <: IdentityDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityType(value: String): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
  }
}
