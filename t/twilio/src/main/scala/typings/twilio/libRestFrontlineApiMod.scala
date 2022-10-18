package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestFrontlineApiMod {
  
  @JSImport("twilio/lib/rest/FrontlineApi", JSImport.Namespace)
  @js.native
  open class ^ protected () extends FrontlineApi {
    /**
      * Initialize frontline_api domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait FrontlineApi
    extends typings.twilio.libBaseDomainMod.^ {
    
    val users: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestFrontlineApiV1Mod.^ = js.native
  }
}
