package typings.winrtUwp.Windows.Devices.SmartCards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
trait SmartCardPinPolicy extends js.Object {
  /** Gets or sets whether number characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var digits: SmartCardPinCharacterPolicyOption
  /** Gets or sets whether lowercase letter characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var lowercaseLetters: SmartCardPinCharacterPolicyOption
  /** Gets or sets the maximum character length for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var maxLength: Double
  /** Gets or sets the minimum character length for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var minLength: Double
  /** Gets or sets whether special characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var specialCharacters: SmartCardPinCharacterPolicyOption
  /** Gets or sets whether uppercase letter characters are allowed for a personal identification number (PIN) on a Trusted Platform Module (TPM) virtual smart card. */
  var uppercaseLetters: SmartCardPinCharacterPolicyOption
}

object SmartCardPinPolicy {
  @scala.inline
  def apply(
    digits: SmartCardPinCharacterPolicyOption,
    lowercaseLetters: SmartCardPinCharacterPolicyOption,
    maxLength: Double,
    minLength: Double,
    specialCharacters: SmartCardPinCharacterPolicyOption,
    uppercaseLetters: SmartCardPinCharacterPolicyOption
  ): SmartCardPinPolicy = {
    val __obj = js.Dynamic.literal(digits = digits.asInstanceOf[js.Any], lowercaseLetters = lowercaseLetters.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], specialCharacters = specialCharacters.asInstanceOf[js.Any], uppercaseLetters = uppercaseLetters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartCardPinPolicy]
  }
}

