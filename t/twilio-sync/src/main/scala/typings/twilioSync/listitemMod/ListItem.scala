package typings.twilioSync.listitemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @classdesc Represents an individual element in a Sync List.
  * @alias ListItem
  * @property {Number} index The index, within the containing List, of this item. This index is stable;
  * even if lower-indexed Items are removed, this index will remain as is.
  * @property {Object} value The contents of the item.
  * @property {Date} dateUpdated Date when the List Item was last updated.
  */
@JSImport("twilio-sync/lib/listitem", "ListItem")
@js.native
class ListItem protected () extends js.Object {
  /**
    * @private
    * @constructor
    * @param {Object} data Item descriptor
    * @param {Number} data.index Item identifier
    * @param {String} data.uri Item URI
    * @param {Object} data.value Item data
    */
  def this(data: ListItemDescriptor) = this()
  val data: js.Any = js.native
  def dateExpires: String = js.native
  def dateUpdated: Date = js.native
  def index: Double = js.native
  def lastEventId: Double = js.native
  def revision: String = js.native
  /**
    * @private
    */
  def update(eventId: Double, revision: String, value: js.Object, dateUpdated: Date): ListItem = js.native
  /**
    * @private
    */
  def updateDateExpires(dateExpires: String): Unit = js.native
  def uri: String = js.native
  def value: js.Object = js.native
}

