package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual element in a Sync list.
  */
@JSImport("twilio-sync", "SyncListItem")
@js.native
open class SyncListItem protected () extends StObject {
  /**
    * @param descriptor Item descriptor
    * @internal
    */
  def this(descriptor: SyncListItemDescriptor) = this()
  
  /**
    * The contents of the item.
    */
  def data: js.Object = js.native
  
  def dateExpires: String = js.native
  
  /**
    * Date when the list item was last updated.
    */
  def dateUpdated: js.Date = js.native
  
  /* private */ val descriptor: Any = js.native
  
  /**
    * The index, within the containing list, of this item. This index is stable;
    * even if lower-indexed items are removed, this index will remain as is.
    */
  def index: Double = js.native
  
  def lastEventId: Double = js.native
  
  def revision: String = js.native
  
  /**
    * @internal
    */
  def update(eventId: Double, revision: String, data: js.Object, dateUpdated: js.Date): SyncListItem = js.native
  
  /**
    * @internal
    */
  def updateDateExpires(dateExpires: String): Unit = js.native
  
  def uri: String = js.native
}
