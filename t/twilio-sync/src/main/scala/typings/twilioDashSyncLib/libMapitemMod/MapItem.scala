package typings
package twilioDashSyncLib.libMapitemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @classdesc Represents an individual element in a Sync Map.
  * @alias MapItem
  * @property {String} key The identifier that maps to this item within the containing Map.
  * @property {Object} value The contents of the item.
  * @property {Date} dateUpdated Date when the Map Item was last updated, given in UTC ISO 8601 format (e.g., '2018-04-26T15:23:19.732Z')
  */
@JSImport("twilio-sync/lib/mapitem", "MapItem")
@js.native
class MapItem protected () extends js.Object {
  /**
    * @private
    * @constructor
    */
  def this(descriptor: MapItemDescriptor) = this()
  val dateExpires: java.lang.String = js.native
  val dateUpdated: stdLib.Date = js.native
  val descriptor: js.Any = js.native
  val key: java.lang.String = js.native
  val lastEventId: scala.Double = js.native
  val revision: java.lang.String = js.native
  val uri: java.lang.String = js.native
  val value: js.Object = js.native
  /**
    * @private
    */
  def update(eventId: scala.Double, revision: java.lang.String, value: js.Object, dateUpdated: stdLib.Date): MapItem = js.native
  /**
    * @private
    */
  def updateDateExpires(dateExpires: java.lang.String): scala.Unit = js.native
}

