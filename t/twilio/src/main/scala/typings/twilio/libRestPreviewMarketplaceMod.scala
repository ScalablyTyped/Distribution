package typings.twilio

import typings.twilio.libRestPreviewBaseMod.^
import typings.twilio.libRestPreviewMarketplaceAvailableAddOnMod.AvailableAddOnListInstance
import typings.twilio.libRestPreviewMarketplaceInstalledAddOnMod.InstalledAddOnListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMarketplaceMod {
  
  @JSImport("twilio/lib/rest/preview/Marketplace", JSImport.Default)
  @js.native
  open class default protected () extends Marketplace {
    /**
      * Initialize the Marketplace version of Preview
      *
      * @param domain - The Twilio (Twilio.Preview) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait Marketplace
    extends typings.twilio.libBaseVersionMod.default {
    
    /** availableAddOns - { Twilio.Preview.Marketplace.AvailableAddOnListInstance } resource */
    /* protected */ var _availableAddOns: js.UndefOr[AvailableAddOnListInstance] = js.native
    
    /** installedAddOns - { Twilio.Preview.Marketplace.InstalledAddOnListInstance } resource */
    /* protected */ var _installedAddOns: js.UndefOr[InstalledAddOnListInstance] = js.native
    
    /** Getter for availableAddOns resource */
    def availableAddOns: AvailableAddOnListInstance = js.native
    
    /** Getter for installedAddOns resource */
    def installedAddOns: InstalledAddOnListInstance = js.native
  }
}
