package typings.twilioDashSync.twilioDashSyncMod

import typings.twilioDashSync.libListitemMod.ListItem
import typings.twilioDashSync.libListitemMod.ListItemDescriptor
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
@JSImport("twilio-sync", "SyncListItem")
@js.native
class SyncListItem protected () extends ListItem {
  /**
    * @private
    * @constructor
    * @param {Object} data Item descriptor
    * @param {Number} data.index Item identifier
    * @param {String} data.uri Item URI
    * @param {Object} data.value Item data
    */
  def this(data: ListItemDescriptor) = this()
}

