package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.VizResizeEvent")
@js.native
class VizResizeEvent () extends TableauEvent {
  /** Gets the sheetSize record for the current sheet. For more information, see SheetSizeOptions Record. */
  def getVizSize(): Size = js.native
}

