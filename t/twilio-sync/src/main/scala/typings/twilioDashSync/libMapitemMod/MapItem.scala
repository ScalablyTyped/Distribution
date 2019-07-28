package typings.twilioDashSync.libMapitemMod

import typings.std.Date
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
  val dateExpires: String = js.native
  val dateUpdated: Date = js.native
  val descriptor: js.Any = js.native
  val key: String = js.native
  val lastEventId: Double = js.native
  val revision: String = js.native
  val uri: String = js.native
  val value: js.Object = js.native
  /**
    * @private
    */
  def update(eventId: Double, revision: String, value: js.Object, dateUpdated: Date): MapItem = js.native
  /**
    * @private
    */
  def updateDateExpires(dateExpires: String): Unit = js.native
}

