package typings.winrt.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTextOptionDetails extends IPrintOptionDetails {
  var maxCharacters: Double = js.native
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
  implicit class IPrintTextOptionDetailsOps[Self <: IPrintTextOptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxCharacters(value: Double): Self = this.set("maxCharacters", value.asInstanceOf[js.Any])
  }
  
}

