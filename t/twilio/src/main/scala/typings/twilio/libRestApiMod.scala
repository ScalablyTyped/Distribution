package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestApiMod {
  
  @JSImport("twilio/lib/rest/Api", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Api {
    /**
      * Initialize api domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Api
    extends typings.twilio.libBaseDomainMod.^ {
    
    val account: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AccountContext */ Any = js.native
    
    val accounts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AccountListInstance */ Any = js.native
    
    val addresses: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AddressListInstance */ Any = js.native
    
    val applications: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationListInstance */ Any = js.native
    
    val authorizedConnectApps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AuthorizedConnectAppListInstance */ Any = js.native
    
    val availablePhoneNumbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AvailablePhoneNumberCountryListInstance */ Any = js.native
    
    val balance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BalanceListInstance */ Any = js.native
    
    val calls: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CallListInstance */ Any = js.native
    
    val conferences: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConferenceListInstance */ Any = js.native
    
    val connectApps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConnectAppListInstance */ Any = js.native
    
    val incomingPhoneNumbers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IncomingPhoneNumberListInstance */ Any = js.native
    
    val keys: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyListInstance */ Any = js.native
    
    val messages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MessageListInstance */ Any = js.native
    
    val newKeys: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NewKeyListInstance */ Any = js.native
    
    val newSigningKeys: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NewSigningKeyListInstance */ Any = js.native
    
    val notifications: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotificationListInstance */ Any = js.native
    
    val outgoingCallerIds: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OutgoingCallerIdListInstance */ Any = js.native
    
    val queues: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify QueueListInstance */ Any = js.native
    
    val recordings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RecordingListInstance */ Any = js.native
    
    val shortCodes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShortCodeListInstance */ Any = js.native
    
    val signingKeys: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SigningKeyListInstance */ Any = js.native
    
    val sip: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SipListInstance */ Any = js.native
    
    val tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenListInstance */ Any = js.native
    
    val transcriptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TranscriptionListInstance */ Any = js.native
    
    val usage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsageListInstance */ Any = js.native
    
    val v2010: typings.twilio.libRestApiV2010Mod.^ = js.native
    
    val validationRequests: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidationRequestListInstance */ Any = js.native
  }
}
