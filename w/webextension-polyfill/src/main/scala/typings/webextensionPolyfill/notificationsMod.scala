package typings.webextensionPolyfill

import typings.std.Record
import typings.webextensionPolyfill.eventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod {
  
  object Notifications {
    
    trait CreateNotificationOptions extends StObject {
      
      /**
        * A URL to the app icon mask.
        * Optional.
        */
      var appIconMaskUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Alternate notification content with a lower-weight font.
        * Optional.
        */
      var contextMessage: js.UndefOr[String] = js.undefined
      
      /**
        * A timestamp associated with the notification, in milliseconds past the epoch.
        * Optional.
        */
      var eventTime: js.UndefOr[Double] = js.undefined
      
      /**
        * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
        * Optional.
        */
      var iconUrl: js.UndefOr[String] = js.undefined
      
      /**
        * A URL to the image thumbnail for image-type notifications.
        * Optional.
        */
      var imageUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
        * Optional.
        */
      var isClickable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Items for multi-item notifications.
        * Optional.
        */
      var items: js.UndefOr[js.Array[NotificationItem]] = js.undefined
      
      /**
        * Main notification content.
        */
      var message: String
      
      /**
        * Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest. Zero is default.
        * Optional.
        */
      var priority: js.UndefOr[Double] = js.undefined
      
      /**
        * Current progress ranges from 0 to 100.
        * Optional.
        */
      var progress: js.UndefOr[Double] = js.undefined
      
      /**
        * Title of the notification (e.g. sender name for email).
        */
      var title: String
      
      /**
        * Which type of notification to display.
        */
      var `type`: TemplateType
    }
    object CreateNotificationOptions {
      
      inline def apply(message: String, title: String, `type`: TemplateType): CreateNotificationOptions = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateNotificationOptions]
      }
      
      extension [Self <: CreateNotificationOptions](x: Self) {
        
        inline def setAppIconMaskUrl(value: String): Self = StObject.set(x, "appIconMaskUrl", value.asInstanceOf[js.Any])
        
        inline def setAppIconMaskUrlUndefined: Self = StObject.set(x, "appIconMaskUrl", js.undefined)
        
        inline def setContextMessage(value: String): Self = StObject.set(x, "contextMessage", value.asInstanceOf[js.Any])
        
        inline def setContextMessageUndefined: Self = StObject.set(x, "contextMessage", js.undefined)
        
        inline def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
        
        inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
        
        inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
        
        inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
        
        inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
        
        inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
        
        inline def setIsClickable(value: Boolean): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
        
        inline def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
        
        inline def setItems(value: js.Array[NotificationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: NotificationItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
        
        inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
        
        inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setType(value: TemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait NotificationItem extends StObject {
      
      /**
        * Additional details about this item.
        */
      var message: String
      
      /**
        * Title of one item of a list notification.
        */
      var title: String
    }
    object NotificationItem {
      
      inline def apply(message: String, title: String): NotificationItem = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[NotificationItem]
      }
      
      extension [Self <: NotificationItem](x: Self) {
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.granted
      - typings.webextensionPolyfill.webextensionPolyfillStrings.denied
    */
    trait PermissionLevel extends StObject
    object PermissionLevel {
      
      inline def denied: typings.webextensionPolyfill.webextensionPolyfillStrings.denied = "denied".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.denied]
      
      inline def granted: typings.webextensionPolyfill.webextensionPolyfillStrings.granted = "granted".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.granted]
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Clears an existing notification.
        *
        * @param notificationId The id of the notification to be updated.
        */
      def clear(notificationId: String): js.Promise[Boolean] = js.native
      
      /**
        * Creates and displays a notification.
        *
        * @param notificationId Optional. Identifier of the notification. If it is empty, this method generates an id.
        * If it matches an existing notification, this method first clears that notification before proceeding with the create
        * operation.
        * @param options Contents of the notification.
        */
      def create(notificationId: String, options: CreateNotificationOptions): js.Promise[String] = js.native
      def create(notificationId: Unit, options: CreateNotificationOptions): js.Promise[String] = js.native
      /**
        * Creates and displays a notification.
        *
        * @param options Contents of the notification.
        */
      def create(options: CreateNotificationOptions): js.Promise[String] = js.native
      
      /**
        * Retrieves all the notifications.
        */
      def getAll(): js.Promise[Record[String, CreateNotificationOptions]] = js.native
      
      /**
        * Fired when the  user pressed a button in the notification.
        *
        * @param notificationId The notificationId of the clicked notification.
        * @param buttonIndex The index of the button clicked by the user.
        */
      var onButtonClicked: Event[js.Function2[/* notificationId */ String, /* buttonIndex */ Double, Unit]] = js.native
      
      /**
        * Fired when the user clicked in a non-button area of the notification.
        *
        * @param notificationId The notificationId of the clicked notification.
        */
      var onClicked: Event[js.Function1[/* notificationId */ String, Unit]] = js.native
      
      /**
        * Fired when the notification closed, either by the system or by user action.
        *
        * @param notificationId The notificationId of the closed notification.
        * @param byUser True if the notification was closed by the user.
        */
      var onClosed: Event[js.Function2[/* notificationId */ String, /* byUser */ Boolean, Unit]] = js.native
      
      /**
        * Fired when the notification is shown.
        *
        * @param notificationId The notificationId of the shown notification.
        */
      var onShown: Event[js.Function1[/* notificationId */ String, Unit]] = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.basic
      - typings.webextensionPolyfill.webextensionPolyfillStrings.image
      - typings.webextensionPolyfill.webextensionPolyfillStrings.list
      - typings.webextensionPolyfill.webextensionPolyfillStrings.progress
    */
    trait TemplateType extends StObject
    object TemplateType {
      
      inline def basic: typings.webextensionPolyfill.webextensionPolyfillStrings.basic = "basic".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.basic]
      
      inline def image: typings.webextensionPolyfill.webextensionPolyfillStrings.image = "image".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.image]
      
      inline def list: typings.webextensionPolyfill.webextensionPolyfillStrings.list = "list".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.list]
      
      inline def progress: typings.webextensionPolyfill.webextensionPolyfillStrings.progress = "progress".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.progress]
    }
    
    trait UpdateNotificationOptions extends StObject {
      
      /**
        * A URL to the app icon mask.
        * Optional.
        */
      var appIconMaskUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Alternate notification content with a lower-weight font.
        * Optional.
        */
      var contextMessage: js.UndefOr[String] = js.undefined
      
      /**
        * A timestamp associated with the notification, in milliseconds past the epoch.
        * Optional.
        */
      var eventTime: js.UndefOr[Double] = js.undefined
      
      /**
        * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
        * Optional.
        */
      var iconUrl: js.UndefOr[String] = js.undefined
      
      /**
        * A URL to the image thumbnail for image-type notifications.
        * Optional.
        */
      var imageUrl: js.UndefOr[String] = js.undefined
      
      /**
        * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
        * Optional.
        */
      var isClickable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Items for multi-item notifications.
        * Optional.
        */
      var items: js.UndefOr[js.Array[NotificationItem]] = js.undefined
      
      /**
        * Main notification content.
        * Optional.
        */
      var message: js.UndefOr[String] = js.undefined
      
      /**
        * Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest. Zero is default.
        * Optional.
        */
      var priority: js.UndefOr[Double] = js.undefined
      
      /**
        * Current progress ranges from 0 to 100.
        * Optional.
        */
      var progress: js.UndefOr[Double] = js.undefined
      
      /**
        * Title of the notification (e.g. sender name for email).
        * Optional.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * Which type of notification to display.
        * Optional.
        */
      var `type`: js.UndefOr[TemplateType] = js.undefined
    }
    object UpdateNotificationOptions {
      
      inline def apply(): UpdateNotificationOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateNotificationOptions]
      }
      
      extension [Self <: UpdateNotificationOptions](x: Self) {
        
        inline def setAppIconMaskUrl(value: String): Self = StObject.set(x, "appIconMaskUrl", value.asInstanceOf[js.Any])
        
        inline def setAppIconMaskUrlUndefined: Self = StObject.set(x, "appIconMaskUrl", js.undefined)
        
        inline def setContextMessage(value: String): Self = StObject.set(x, "contextMessage", value.asInstanceOf[js.Any])
        
        inline def setContextMessageUndefined: Self = StObject.set(x, "contextMessage", js.undefined)
        
        inline def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
        
        inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
        
        inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
        
        inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
        
        inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
        
        inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
        
        inline def setIsClickable(value: Boolean): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
        
        inline def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
        
        inline def setItems(value: js.Array[NotificationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: NotificationItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
        
        inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
        
        inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: TemplateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
  }
}
