package typings.tableau.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.MarksEvent")
@js.native
class MarksEvent () extends TableauEvent {
  /** Gets the selected marks on the Worksheet that triggered the event. */
  def getMarksAsync(): js.Promise[js.Array[Mark]] = js.native
  /** Gets the Worksheet object associated with the event. */
  def getWorksheet(): Worksheet = js.native
}

