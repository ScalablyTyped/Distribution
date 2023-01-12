package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountProvider extends StObject {
  
  /**
    * Identifier of the account provider application.
    */
  val applicationId: ApplicationId
  
  /**
    * Capabilities of the account provider defined in IRI format.
    *
    * The following predefined capabilities can be used.
    *
    *
    * *   http://tizen.org/account/capability/contact - Used when the account is related to contacts
    * *   http://tizen.org/account/capability/calendar - Used when the account is related to calendar
    *
    */
  val capabilities: js.Array[String]
  
  /**
    * Logical (translatable) display name.
    */
  val displayName: String
  
  /**
    * Path to the icon representing the account provider.
    */
  val iconUri: String
  
  /**
    * Boolean value that indicates whether multiple accounts are supported.
    */
  val isMultipleAccountSupported: Boolean
  
  /**
    * Path to the small icon representing the account provider.
    */
  val smallIconUri: String
}
object AccountProvider {
  
  inline def apply(
    applicationId: ApplicationId,
    capabilities: js.Array[String],
    displayName: String,
    iconUri: String,
    isMultipleAccountSupported: Boolean,
    smallIconUri: String
  ): AccountProvider = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], iconUri = iconUri.asInstanceOf[js.Any], isMultipleAccountSupported = isMultipleAccountSupported.asInstanceOf[js.Any], smallIconUri = smallIconUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountProvider] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    inline def setIsMultipleAccountSupported(value: Boolean): Self = StObject.set(x, "isMultipleAccountSupported", value.asInstanceOf[js.Any])
    
    inline def setSmallIconUri(value: String): Self = StObject.set(x, "smallIconUri", value.asInstanceOf[js.Any])
  }
}
