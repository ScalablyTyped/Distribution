package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the base class for the PrintTaskOptionXxx objects. */
trait IPrintOptionDetails extends StObject {
  
  /** Gets or sets the string for an error condition. */
  var errorText: String
  
  /** Gets the ID for a print task option. */
  var optionId: String
  
  /** Gets the option type for a print task option. */
  var optionType: PrintOptionType
  
  /** Gets or sets the state of a print task option. */
  var state: PrintOptionStates
  
  /**
    * Sets the value for the print task option.
    * @param value Value for the print task option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean
  
  /** Gets the enumerated value of a print task option. */
  var value: js.Any
}
object IPrintOptionDetails {
  
  @scala.inline
  def apply(
    errorText: String,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): IPrintOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintOptionDetails]
  }
  
  @scala.inline
  implicit class IPrintOptionDetailsMutableBuilder[Self <: IPrintOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionId(value: String): Self = StObject.set(x, "optionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionType(value: PrintOptionType): Self = StObject.set(x, "optionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PrintOptionStates): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrySetValue(value: js.Any => Boolean): Self = StObject.set(x, "trySetValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
