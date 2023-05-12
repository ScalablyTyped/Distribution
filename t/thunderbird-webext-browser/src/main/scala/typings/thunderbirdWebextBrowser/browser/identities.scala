package typings.thunderbirdWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identities {
  
  trait MailIdentity extends StObject {
    
    /**
      * The id of the {@link accounts.MailAccount} this identity belongs to.
      * The `accountId` property is read-only.
      */
    var accountId: js.UndefOr[String] = js.undefined
    
    /** If the identity uses HTML as the default compose format. */
    var composeHtml: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The user's email address as used when messages are sent from this
      * identity.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /** A unique identifier for this identity. The `id` property is read-only. */
    var id: js.UndefOr[String] = js.undefined
    
    /** A user-defined label for this identity. */
    var label: js.UndefOr[String] = js.undefined
    
    /** The user's name as used when messages are sent from this identity. */
    var name: js.UndefOr[String] = js.undefined
    
    /** The organization associated with this identity. */
    var organization: js.UndefOr[String] = js.undefined
    
    /** The reply-to email address associated with this identity. */
    var replyTo: js.UndefOr[String] = js.undefined
    
    /** The signature of the identity. */
    var signature: js.UndefOr[String] = js.undefined
    
    /** If the signature should be interpreted as plain text or as HTML. */
    var signatureIsPlainText: js.UndefOr[Boolean] = js.undefined
  }
  object MailIdentity {
    
    inline def apply(): MailIdentity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailIdentity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailIdentity] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setComposeHtml(value: Boolean): Self = StObject.set(x, "composeHtml", value.asInstanceOf[js.Any])
      
      inline def setComposeHtmlUndefined: Self = StObject.set(x, "composeHtml", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      inline def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureIsPlainText(value: Boolean): Self = StObject.set(x, "signatureIsPlainText", value.asInstanceOf[js.Any])
      
      inline def setSignatureIsPlainTextUndefined: Self = StObject.set(x, "signatureIsPlainText", js.undefined)
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    }
  }
}
