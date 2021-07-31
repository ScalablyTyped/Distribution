package typings.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmartCardPinCharacterPolicyOption extends StObject
/** Specifies the rules for characters in a smart card personal identification number (PIN). */
@JSGlobal("Windows.Devices.SmartCards.SmartCardPinCharacterPolicyOption")
@js.native
object SmartCardPinCharacterPolicyOption extends StObject {
  
  /** Any of the characters in the specified character class can be in the PIN. */
  @js.native
  sealed trait allow
    extends StObject
       with SmartCardPinCharacterPolicyOption
  
  /** None of the characters in the specified character class can be in the PIN. */
  @js.native
  sealed trait disallow
    extends StObject
       with SmartCardPinCharacterPolicyOption
  
  /** At least one of the characters in the specified character class must be in the PIN. */
  @js.native
  sealed trait requireAtLeastOne
    extends StObject
       with SmartCardPinCharacterPolicyOption
}
