package typings.twilio

import typings.twilio.libRestPreviewSyncServiceMod.ServiceContext
import typings.twilio.libRestPreviewSyncServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncMod {
  
  @JSImport("twilio/lib/rest/preview/Sync", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Sync {
    /**
      * Initialize the Sync version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestPreviewMod.^) = this()
  }
  
  @js.native
  trait Sync
    extends typings.twilio.libBaseVersionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
  }
}
