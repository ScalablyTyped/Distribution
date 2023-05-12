package typings.twilio

import typings.twilio.libRestPreviewBaseMod.^
import typings.twilio.libRestPreviewSyncServiceMod.ServiceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewSyncMod {
  
  @JSImport("twilio/lib/rest/preview/Sync", JSImport.Default)
  @js.native
  open class default protected () extends Sync {
    /**
      * Initialize the Sync version of Preview
      *
      * @param domain - The Twilio (Twilio.Preview) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait Sync
    extends typings.twilio.libBaseVersionMod.default {
    
    /** services - { Twilio.Preview.Sync.ServiceListInstance } resource */
    /* protected */ var _services: js.UndefOr[ServiceListInstance] = js.native
    
    /** Getter for services resource */
    def services: ServiceListInstance = js.native
  }
}
