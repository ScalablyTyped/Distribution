package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result obtained from the disambiguation screen displayed on the Cortana canvas. */
trait VoiceCommandDisambiguationResult extends StObject {
  
  /** The item selected from the list of items displayed on the Cortana disambiguation screen. */
  var selectedItem: VoiceCommandContentTile
}
object VoiceCommandDisambiguationResult {
  
  inline def apply(selectedItem: VoiceCommandContentTile): VoiceCommandDisambiguationResult = {
    val __obj = js.Dynamic.literal(selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandDisambiguationResult]
  }
  
  extension [Self <: VoiceCommandDisambiguationResult](x: Self) {
    
    inline def setSelectedItem(value: VoiceCommandContentTile): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
  }
}
