package typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardPinPolicy")
@js.native
/** Creates and initializes a new instance of a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
class SmartCardPinPolicy () extends js.Object {
  /** Gets or sets whether number characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var digits: SmartCardPinCharacterPolicyOption = js.native
  /** Gets or sets whether lowercase letter characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var lowercaseLetters: SmartCardPinCharacterPolicyOption = js.native
  /** Gets or sets the maximum character length for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var maxLength: Double = js.native
  /** Gets or sets the minimum character length for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var minLength: Double = js.native
  /** Gets or sets whether special characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var specialCharacters: SmartCardPinCharacterPolicyOption = js.native
  /** Gets or sets whether uppercase letter characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var uppercaseLetters: SmartCardPinCharacterPolicyOption = js.native
}

