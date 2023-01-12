package typings.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of personal identification number (PIN) rules on a Trusted Platform Module (TPM) virtual smart card. */
trait SmartCardPinPolicy extends StObject {
  
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
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartCardPinPolicy] (val x: Self) extends AnyVal {
    
    inline def setDigits(value: SmartCardPinCharacterPolicyOption): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setLowercaseLetters(value: SmartCardPinCharacterPolicyOption): Self = StObject.set(x, "lowercaseLetters", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setSpecialCharacters(value: SmartCardPinCharacterPolicyOption): Self = StObject.set(x, "specialCharacters", value.asInstanceOf[js.Any])
    
    inline def setUppercaseLetters(value: SmartCardPinCharacterPolicyOption): Self = StObject.set(x, "uppercaseLetters", value.asInstanceOf[js.Any])
  }
}
