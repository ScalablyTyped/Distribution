package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableauEvent extends js.Object {
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  def getEventName(): TableauEventName
  /** Gets the Viz object associated with the event. */
  def getViz(): Viz
}

object TableauEvent {
  @scala.inline
  def apply(getEventName: () => TableauEventName, getViz: () => Viz): TableauEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[TableauEvent]
  }
}

