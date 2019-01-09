package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.IPrintCustomOptionDetails because var conflicts: errorText, optionId, optionType, state, value. Inlined displayName */ trait IPrintCustomItemListOptionDetails extends IPrintItemListOptionDetails {
  var displayName: java.lang.String
  def addItem(itemId: java.lang.String, displayName: java.lang.String): scala.Unit
}

