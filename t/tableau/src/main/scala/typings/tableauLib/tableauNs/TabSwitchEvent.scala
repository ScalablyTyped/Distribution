package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.TabSwitchEvent")
@js.native
class TabSwitchEvent () extends TableauEvent {
  /** Gets the name of the sheet that is currently active. */
  def getNewSheetName(): java.lang.String = js.native
  /** Gets the name of the sheet that was active before the tab switch event occurred. */
  def getOldSheetName(): java.lang.String = js.native
}

