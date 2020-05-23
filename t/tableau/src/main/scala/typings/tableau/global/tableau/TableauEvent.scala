package typings.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.TableauEvent")
@js.native
class TableauEvent ()
  extends typings.tableau.tableau.TableauEvent {
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typings.tableau.tableau.TableauEventName = js.native
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typings.tableau.tableau.Viz = js.native
}

