package typings.twilio

import typings.twilio.awsMod.AwsListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.publicKeyMod.PublicKeyListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialMod {
  
  @JSImport("twilio/lib/rest/accounts/v1/credential", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initialize the CredentialList
    *
    * @param version - Version of the resource
    */
  inline def CredentialList(version: typings.twilio.v1Mod.^): CredentialListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CredentialList")(version.asInstanceOf[js.Any]).asInstanceOf[CredentialListInstance]
  
  trait CredentialListInstance extends StObject {
    
    var aws: js.UndefOr[AwsListInstance] = js.undefined
    
    var publicKey: js.UndefOr[PublicKeyListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
  }
  object CredentialListInstance {
    
    inline def apply(toJSON: () => Any): CredentialListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[CredentialListInstance]
    }
    
    extension [Self <: CredentialListInstance](x: Self) {
      
      inline def setAws(value: AwsListInstance): Self = StObject.set(x, "aws", value.asInstanceOf[js.Any])
      
      inline def setAwsUndefined: Self = StObject.set(x, "aws", js.undefined)
      
      inline def setPublicKey(value: PublicKeyListInstance): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait CredentialPayload
    extends StObject
       with CredentialResource
       with TwilioResponsePayload
  object CredentialPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): CredentialPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialPayload]
    }
  }
  
  trait CredentialResource extends StObject
  
  trait CredentialSolution extends StObject
}
