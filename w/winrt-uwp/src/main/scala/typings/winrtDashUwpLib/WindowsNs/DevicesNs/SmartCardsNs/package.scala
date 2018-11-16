package typings
package winrtDashUwpLib.WindowsNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SmartCardsNs {
  /** Represents a method that handles a smart card personal identification number (PIN) reset. */
  type SmartCardPinResetHandler = js.Function2[
    /* sender */ SmartCardProvisioning, 
    /* request */ SmartCardPinResetRequest, 
    scala.Unit
  ]
}
