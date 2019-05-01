package typings
package twilioDashSyncLib.libListitemMod

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
  val dateExpires: java.lang.String = js.native
  val dateUpdated: stdLib.Date = js.native
  val index: scala.Double = js.native
  val lastEventId: scala.Double = js.native
  val revision: java.lang.String = js.native
  val uri: java.lang.String = js.native
  val value: js.Object = js.native
  /**
    * @private
    */
  def update(eventId: scala.Double, revision: java.lang.String, value: js.Object, dateUpdated: stdLib.Date): ListItem = js.native
  /**
    * @private
    */
  def updateDateExpires(dateExpires: java.lang.String): scala.Unit = js.native
}

