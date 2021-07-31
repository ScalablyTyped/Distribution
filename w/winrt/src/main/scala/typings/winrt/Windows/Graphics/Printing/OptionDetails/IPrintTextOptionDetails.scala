package typings.winrt.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTextOptionDetails
  extends StObject
     with IPrintOptionDetails {
  
  var maxCharacters: Double
}
object IPrintTextOptionDetails {
  
  @scala.inline
  def apply(
    errorText: String,
    maxCharacters: Double,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): IPrintTextOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], maxCharacters = maxCharacters.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTextOptionDetails]
  }
  
  @scala.inline
  implicit class IPrintTextOptionDetailsMutableBuilder[Self <: IPrintTextOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCharacters(value: Double): Self = StObject.set(x, "maxCharacters", value.asInstanceOf[js.Any])
  }
}
