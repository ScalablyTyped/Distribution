package typings.twilio

import typings.twilio.libRestPreviewBaseMod.^
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentMod.AuthorizationDocumentListInstance
import typings.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewHostedNumbersMod {
  
  @JSImport("twilio/lib/rest/preview/HostedNumbers", JSImport.Default)
  @js.native
  open class default protected () extends HostedNumbers {
    /**
      * Initialize the HostedNumbers version of Preview
      *
      * @param domain - The Twilio (Twilio.Preview) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait HostedNumbers
    extends typings.twilio.libBaseVersionMod.default {
    
    /** authorizationDocuments - { Twilio.Preview.HostedNumbers.AuthorizationDocumentListInstance } resource */
    /* protected */ var _authorizationDocuments: js.UndefOr[AuthorizationDocumentListInstance] = js.native
    
    /** hostedNumberOrders - { Twilio.Preview.HostedNumbers.HostedNumberOrderListInstance } resource */
    /* protected */ var _hostedNumberOrders: js.UndefOr[HostedNumberOrderListInstance] = js.native
    
    /** Getter for authorizationDocuments resource */
    def authorizationDocuments: AuthorizationDocumentListInstance = js.native
    
    /** Getter for hostedNumberOrders resource */
    def hostedNumberOrders: HostedNumberOrderListInstance = js.native
  }
}
