package typings.twilio

import typings.twilio.authorizationDocumentMod.AuthorizationDocumentContext
import typings.twilio.authorizationDocumentMod.AuthorizationDocumentListInstance
import typings.twilio.hostedNumberOrderMod.HostedNumberOrderContext
import typings.twilio.hostedNumberOrderMod.HostedNumberOrderListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostedNumbersMod {
  
  @JSImport("twilio/lib/rest/preview/HostedNumbers", JSImport.Namespace)
  @js.native
  open class ^ protected () extends HostedNumbers {
    /**
      * Initialize the HostedNumbers version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.previewMod.^) = this()
  }
  
  @js.native
  trait HostedNumbers
    extends typings.twilio.versionMod.^ {
    
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
