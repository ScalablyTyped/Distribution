package typings.twilioDashSync.twilioDashSyncMod

import typings.twilioDashSync.libMapitemMod.MapItem
import typings.twilioDashSync.libMapitemMod.MapItemDescriptor
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
@JSImport("twilio-sync", "SyncMapItem")
@js.native
class SyncMapItem protected () extends MapItem {
  /**
    * @private
    * @constructor
    */
  def this(descriptor: MapItemDescriptor) = this()
}

