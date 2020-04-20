package typings.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the discovered services list is updated
		 */
trait BonjourBrowserUpdatedservicesEvent extends BonjourBrowserBaseEvent {
  /**
  			 * An array of BonjourService objects corresponding to currently available services.  If you cache this value, including using it as table data, be aware that it could become out of date at any time due to the asynchronous nature of Bonjour service discovery.
  			 */
  var services: js.Array[BonjourService]
}

object BonjourBrowserUpdatedservicesEvent {
  @scala.inline
  def apply(services: js.Array[BonjourService], source: BonjourBrowser): BonjourBrowserUpdatedservicesEvent = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourBrowserUpdatedservicesEvent]
  }
}

