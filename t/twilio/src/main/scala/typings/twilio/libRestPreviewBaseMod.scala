package typings.twilio

import typings.twilio.libBaseDomainMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewBaseMod {
  
  @JSImport("twilio/lib/rest/PreviewBase", JSImport.Namespace)
  @js.native
  open class ^ protected () extends PreviewBase {
    /**
      * Initialize preview domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: Any) = this()
  }
  
  @js.native
  trait PreviewBase extends default {
    
    var _deployed_devices: js.UndefOr[typings.twilio.libRestPreviewDeployedDevicesMod.default] = js.native
    
    var _hosted_numbers: js.UndefOr[typings.twilio.libRestPreviewHostedNumbersMod.default] = js.native
    
    var _marketplace: js.UndefOr[typings.twilio.libRestPreviewMarketplaceMod.default] = js.native
    
    var _sync: js.UndefOr[typings.twilio.libRestPreviewSyncMod.default] = js.native
    
    var _understand: js.UndefOr[typings.twilio.libRestPreviewUnderstandMod.default] = js.native
    
    var _wireless: js.UndefOr[typings.twilio.libRestPreviewWirelessMod.default] = js.native
    
    def deployed_devices: typings.twilio.libRestPreviewDeployedDevicesMod.default = js.native
    
    def hosted_numbers: typings.twilio.libRestPreviewHostedNumbersMod.default = js.native
    
    def marketplace: typings.twilio.libRestPreviewMarketplaceMod.default = js.native
    
    def sync: typings.twilio.libRestPreviewSyncMod.default = js.native
    
    def understand: typings.twilio.libRestPreviewUnderstandMod.default = js.native
    
    def wireless: typings.twilio.libRestPreviewWirelessMod.default = js.native
  }
}
