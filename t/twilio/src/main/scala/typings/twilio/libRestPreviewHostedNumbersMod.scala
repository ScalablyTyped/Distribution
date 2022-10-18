package typings.twilio

import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentMod.AuthorizationDocumentContext
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentMod.AuthorizationDocumentListInstance
import typings.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderContext
import typings.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewHostedNumbersMod {
  
  @JSImport("twilio/lib/rest/preview/HostedNumbers", JSImport.Namespace)
  @js.native
  open class ^ protected () extends HostedNumbers {
    /**
      * Initialize the HostedNumbers version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestPreviewMod.^) = this()
  }
  
  @js.native
  trait HostedNumbers
    extends typings.twilio.libBaseVersionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def authorizationDocuments(sid: String): AuthorizationDocumentContext = js.native
    @JSName("authorizationDocuments")
    val authorizationDocuments_Original: AuthorizationDocumentListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def hostedNumberOrders(sid: String): HostedNumberOrderContext = js.native
    @JSName("hostedNumberOrders")
    val hostedNumberOrders_Original: HostedNumberOrderListInstance = js.native
  }
}
