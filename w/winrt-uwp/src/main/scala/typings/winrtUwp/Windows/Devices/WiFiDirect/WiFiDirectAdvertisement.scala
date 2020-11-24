package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent a Wi-Fi Direct advertisement and allows the app to control the listen state and custom information elements in the advertisement. */
@js.native
trait WiFiDirectAdvertisement extends js.Object {
  
  /** Information elements to advertise in the Wi-Fi Direct advertisement. */
  var informationElements: IVector[WiFiDirectInformationElement] = js.native
  
  /** Whether autonomous group owner will be enabled. */
  var isAutonomousGroupOwnerEnabled: Boolean = js.native
  
  /** Gets the settings object for "legacy" (non-Wi-Fi Direct) connections. */
  var legacySettings: WiFiDirectLegacySettings = js.native
  
  /** Gets or sets the listen state and whether the Wi-Fi Direct device is discoverable. */
  var listenStateDiscoverability: WiFiDirectAdvertisementListenStateDiscoverability = js.native
  
  /** Gets a device's supported configuration methods. */
  var supportedConfigurationMethods: IVector[WiFiDirectConfigurationMethod] = js.native
}
object WiFiDirectAdvertisement {
  
  @scala.inline
  def apply(
    informationElements: IVector[WiFiDirectInformationElement],
    isAutonomousGroupOwnerEnabled: Boolean,
    legacySettings: WiFiDirectLegacySettings,
    listenStateDiscoverability: WiFiDirectAdvertisementListenStateDiscoverability,
    supportedConfigurationMethods: IVector[WiFiDirectConfigurationMethod]
  ): WiFiDirectAdvertisement = {
    val __obj = js.Dynamic.literal(informationElements = informationElements.asInstanceOf[js.Any], isAutonomousGroupOwnerEnabled = isAutonomousGroupOwnerEnabled.asInstanceOf[js.Any], legacySettings = legacySettings.asInstanceOf[js.Any], listenStateDiscoverability = listenStateDiscoverability.asInstanceOf[js.Any], supportedConfigurationMethods = supportedConfigurationMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectAdvertisement]
  }
  
  @scala.inline
  implicit class WiFiDirectAdvertisementOps[Self <: WiFiDirectAdvertisement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInformationElements(value: IVector[WiFiDirectInformationElement]): Self = this.set("informationElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutonomousGroupOwnerEnabled(value: Boolean): Self = this.set("isAutonomousGroupOwnerEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacySettings(value: WiFiDirectLegacySettings): Self = this.set("legacySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenStateDiscoverability(value: WiFiDirectAdvertisementListenStateDiscoverability): Self = this.set("listenStateDiscoverability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedConfigurationMethods(value: IVector[WiFiDirectConfigurationMethod]): Self = this.set("supportedConfigurationMethods", value.asInstanceOf[js.Any])
  }
}
