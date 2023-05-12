package typings.twilio

import typings.twilio.libBaseBaseTwilioMod.Client
import typings.twilio.libBaseBaseTwilioMod.RequestOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseDomainMod {
  
  @JSImport("twilio/lib/base/Domain", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Domain {
    /**
      * Creates a Domain instance
      *
      * @param twilio - A Twilio Client
      * @param baseUrl - Base url for this domain
      */
    def this(twilio: Client, baseUrl: String) = this()
  }
  
  @js.native
  trait Domain extends StObject {
    
    /**
      * Turn a uri into an absolute url
      *
      * @param uri - uri to transform
      * @returns absolute url
      */
    def absoluteUrl(): String = js.native
    def absoluteUrl(uri: String): String = js.native
    
    var baseUrl: String = js.native
    
    /**
      * Make request to this domain
      *
      * @param opts - request options
      * @returns request promise
      */
    def request(opts: RequestOpts): js.Promise[Any] = js.native
    
    var twilio: Client = js.native
  }
}
