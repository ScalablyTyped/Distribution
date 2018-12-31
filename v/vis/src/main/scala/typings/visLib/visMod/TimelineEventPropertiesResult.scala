package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineEventPropertiesResult extends js.Object {
  /**
    * The original click event.
    */
  var event: stdLib.Event
  /**
    *  The id of the clicked group
    */
  var group: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The id of the clicked item.
    */
  var item: js.UndefOr[IdType | scala.Null] = js.undefined
  /**
    * Absolute horizontal position of the click event.
    */
  var pageX: scala.Double
  /**
    * Absolute vertical position of the click event.
    */
  var pageY: scala.Double
  /**
    * Date of the clicked event, snapped to a nice value.
    */
  var snappedTime: stdLib.Date
  /**
    *  Date of the clicked event.
    */
  var time: stdLib.Date
  /**
    * Name of the clicked thing.
    */
  var what: js.UndefOr[TimelineEventPropertiesResultWhatType] = js.undefined
  /**
    * Relative horizontal position of the click event.
    */
  var x: scala.Double
  /**
    * Relative vertical position of the click event.
    */
  var y: scala.Double
}

