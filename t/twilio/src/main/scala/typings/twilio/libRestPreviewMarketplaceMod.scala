package typings.twilio

import typings.twilio.libRestPreviewMarketplaceAvailableAddOnMod.AvailableAddOnContext
import typings.twilio.libRestPreviewMarketplaceAvailableAddOnMod.AvailableAddOnListInstance
import typings.twilio.libRestPreviewMarketplaceInstalledAddOnMod.InstalledAddOnContext
import typings.twilio.libRestPreviewMarketplaceInstalledAddOnMod.InstalledAddOnListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMarketplaceMod {
  
  @JSImport("twilio/lib/rest/preview/Marketplace", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Marketplace {
    /**
      * Initialize the Marketplace version of Preview
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestPreviewMod.^) = this()
  }
  
  @js.native
  trait Marketplace
    extends typings.twilio.libBaseVersionMod.^ {
    
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
