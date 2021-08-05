package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the list of print duplex options. */
trait PrintDuplexOptionDetails extends StObject {
  
  /** Gets or sets the string for an error condition. */
  var errorText: String
  
  /** Gets the list of print duplex options. */
  var items: IVectorView[js.Any]
  
  /** Gets the ID of the print duplex option. */
  var optionId: String
  
  /** Gets the option type of the print duplex option. */
  var optionType: PrintOptionType
  
  /** Gets or sets the state of the print duplex options. */
  var state: PrintOptionStates
  
  /**
    * Sets the value for the duplex option.
    * @param value Value for the duplex option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean
  
  /** Gets or sets the enumerated vlaue of the print duplex option. */
  var value: js.Any
}
object PrintDuplexOptionDetails {
  
  inline def apply(
    errorText: String,
    items: IVectorView[js.Any],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): PrintDuplexOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintDuplexOptionDetails]
  }
  
  extension [Self <: PrintDuplexOptionDetails](x: Self) {
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setItems(value: IVectorView[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setOptionId(value: String): Self = StObject.set(x, "optionId", value.asInstanceOf[js.Any])
    
    inline def setOptionType(value: PrintOptionType): Self = StObject.set(x, "optionType", value.asInstanceOf[js.Any])
    
    inline def setState(value: PrintOptionStates): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTrySetValue(value: js.Any => Boolean): Self = StObject.set(x, "trySetValue", js.Any.fromFunction1(value))
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
