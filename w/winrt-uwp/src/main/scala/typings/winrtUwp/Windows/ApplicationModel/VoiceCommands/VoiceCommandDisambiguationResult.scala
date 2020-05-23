package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The result obtained from the disambiguation screen displayed on the Cortana canvas. */
trait VoiceCommandDisambiguationResult extends js.Object {
  /** The item selected from the list of items displayed on the Cortana disambiguation screen. */
  var selectedItem: VoiceCommandContentTile
}

object VoiceCommandDisambiguationResult {
  @scala.inline
  def apply(selectedItem: VoiceCommandContentTile): VoiceCommandDisambiguationResult = {
    val __obj = js.Dynamic.literal(selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandDisambiguationResult]
  }
}

