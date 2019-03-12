package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Timeline control.
  * @see {@link Control}
  */
trait TimelineWall extends Control {
  /**
    * Refreshes the data displayed in a timelinewall and timer control.
    */
  def refresh(): scala.Unit
}

object TimelineWall {
  @scala.inline
  def apply(
    getControlType: () => ControlType | java.lang.String,
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getParent: () => Section,
    getVisible: () => scala.Boolean,
    refresh: () => scala.Unit,
    setLabel: java.lang.String => scala.Unit
  ): TimelineWall = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), refresh = js.Any.fromFunction0(refresh), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[TimelineWall]
  }
}

