package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Timeline control.
  * @see {@link Control}
  */
@js.native
trait TimelineWall extends Control {
  /**
    * Refreshes the data displayed in a timelinewall and timer control.
    */
  def refresh(): Unit = js.native
}

object TimelineWall {
  @scala.inline
  def apply(
    getControlType: () => ControlType | String,
    getLabel: () => String,
    getName: () => String,
    getParent: () => Section,
    getVisible: () => Boolean,
    refresh: () => Unit,
    setLabel: String => Unit
  ): TimelineWall = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), refresh = js.Any.fromFunction0(refresh), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[TimelineWall]
  }
  @scala.inline
  implicit class TimelineWallOps[Self <: TimelineWall] (val x: Self) extends AnyVal {
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
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
  }
  
}

