package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a custom print task option. */
trait PrintCustomTextOptionDetails extends StObject {
  
  /** Gets or sets the display name of the custom print task option. */
  var displayName: String
  
  /** Gets or sets the string for an error condition. */
  var errorText: String
  
  /** Gets or sets the maximum number of characters for the display name of the custom print task option. */
  var maxCharacters: Double
  
  /** Gets the ID of the custom print task option. */
  var optionId: String
  
  /** Gets the option type for the custom print task option. */
  var optionType: PrintOptionType
  
  /** Gets or sets the state of a custom print task option. */
  var state: PrintOptionStates
  
  /**
    * Sets the value for the custom print task.
    * @param value Value for the custom print task.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: Any): Boolean
  
  /** Gets or sets the value of a custom print task option. */
  var value: Any
}
object PrintCustomTextOptionDetails {
  
  inline def apply(
    displayName: String,
    errorText: String,
    maxCharacters: Double,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: Any => Boolean,
    value: Any
  ): PrintCustomTextOptionDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], maxCharacters = maxCharacters.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCustomTextOptionDetails]
  }
  
  extension [Self <: PrintCustomTextOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setMaxCharacters(value: Double): Self = StObject.set(x, "maxCharacters", value.asInstanceOf[js.Any])
    
    inline def setOptionId(value: String): Self = StObject.set(x, "optionId", value.asInstanceOf[js.Any])
    
    inline def setOptionType(value: PrintOptionType): Self = StObject.set(x, "optionType", value.asInstanceOf[js.Any])
    
    inline def setState(value: PrintOptionStates): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTrySetValue(value: Any => Boolean): Self = StObject.set(x, "trySetValue", js.Any.fromFunction1(value))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
