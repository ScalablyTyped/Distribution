package typings.vis.visMod

import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineEventPropertiesResult extends js.Object {
  /**
    * The original click event.
    */
  var event: Event
  /**
    *  The id of the clicked group
    */
  var group: js.UndefOr[Double | Null] = js.undefined
  /**
    * The id of the clicked item.
    */
  var item: js.UndefOr[IdType | Null] = js.undefined
  /**
    * Absolute horizontal position of the click event.
    */
  var pageX: Double
  /**
    * Absolute vertical position of the click event.
    */
  var pageY: Double
  /**
    * Date of the clicked event, snapped to a nice value.
    */
  var snappedTime: Date
  /**
    *  Date of the clicked event.
    */
  var time: Date
  /**
    * Name of the clicked thing.
    */
  var what: js.UndefOr[TimelineEventPropertiesResultWhatType] = js.undefined
  /**
    * Relative horizontal position of the click event.
    */
  var x: Double
  /**
    * Relative vertical position of the click event.
    */
  var y: Double
}

object TimelineEventPropertiesResult {
  @scala.inline
  def apply(
    event: Event,
    pageX: Double,
    pageY: Double,
    snappedTime: Date,
    time: Date,
    x: Double,
    y: Double,
    group: Int | Double = null,
    item: IdType = null,
    what: TimelineEventPropertiesResultWhatType = null
  ): TimelineEventPropertiesResult = {
    val __obj = js.Dynamic.literal(event = event, pageX = pageX, pageY = pageY, snappedTime = snappedTime, time = time, x = x, y = y)
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (what != null) __obj.updateDynamic("what")(what)
    __obj.asInstanceOf[TimelineEventPropertiesResult]
  }
}

