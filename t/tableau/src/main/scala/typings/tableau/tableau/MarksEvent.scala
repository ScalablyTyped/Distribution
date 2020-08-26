package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarksEvent extends TableauEvent {
  /** Gets the selected marks on the Worksheet that triggered the event. */
  def getMarksAsync(): js.Promise[js.Array[Mark]] = js.native
  /** Gets the Worksheet object associated with the event. */
  def getWorksheet(): Worksheet = js.native
}

object MarksEvent {
  @scala.inline
  def apply(
    getEventName: () => TableauEventName,
    getMarksAsync: () => js.Promise[js.Array[Mark]],
    getViz: () => Viz,
    getWorksheet: () => Worksheet
  ): MarksEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getMarksAsync = js.Any.fromFunction0(getMarksAsync), getViz = js.Any.fromFunction0(getViz), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[MarksEvent]
  }
  @scala.inline
  implicit class MarksEventOps[Self <: MarksEvent] (val x: Self) extends AnyVal {
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
    def setGetMarksAsync(value: () => js.Promise[js.Array[Mark]]): Self = this.set("getMarksAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWorksheet(value: () => Worksheet): Self = this.set("getWorksheet", js.Any.fromFunction0(value))
  }
  
}

