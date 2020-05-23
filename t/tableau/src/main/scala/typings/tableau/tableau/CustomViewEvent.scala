package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomViewEvent extends TableauEvent {
  /** Gets the CustomView object associated with the event. */
  def getCustomViewAsync(): js.Promise[CustomView]
}

object CustomViewEvent {
  @scala.inline
  def apply(
    getCustomViewAsync: () => js.Promise[CustomView],
    getEventName: () => TableauEventName,
    getViz: () => Viz
  ): CustomViewEvent = {
    val __obj = js.Dynamic.literal(getCustomViewAsync = js.Any.fromFunction0(getCustomViewAsync), getEventName = js.Any.fromFunction0(getEventName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[CustomViewEvent]
  }
}

