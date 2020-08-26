package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The result obtained from the disambiguation screen displayed on the Cortana canvas. */
@js.native
trait VoiceCommandDisambiguationResult extends js.Object {
  /** The item selected from the list of items displayed on the Cortana disambiguation screen. */
  var selectedItem: VoiceCommandContentTile = js.native
}

object VoiceCommandDisambiguationResult {
  @scala.inline
  def apply(selectedItem: VoiceCommandContentTile): VoiceCommandDisambiguationResult = {
    val __obj = js.Dynamic.literal(selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandDisambiguationResult]
  }
  @scala.inline
  implicit class VoiceCommandDisambiguationResultOps[Self <: VoiceCommandDisambiguationResult] (val x: Self) extends AnyVal {
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
    def setSelectedItem(value: VoiceCommandContentTile): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
  }
  
}

