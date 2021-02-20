package typings.winrtUwp.Windows.UI.Notifications

import typings.std.Date
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the visual content and timing for a single, non-recurring scheduled update to a tile. */
@js.native
trait ScheduledTileNotification extends StObject {
  
  /** Gets the XML description of the content of the scheduled tile update. */
  var content: XmlDocument = js.native
  
  /** Gets the time at which the tile is scheduled to be updated. */
  var deliveryTime: Date = js.native
  
  /** Gets or sets the time after which the tile notification should no longer be shown. By default, a tile notification does not expire. It is a best practice to explicitly set an expiration time to avoid stale content. */
  var expirationTime: Date = js.native
  
  /** Gets or sets the unique ID that is used to identify the scheduled tile in the schedule. */
  var id: String = js.native
  
  /** Gets or sets a string that Windows can use to prevent duplicate notification content from appearing in the queue. */
  var tag: String = js.native
}
object ScheduledTileNotification {
  
  @scala.inline
  def apply(content: XmlDocument, deliveryTime: Date, expirationTime: Date, id: String, tag: String): ScheduledTileNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledTileNotification]
  }
  
  @scala.inline
  implicit class ScheduledTileNotificationMutableBuilder[Self <: ScheduledTileNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: XmlDocument): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTime(value: Date): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
