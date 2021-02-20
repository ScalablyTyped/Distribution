package typings.winrt.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintCustomTextOptionDetails extends IPrintCustomOptionDetails {
  
  var maxCharacters: Double = js.native
}
object IPrintCustomTextOptionDetails {
  
  @scala.inline
  def apply(
    displayName: String,
    errorText: String,
    maxCharacters: Double,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): IPrintCustomTextOptionDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], maxCharacters = maxCharacters.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintCustomTextOptionDetails]
  }
  
  @scala.inline
  implicit class IPrintCustomTextOptionDetailsMutableBuilder[Self <: IPrintCustomTextOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCharacters(value: Double): Self = StObject.set(x, "maxCharacters", value.asInstanceOf[js.Any])
  }
}
