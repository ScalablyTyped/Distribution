package typings.tableau.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.TableauEvent")
@js.native
class TableauEvent () extends js.Object {
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  def getEventName(): TableauEventName = js.native
  /** Gets the Viz object associated with the event. */
  def getViz(): Viz = js.native
}

