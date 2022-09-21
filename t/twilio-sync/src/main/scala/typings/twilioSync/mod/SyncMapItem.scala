package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual element in a Sync map.
  */
@JSImport("twilio-sync", "SyncMapItem")
@js.native
open class SyncMapItem protected () extends StObject {
  /**
    * @internal
    */
  def this(descriptor: SyncMapItemDescriptor) = this()
  
  /**
    * The contents of the item.
    */
  def data: js.Object = js.native
  
  def dateExpires: String = js.native
  
  /**
    * Date when the map item was last updated.
    */
  def dateUpdated: js.Date = js.native
  
  /* private */ val descriptor: Any = js.native
  
  /**
    * The identifier that maps to this item within the containing Map.
    */
  def key: String = js.native
  
  def lastEventId: Double = js.native
  
  def revision: String = js.native
  
  /**
    * @internal
    */
  def update(eventId: Double, revision: String, value: js.Object, dateUpdated: js.Date): SyncMapItem = js.native
  
  /**
    * @internal
    */
  def updateDateExpires(dateExpires: String): Unit = js.native
  
  def uri: String = js.native
}
