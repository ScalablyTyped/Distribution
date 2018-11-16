package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmartCardPinCharacterPolicyOption extends js.Object

/** Specifies the rules for characters in a smart card personal identification number (PIN). */
@JSGlobal("Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption")
@js.native
object SmartCardPinCharacterPolicyOption extends js.Object {
  /** Any of the characters in the specified character class can be in the PIN. */
  @js.native
  sealed trait allow
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardPinCharacterPolicyOption
  
  /** None of the characters in the specified character class can be in the PIN. */
  @js.native
  sealed trait disallow
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardPinCharacterPolicyOption
  
  /** At least one of the characters in the specified character class must be in the PIN. */
  @js.native
  sealed trait requireAtLeastOne
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardPinCharacterPolicyOption
  
  val allow: allow with java.lang.String = js.native
  val disallow: disallow with java.lang.String = js.native
  val requireAtLeastOne: requireAtLeastOne with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardPinCharacterPolicyOption with java.lang.String
  ] = js.native
}

