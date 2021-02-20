package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used by an app to specify the connection parameters for a Wi-Fi Direct connect/pairing operation. */
@js.native
trait WiFiDirectConnectionParameters extends StObject {
  
  /** The group owner intent value used for group owner negotiation in a Wi-Fi Direct connect/pairing operation. */
  var groupOwnerIntent: Double = js.native
  
  /** Gets a list of supported configuration methods, in order of preference. */
  var preferenceOrderedConfigurationMethods: IVector[WiFiDirectConfigurationMethod] = js.native
  
  /** Gets or sets a value specifying a device's preferred pairing procedure. */
  var preferredPairingProcedure: WiFiDirectPairingProcedure = js.native
}
object WiFiDirectConnectionParameters {
  
  @scala.inline
  def apply(
    groupOwnerIntent: Double,
    preferenceOrderedConfigurationMethods: IVector[WiFiDirectConfigurationMethod],
    preferredPairingProcedure: WiFiDirectPairingProcedure
  ): WiFiDirectConnectionParameters = {
    val __obj = js.Dynamic.literal(groupOwnerIntent = groupOwnerIntent.asInstanceOf[js.Any], preferenceOrderedConfigurationMethods = preferenceOrderedConfigurationMethods.asInstanceOf[js.Any], preferredPairingProcedure = preferredPairingProcedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectConnectionParameters]
  }
  
  @scala.inline
  implicit class WiFiDirectConnectionParametersMutableBuilder[Self <: WiFiDirectConnectionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupOwnerIntent(value: Double): Self = StObject.set(x, "groupOwnerIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceOrderedConfigurationMethods(value: IVector[WiFiDirectConfigurationMethod]): Self = StObject.set(x, "preferenceOrderedConfigurationMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredPairingProcedure(value: WiFiDirectPairingProcedure): Self = StObject.set(x, "preferredPairingProcedure", value.asInstanceOf[js.Any])
  }
}
