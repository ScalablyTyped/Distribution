package typings.winrtUwp.Windows.Devices.SmartCards

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
  
}

