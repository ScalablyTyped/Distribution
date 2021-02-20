package typings.winrtUwp.Windows.ApplicationModel.Wallet

import typings.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents relevant location data for a wallet item. */
@js.native
trait WalletRelevantLocation extends StObject {
  
  /** Gets or sets the message associated with a relevant location. */
  var displayMessage: String = js.native
  
  /** Gets or sets the basic geographic position information of the location. */
  var position: BasicGeoposition = js.native
}
object WalletRelevantLocation {
  
  @scala.inline
  def apply(displayMessage: String, position: BasicGeoposition): WalletRelevantLocation = {
    val __obj = js.Dynamic.literal(displayMessage = displayMessage.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletRelevantLocation]
  }
  
  @scala.inline
  implicit class WalletRelevantLocationMutableBuilder[Self <: WalletRelevantLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: BasicGeoposition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
