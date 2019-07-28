package typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs

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
  sealed trait allow extends SmartCardPinCharacterPolicyOption
  
  /** None of the characters in the specified character class can be in the PIN. */
  @js.native
  sealed trait disallow extends SmartCardPinCharacterPolicyOption
  
  /** At least one of the characters in the specified character class must be in the PIN. */
  @js.native
  sealed trait requireAtLeastOne extends SmartCardPinCharacterPolicyOption
  
  /* 0 */ val allow: typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs.SmartCardPinCharacterPolicyOption.allow with Double = js.native
  /* 2 */ val disallow: typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs.SmartCardPinCharacterPolicyOption.disallow with Double = js.native
  /* 1 */ val requireAtLeastOne: typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs.SmartCardPinCharacterPolicyOption.requireAtLeastOne with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmartCardPinCharacterPolicyOption with Double] = js.native
}

