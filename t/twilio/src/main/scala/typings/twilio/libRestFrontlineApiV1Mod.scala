package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestFrontlineApiV1Mod {
  
  @JSImport("twilio/lib/rest/frontlineApi/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of FrontlineApi
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestFrontlineApiMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val users: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserListInstance */ Any = js.native
  }
}
