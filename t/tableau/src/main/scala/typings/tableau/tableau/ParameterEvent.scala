package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterEvent extends TableauEvent {
  /** Gets the Parameter object that triggered the event. */
  def getParameterAsync(): js.Promise[Parameter]
  /** Gets the name of the parameter that changed. */
  def getParameterName(): String
}

object ParameterEvent {
  @scala.inline
  def apply(
    getEventName: () => TableauEventName,
    getParameterAsync: () => js.Promise[Parameter],
    getParameterName: () => String,
    getViz: () => Viz
  ): ParameterEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getParameterAsync = js.Any.fromFunction0(getParameterAsync), getParameterName = js.Any.fromFunction0(getParameterName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[ParameterEvent]
  }
}

