package typings.vis.mod

import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineEventPropertiesResult extends js.Object {
  /**
    * The original click event.
    */
  var event: Event = js.native
  /**
    *  The id of the clicked group
    */
  var group: js.UndefOr[Double | Null] = js.native
  /**
    * The id of the clicked item.
    */
  var item: js.UndefOr[IdType | Null] = js.native
  /**
    * Absolute horizontal position of the click event.
    */
  var pageX: Double = js.native
  /**
    * Absolute vertical position of the click event.
    */
  var pageY: Double = js.native
  /**
    * Date of the clicked event, snapped to a nice value.
    */
  var snappedTime: Date = js.native
  /**
    *  Date of the clicked event.
    */
  var time: Date = js.native
  /**
    * Name of the clicked thing.
    */
  var what: js.UndefOr[TimelineEventPropertiesResultWhatType] = js.native
  /**
    * Relative horizontal position of the click event.
    */
  var x: Double = js.native
  /**
    * Relative vertical position of the click event.
    */
  var y: Double = js.native
}

object TimelineEventPropertiesResult {
  @scala.inline
  def apply(event: Event, pageX: Double, pageY: Double, snappedTime: Date, time: Date, x: Double, y: Double): TimelineEventPropertiesResult = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], snappedTime = snappedTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineEventPropertiesResult]
  }
  @scala.inline
  implicit class TimelineEventPropertiesResultOps[Self <: TimelineEventPropertiesResult] (val x: Self) extends AnyVal {
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
    def setEvent(value: Event): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnappedTime(value: Date): Self = this.set("snappedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Date): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: Double): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
    @scala.inline
    def setItem(value: IdType): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setItemNull: Self = this.set("item", null)
    @scala.inline
    def setWhat(value: TimelineEventPropertiesResultWhatType): Self = this.set("what", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhat: Self = this.set("what", js.undefined)
  }
  
}

