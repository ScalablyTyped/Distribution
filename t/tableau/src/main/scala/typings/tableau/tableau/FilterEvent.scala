package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterEvent extends TableauEvent {
  /** Gets the name of the field. */
  def getFieldName(): String
  /** Gets the Filter object associated with the event. */
  def getFilterAsync(): js.Promise[ConcreteFilter]
  /** Gets the Worksheet object associated with the event. */
  def getWorksheet(): Worksheet
}

object FilterEvent {
  @scala.inline
  def apply(
    getEventName: () => TableauEventName,
    getFieldName: () => String,
    getFilterAsync: () => js.Promise[ConcreteFilter],
    getViz: () => Viz,
    getWorksheet: () => Worksheet
  ): FilterEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getFieldName = js.Any.fromFunction0(getFieldName), getFilterAsync = js.Any.fromFunction0(getFilterAsync), getViz = js.Any.fromFunction0(getViz), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[FilterEvent]
  }
}

