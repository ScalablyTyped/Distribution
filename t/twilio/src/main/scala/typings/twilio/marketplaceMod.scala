package typings.twilio

import typings.twilio.availableAddOnMod.AvailableAddOnContext
import typings.twilio.availableAddOnMod.AvailableAddOnListInstance
import typings.twilio.installedAddOnMod.InstalledAddOnContext
import typings.twilio.installedAddOnMod.InstalledAddOnListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marketplaceMod {
  
  @JSImport("twilio/lib/rest/preview/Marketplace", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Marketplace {
    /**
      * Initialize the Marketplace version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.previewMod.^) = this()
  }
  
  @js.native
  trait Marketplace
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def availableAddOns(sid: String): AvailableAddOnContext = js.native
    @JSName("availableAddOns")
    val availableAddOns_Original: AvailableAddOnListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def installedAddOns(sid: String): InstalledAddOnContext = js.native
    @JSName("installedAddOns")
    val installedAddOns_Original: InstalledAddOnListInstance = js.native
  }
}
