package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomViewEvent extends TableauEvent {
  /** Gets the CustomView object associated with the event. */
  def getCustomViewAsync(): js.Promise[CustomView] = js.native
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
  @scala.inline
  implicit class CustomViewEventOps[Self <: CustomViewEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCustomViewAsync(value: () => js.Promise[CustomView]): Self = this.set("getCustomViewAsync", js.Any.fromFunction0(value))
  }
  
}

