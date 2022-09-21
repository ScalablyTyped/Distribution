package typings.twilio

import typings.twilio.syncServiceMod.ServiceContext
import typings.twilio.syncServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("twilio/lib/rest/preview/Sync", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Sync {
    /**
      * Initialize the Sync version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.previewMod.^) = this()
  }
  
  @js.native
  trait Sync
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
  }
}
