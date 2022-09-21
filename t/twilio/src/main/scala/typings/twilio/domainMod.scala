package typings.twilio

import typings.twilio.twilioMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainMod {
  
  @JSImport("twilio/lib/base/Domain", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Domain {
    def this(twilio: typings.twilio.twilioMod.^, baseUrl: String) = this()
  }
  
  @js.native
  trait Domain extends StObject {
    
    /**
      * Turn a uri into an absolute url
      *
      * @param  uri uri to transform
      * @return absolute url
      */
    def absoluteUrl(uri: String): String = js.native
    
    /**
      * Make request to this domain
      *
      * @param opts request options
      * @return request promise
      */
    def request(): js.Promise[Any] = js.native
    def request(opts: RequestOptions): js.Promise[Any] = js.native
  }
}
