package typings.twilioSync.mapitemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def dateExpires: String = js.native
  
  def dateUpdated: Date = js.native
  
  val descriptor: js.Any = js.native
  
  def key: String = js.native
  
  def lastEventId: Double = js.native
  
  def revision: String = js.native
  
  /**
    * @private
    */
  def update(eventId: Double, revision: String, value: js.Object, dateUpdated: Date): MapItem = js.native
  
  /**
    * @private
    */
  def updateDateExpires(dateExpires: String): Unit = js.native
  
  def uri: String = js.native
  
  def value: js.Object = js.native
}
