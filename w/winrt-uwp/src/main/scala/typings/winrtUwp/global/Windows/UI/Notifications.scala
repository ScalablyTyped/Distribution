package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.UI.Notifications.BadgeTemplateType
import typings.winrtUwp.Windows.UI.Notifications.NotificationSetting
import typings.winrtUwp.Windows.UI.Notifications.TileTemplateType
import typings.winrtUwp.Windows.UI.Notifications.ToastDismissalReason
import typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType
import typings.winrtUwp.Windows.UI.Notifications.ToastTemplateType
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes that encapsulate tile, toast, and badge notifications. */
object Notifications {
  
  /** Defines the content, associated metadata, and expiration time of an update to a tile's badge overlay. A badge can display a number from 1 to 99 or a status glyph. */
  @JSGlobal("Windows.UI.Notifications.BadgeNotification")
  @js.native
  open class BadgeNotification protected ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.BadgeNotification {
    /**
      * Creates and initializes a new instance of the BadgeNotification .
      * @param content The XML content that defines the badge update.
      */
    def this(content: XmlDocument) = this()
    
    /** Gets the XML that defines the value or glyph used as the tile's badge. */
    /* CompleteClass */
    var content: XmlDocument = js.native
    
    /** Gets or sets the time that Windows will remove the badge from the tile. By default, local badge notifications do not expire and push, periodic, and scheduled badge notifications expire after three days. It is a best practice to explicitly set an expiration time to avoid stale content. */
    /* CompleteClass */
    var expirationTime: js.Date = js.native
  }
  
  /** Specifies the template to use for a tile's badge overlay. Used by BadgeUpdateManager.getTemplateContent . */
  @JSGlobal("Windows.UI.Notifications.BadgeTemplateType")
  @js.native
  object BadgeTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Notifications.BadgeTemplateType & Double] = js.native
    
    /* 0 */ val badgeGlyph: typings.winrtUwp.Windows.UI.Notifications.BadgeTemplateType.badgeGlyph & Double = js.native
    
    /* 1 */ val badgeNumber: typings.winrtUwp.Windows.UI.Notifications.BadgeTemplateType.badgeNumber & Double = js.native
  }
  
  /** Creates BadgeUpdater objects that you use to manipulate a tile's badge overlay. This class also provides access to the XML content of the system-provided badge templates so that you can customize that content for use in updating your badges. */
  @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
  @js.native
  abstract class BadgeUpdateManager ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.BadgeUpdateManager
  object BadgeUpdateManager {
    
    @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and initializes a new instance of the BadgeUpdater , which lets you change the appearance or content of the badge on the calling app's tile.
      * @return The object you will use to send changes to the app tile's badge.
      */
    /* static member */
    inline def createBadgeUpdaterForApplication(): typings.winrtUwp.Windows.UI.Notifications.BadgeUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createBadgeUpdaterForApplication")().asInstanceOf[typings.winrtUwp.Windows.UI.Notifications.BadgeUpdater]
    /**
      * Creates and initializes a new instance of the BadgeUpdater for a specified app tile's badge, usually the tile of another app in the package. The BadgeUpdater lets you change the appearance or content of that badge.
      * @param applicationId The unique ID of the tile whose badge you want to update.
      * @return The object you will use to send changes to the application tile's badge.
      */
    /* static member */
    inline def createBadgeUpdaterForApplication(applicationId: String): typings.winrtUwp.Windows.UI.Notifications.BadgeUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createBadgeUpdaterForApplication")(applicationId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.UI.Notifications.BadgeUpdater]
    
    /**
      * Creates and initializes a new instance of the BadgeUpdater , which enables you to change the appearance or content of a badge on a secondary tile . The tile can belong to the calling app or any other app in the same package.
      * @param tileId The unique ID of the tile.
      * @return The object you will use to send badge updates to the tile identified by tileID.
      */
    /* static member */
    inline def createBadgeUpdaterForSecondaryTile(tileId: String): typings.winrtUwp.Windows.UI.Notifications.BadgeUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createBadgeUpdaterForSecondaryTile")(tileId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.UI.Notifications.BadgeUpdater]
    
    /**
      * Gets the XML content of one of the predefined badge templates so that you can customize it for a badge update.
      * @param type The type of badge template, either a glyph or a number.
      * @return The object that contains the template XML.
      */
    /* static member */
    inline def getTemplateContent(`type`: BadgeTemplateType): XmlDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateContent")(`type`.asInstanceOf[js.Any]).asInstanceOf[XmlDocument]
  }
  
  /** Updates a badge overlay on the specific tile that the updater is bound to. */
  @JSGlobal("Windows.UI.Notifications.BadgeUpdater")
  @js.native
  abstract class BadgeUpdater ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.BadgeUpdater
  
  /** Specifies the limitations on tile or toast notification display. */
  @JSGlobal("Windows.UI.Notifications.NotificationSetting")
  @js.native
  object NotificationSetting extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Notifications.NotificationSetting & Double] = js.native
    
    /* 3 */ val disabledByGroupPolicy: typings.winrtUwp.Windows.UI.Notifications.NotificationSetting.disabledByGroupPolicy & Double = js.native
    
    /* 4 */ val disabledByManifest: typings.winrtUwp.Windows.UI.Notifications.NotificationSetting.disabledByManifest & Double = js.native
    
    /* 1 */ val disabledForApplication: typings.winrtUwp.Windows.UI.Notifications.NotificationSetting.disabledForApplication & Double = js.native
    
    /* 2 */ val disabledForUser: typings.winrtUwp.Windows.UI.Notifications.NotificationSetting.disabledForUser & Double = js.native
    
    /* 0 */ val enabled: typings.winrtUwp.Windows.UI.Notifications.NotificationSetting.enabled & Double = js.native
  }
  
  /** Specifies the time period for subsequent polls of the tile or badge data source for new content. Used by BadgeUpdater.StartPeriodicUpdate , TileUpdater.StartPeriodicUpdate , and TileUpdater.StartPeriodicUpdateBatch . */
  @JSGlobal("Windows.UI.Notifications.PeriodicUpdateRecurrence")
  @js.native
  object PeriodicUpdateRecurrence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence & Double] = js.native
    
    /* 4 */ val daily: typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.daily & Double = js.native
    
    /* 0 */ val halfHour: typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.halfHour & Double = js.native
    
    /* 1 */ val hour: typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.hour & Double = js.native
    
    /* 2 */ val sixHours: typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.sixHours & Double = js.native
    
    /* 3 */ val twelveHours: typings.winrtUwp.Windows.UI.Notifications.PeriodicUpdateRecurrence.twelveHours & Double = js.native
  }
  
  /** Defines the visual content and timing for a single, non-recurring scheduled update to a tile. */
  @JSGlobal("Windows.UI.Notifications.ScheduledTileNotification")
  @js.native
  open class ScheduledTileNotification protected ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ScheduledTileNotification {
    /**
      * Creates and initializes a new instance of the ScheduledTileNotification object for use with a TileUpdater .
      * @param content The object that provides the content for the tile notification.
      * @param deliveryTime The time at which the tile should be updated with the notification information.
      */
    def this(content: XmlDocument, deliveryTime: js.Date) = this()
    
    /** Gets the XML description of the content of the scheduled tile update. */
    /* CompleteClass */
    var content: XmlDocument = js.native
    
    /** Gets the time at which the tile is scheduled to be updated. */
    /* CompleteClass */
    var deliveryTime: js.Date = js.native
    
    /** Gets or sets the time after which the tile notification should no longer be shown. By default, a tile notification does not expire. It is a best practice to explicitly set an expiration time to avoid stale content. */
    /* CompleteClass */
    var expirationTime: js.Date = js.native
    
    /** Gets or sets the unique ID that is used to identify the scheduled tile in the schedule. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets or sets a string that Windows can use to prevent duplicate notification content from appearing in the queue. */
    /* CompleteClass */
    var tag: String = js.native
  }
  
  /** Contains the XML that defines the toast notification that will display at the scheduled time. */
  @JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
  @js.native
  open class ScheduledToastNotification protected ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ScheduledToastNotification {
    /**
      * Creates and initializes a new instance of a ScheduledToastNotification that will be displayed only once.
      * @param content The XML that defines the toast notification content.
      * @param deliveryTime The date and time that Windows should display the toast notification. You must call AddToSchedule before this time.
      */
    def this(content: XmlDocument, deliveryTime: js.Date) = this()
    /**
      * Creates and initializes a new instance of a recurring ScheduledToastNotification .
      * @param content The XML that defines the toast notification content.
      * @param deliveryTime The date and time that Windows should first display the toast notification. You must call AddToSchedule before this time.
      * @param snoozeInterval The amount of time between occurrences of the notification. To be valid, this value must be no less than 60 seconds and no more than 60 minutes.
      * @param maximumSnoozeCount The maximum number of times to display this notification. Valid values range from 1 to 5.
      */
    def this(content: XmlDocument, deliveryTime: js.Date, snoozeInterval: Double, maximumSnoozeCount: Double) = this()
    
    /** Gets the XML that defines this scheduled toast notification. */
    /* CompleteClass */
    var content: XmlDocument = js.native
    
    /** Gets the time that this toast notification is scheduled to be displayed. */
    /* CompleteClass */
    var deliveryTime: js.Date = js.native
    
    /** Gets or sets the group identifier for the notification. */
    /* CompleteClass */
    var group: String = js.native
    
    /** Gets a developer-specified value used to identify a specific scheduled toast. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets the maximum number of times to display this notification. */
    /* CompleteClass */
    var maximumSnoozeCount: Double = js.native
    
    /** Gets the amount of time between occurrences of the notification. */
    /* CompleteClass */
    var snoozeInterval: Double = js.native
    
    /** Gets or sets whether a toast's pop-up UI is displayed on the Windows Phone 8.1 screen. */
    /* CompleteClass */
    var suppressPopup: Boolean = js.native
    
    /** Gets or sets a string that uniquely identifies a toast notification inside a Group . */
    /* CompleteClass */
    var tag: String = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.TileFlyoutNotification")
  @js.native
  abstract class TileFlyoutNotification ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.TileFlyoutNotification {
    
    /* CompleteClass */
    var content: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var expirationTime: Any = js.native
  }
  
  object TileFlyoutTemplateType {
    
    @JSGlobal("Windows.UI.Notifications.TileFlyoutTemplateType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.UI.Notifications.TileFlyoutTemplateType.tileFlyoutTemplate01")
    @js.native
    def tileFlyoutTemplate01: Any = js.native
    inline def tileFlyoutTemplate01_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tileFlyoutTemplate01")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdateManager")
  @js.native
  abstract class TileFlyoutUpdateManager ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.TileFlyoutUpdateManager
  object TileFlyoutUpdateManager {
    
    @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdateManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdateManager.createTileFlyoutUpdaterForApplication")
    @js.native
    def createTileFlyoutUpdaterForApplication: Any = js.native
    inline def createTileFlyoutUpdaterForApplication_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTileFlyoutUpdaterForApplication")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdateManager.createTileFlyoutUpdaterForSecondaryTile")
    @js.native
    def createTileFlyoutUpdaterForSecondaryTile: Any = js.native
    inline def createTileFlyoutUpdaterForSecondaryTile_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTileFlyoutUpdaterForSecondaryTile")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdateManager.getTemplateContent")
    @js.native
    def getTemplateContent: Any = js.native
    inline def getTemplateContent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTemplateContent")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.UI.Notifications.TileFlyoutUpdater")
  @js.native
  abstract class TileFlyoutUpdater ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.TileFlyoutUpdater {
    
    /* CompleteClass */
    var clear: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setting: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var startPeriodicUpdate: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var stopPeriodicUpdate: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var update: Any = js.native
  }
  
  /** Defines an update to a tile, including its visuals, identification tag, and expiration time. */
  @JSGlobal("Windows.UI.Notifications.TileNotification")
  @js.native
  open class TileNotification protected ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.TileNotification {
    /**
      * Creates and initializes a new instance of the TileNotification object for use with a TileUpdater .
      * @param content The object that provides the content for the tile notification.
      */
    def this(content: XmlDocument) = this()
    
    /** Gets the XML description of the notification content, which you can then manipulate to alter the notification. */
    /* CompleteClass */
    var content: XmlDocument = js.native
    
    /** Gets or sets the time that Windows will remove the notification from the tile. By default, a tile update does not expire. It is a best practice to explicitly set an expiration time to avoid stale content. */
    /* CompleteClass */
    var expirationTime: js.Date = js.native
    
    /** Gets or sets a string that Windows can use to prevent duplicate notification content from appearing in the queue. */
    /* CompleteClass */
    var tag: String = js.native
  }
  
  /** Specifies the content template to use in a tile update. For a more detailed discussion of each tile, including an example of its XML coding, specifics on each template's image sizes, and use with different versions of the tile XML schema, see The tile template catalog. */
  @JSGlobal("Windows.UI.Notifications.TileTemplateType")
  @js.native
  object TileTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Notifications.TileTemplateType & Double] = js.native
    
    /* 47 */ val tileSquare150x150Block: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Block & Double = js.native
    
    /* 122 */ val tileSquare150x150IconWithBadge: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150IconWithBadge & Double = js.native
    
    /* 46 */ val tileSquare150x150Image: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Image & Double = js.native
    
    /* 52 */ val tileSquare150x150PeekImageAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150PeekImageAndText01 & Double = js.native
    
    /* 53 */ val tileSquare150x150PeekImageAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150PeekImageAndText02 & Double = js.native
    
    /* 54 */ val tileSquare150x150PeekImageAndText03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150PeekImageAndText03 & Double = js.native
    
    /* 55 */ val tileSquare150x150PeekImageAndText04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150PeekImageAndText04 & Double = js.native
    
    /* 48 */ val tileSquare150x150Text01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Text01 & Double = js.native
    
    /* 49 */ val tileSquare150x150Text02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Text02 & Double = js.native
    
    /* 50 */ val tileSquare150x150Text03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Text03 & Double = js.native
    
    /* 51 */ val tileSquare150x150Text04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare150x150Text04 & Double = js.native
    
    /* 92 */ val tileSquare310x310BlockAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310BlockAndText01 & Double = js.native
    
    /* 93 */ val tileSquare310x310BlockAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310BlockAndText02 & Double = js.native
    
    /* 94 */ val tileSquare310x310Image: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Image & Double = js.native
    
    /* 95 */ val tileSquare310x310ImageAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageAndText01 & Double = js.native
    
    /* 96 */ val tileSquare310x310ImageAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageAndText02 & Double = js.native
    
    /* 97 */ val tileSquare310x310ImageAndTextOverlay01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageAndTextOverlay01 & Double = js.native
    
    /* 98 */ val tileSquare310x310ImageAndTextOverlay02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageAndTextOverlay02 & Double = js.native
    
    /* 99 */ val tileSquare310x310ImageAndTextOverlay03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageAndTextOverlay03 & Double = js.native
    
    /* 102 */ val tileSquare310x310ImageCollection: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageCollection & Double = js.native
    
    /* 100 */ val tileSquare310x310ImageCollectionAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageCollectionAndText01 & Double = js.native
    
    /* 101 */ val tileSquare310x310ImageCollectionAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310ImageCollectionAndText02 & Double = js.native
    
    /* 118 */ val tileSquare310x310SmallImageAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImageAndText01 & Double = js.native
    
    /* 103 */ val tileSquare310x310SmallImagesAndTextList01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImagesAndTextList01 & Double = js.native
    
    /* 104 */ val tileSquare310x310SmallImagesAndTextList02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImagesAndTextList02 & Double = js.native
    
    /* 105 */ val tileSquare310x310SmallImagesAndTextList03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImagesAndTextList03 & Double = js.native
    
    /* 106 */ val tileSquare310x310SmallImagesAndTextList04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImagesAndTextList04 & Double = js.native
    
    /* 119 */ val tileSquare310x310SmallImagesAndTextList05: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310SmallImagesAndTextList05 & Double = js.native
    
    /* 107 */ val tileSquare310x310Text01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text01 & Double = js.native
    
    /* 108 */ val tileSquare310x310Text02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text02 & Double = js.native
    
    /* 109 */ val tileSquare310x310Text03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text03 & Double = js.native
    
    /* 110 */ val tileSquare310x310Text04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text04 & Double = js.native
    
    /* 111 */ val tileSquare310x310Text05: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text05 & Double = js.native
    
    /* 112 */ val tileSquare310x310Text06: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text06 & Double = js.native
    
    /* 113 */ val tileSquare310x310Text07: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text07 & Double = js.native
    
    /* 114 */ val tileSquare310x310Text08: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text08 & Double = js.native
    
    /* 120 */ val tileSquare310x310Text09: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310Text09 & Double = js.native
    
    /* 115 */ val tileSquare310x310TextList01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310TextList01 & Double = js.native
    
    /* 116 */ val tileSquare310x310TextList02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310TextList02 & Double = js.native
    
    /* 117 */ val tileSquare310x310TextList03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare310x310TextList03 & Double = js.native
    
    /* 121 */ val tileSquare71x71IconWithBadge: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare71x71IconWithBadge & Double = js.native
    
    /* 124 */ val tileSquare71x71Image: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquare71x71Image & Double = js.native
    
    /* 1 */ val tileSquareBlock: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareBlock & Double = js.native
    
    /* 0 */ val tileSquareImage: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareImage & Double = js.native
    
    /* 6 */ val tileSquarePeekImageAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText01 & Double = js.native
    
    /* 7 */ val tileSquarePeekImageAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText02 & Double = js.native
    
    /* 8 */ val tileSquarePeekImageAndText03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText03 & Double = js.native
    
    /* 9 */ val tileSquarePeekImageAndText04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText04 & Double = js.native
    
    /* 2 */ val tileSquareText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareText01 & Double = js.native
    
    /* 3 */ val tileSquareText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareText02 & Double = js.native
    
    /* 4 */ val tileSquareText03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareText03 & Double = js.native
    
    /* 5 */ val tileSquareText04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileSquareText04 & Double = js.native
    
    /* 125 */ val tileTall150x310Image: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileTall150x310Image & Double = js.native
    
    /* 60 */ val tileWide310x150BlockAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150BlockAndText01 & Double = js.native
    
    /* 61 */ val tileWide310x150BlockAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150BlockAndText02 & Double = js.native
    
    /* 123 */ val tileWide310x150IconWithBadgeAndText: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150IconWithBadgeAndText & Double = js.native
    
    /* 56 */ val tileWide310x150Image: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Image & Double = js.native
    
    /* 58 */ val tileWide310x150ImageAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150ImageAndText01 & Double = js.native
    
    /* 59 */ val tileWide310x150ImageAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150ImageAndText02 & Double = js.native
    
    /* 57 */ val tileWide310x150ImageCollection: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150ImageCollection & Double = js.native
    
    /* 70 */ val tileWide310x150PeekImage01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage01 & Double = js.native
    
    /* 71 */ val tileWide310x150PeekImage02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage02 & Double = js.native
    
    /* 72 */ val tileWide310x150PeekImage03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage03 & Double = js.native
    
    /* 73 */ val tileWide310x150PeekImage04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage04 & Double = js.native
    
    /* 74 */ val tileWide310x150PeekImage05: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage05 & Double = js.native
    
    /* 75 */ val tileWide310x150PeekImage06: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImage06 & Double = js.native
    
    /* 68 */ val tileWide310x150PeekImageAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageAndText01 & Double = js.native
    
    /* 69 */ val tileWide310x150PeekImageAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageAndText02 & Double = js.native
    
    /* 62 */ val tileWide310x150PeekImageCollection01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection01 & Double = js.native
    
    /* 63 */ val tileWide310x150PeekImageCollection02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection02 & Double = js.native
    
    /* 64 */ val tileWide310x150PeekImageCollection03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection03 & Double = js.native
    
    /* 65 */ val tileWide310x150PeekImageCollection04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection04 & Double = js.native
    
    /* 66 */ val tileWide310x150PeekImageCollection05: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection05 & Double = js.native
    
    /* 67 */ val tileWide310x150PeekImageCollection06: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150PeekImageCollection06 & Double = js.native
    
    /* 76 */ val tileWide310x150SmallImageAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150SmallImageAndText01 & Double = js.native
    
    /* 77 */ val tileWide310x150SmallImageAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150SmallImageAndText02 & Double = js.native
    
    /* 78 */ val tileWide310x150SmallImageAndText03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150SmallImageAndText03 & Double = js.native
    
    /* 79 */ val tileWide310x150SmallImageAndText04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150SmallImageAndText04 & Double = js.native
    
    /* 80 */ val tileWide310x150SmallImageAndText05: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150SmallImageAndText05 & Double = js.native
    
    /* 81 */ val tileWide310x150Text01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text01 & Double = js.native
    
    /* 82 */ val tileWide310x150Text02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text02 & Double = js.native
    
    /* 83 */ val tileWide310x150Text03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text03 & Double = js.native
    
    /* 84 */ val tileWide310x150Text04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text04 & Double = js.native
    
    /* 85 */ val tileWide310x150Text05: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text05 & Double = js.native
    
    /* 86 */ val tileWide310x150Text06: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text06 & Double = js.native
    
    /* 87 */ val tileWide310x150Text07: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text07 & Double = js.native
    
    /* 88 */ val tileWide310x150Text08: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text08 & Double = js.native
    
    /* 89 */ val tileWide310x150Text09: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text09 & Double = js.native
    
    /* 90 */ val tileWide310x150Text10: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text10 & Double = js.native
    
    /* 91 */ val tileWide310x150Text11: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWide310x150Text11 & Double = js.native
    
    /* 14 */ val tileWideBlockAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideBlockAndText01 & Double = js.native
    
    /* 15 */ val tileWideBlockAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideBlockAndText02 & Double = js.native
    
    /* 10 */ val tileWideImage: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideImage & Double = js.native
    
    /* 12 */ val tileWideImageAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideImageAndText01 & Double = js.native
    
    /* 13 */ val tileWideImageAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideImageAndText02 & Double = js.native
    
    /* 11 */ val tileWideImageCollection: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideImageCollection & Double = js.native
    
    /* 24 */ val tileWidePeekImage01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage01 & Double = js.native
    
    /* 25 */ val tileWidePeekImage02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage02 & Double = js.native
    
    /* 26 */ val tileWidePeekImage03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage03 & Double = js.native
    
    /* 27 */ val tileWidePeekImage04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage04 & Double = js.native
    
    /* 28 */ val tileWidePeekImage05: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage05 & Double = js.native
    
    /* 29 */ val tileWidePeekImage06: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage06 & Double = js.native
    
    /* 22 */ val tileWidePeekImageAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageAndText01 & Double = js.native
    
    /* 23 */ val tileWidePeekImageAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageAndText02 & Double = js.native
    
    /* 16 */ val tileWidePeekImageCollection01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection01 & Double = js.native
    
    /* 17 */ val tileWidePeekImageCollection02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection02 & Double = js.native
    
    /* 18 */ val tileWidePeekImageCollection03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection03 & Double = js.native
    
    /* 19 */ val tileWidePeekImageCollection04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection04 & Double = js.native
    
    /* 20 */ val tileWidePeekImageCollection05: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection05 & Double = js.native
    
    /* 21 */ val tileWidePeekImageCollection06: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection06 & Double = js.native
    
    /* 30 */ val tileWideSmallImageAndText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText01 & Double = js.native
    
    /* 31 */ val tileWideSmallImageAndText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText02 & Double = js.native
    
    /* 32 */ val tileWideSmallImageAndText03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText03 & Double = js.native
    
    /* 33 */ val tileWideSmallImageAndText04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText04 & Double = js.native
    
    /* 34 */ val tileWideSmallImageAndText05: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText05 & Double = js.native
    
    /* 35 */ val tileWideText01: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText01 & Double = js.native
    
    /* 36 */ val tileWideText02: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText02 & Double = js.native
    
    /* 37 */ val tileWideText03: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText03 & Double = js.native
    
    /* 38 */ val tileWideText04: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText04 & Double = js.native
    
    /* 39 */ val tileWideText05: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText05 & Double = js.native
    
    /* 40 */ val tileWideText06: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText06 & Double = js.native
    
    /* 41 */ val tileWideText07: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText07 & Double = js.native
    
    /* 42 */ val tileWideText08: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText08 & Double = js.native
    
    /* 43 */ val tileWideText09: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText09 & Double = js.native
    
    /* 44 */ val tileWideText10: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText10 & Double = js.native
    
    /* 45 */ val tileWideText11: typings.winrtUwp.Windows.UI.Notifications.TileTemplateType.tileWideText11 & Double = js.native
  }
  
  /** Creates TileUpdater objects used to change and update Start menu tiles. This class also provides access to the XML content of the system-provided tile templates so that you can customize that content for use in updating your tiles. */
  @JSGlobal("Windows.UI.Notifications.TileUpdateManager")
  @js.native
  abstract class TileUpdateManager ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.TileUpdateManager
  object TileUpdateManager {
    
    @JSGlobal("Windows.UI.Notifications.TileUpdateManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and initializes a new instance of the TileUpdater , which lets you change the appearance of the calling app's tile.
      * @return The object you will use to send changes to the app's tile.
      */
    /* static member */
    inline def createTileUpdaterForApplication(): typings.winrtUwp.Windows.UI.Notifications.TileUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createTileUpdaterForApplication")().asInstanceOf[typings.winrtUwp.Windows.UI.Notifications.TileUpdater]
    /**
      * Creates and initializes a new instance of the TileUpdater for a tile that belongs to another app in the same package as the calling app. The TileUpdater lets a developer change the appearance of that tile.
      * @param applicationId The Package Relative Application ID (PRAID) of the tile.
      * @return The object you will use to send changes to the tile identified by applicationId.
      */
    /* static member */
    inline def createTileUpdaterForApplication(applicationId: String): typings.winrtUwp.Windows.UI.Notifications.TileUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createTileUpdaterForApplication")(applicationId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.UI.Notifications.TileUpdater]
    
    /**
      * Creates and initializes a new instance of the TileUpdater , which enables you to change the appearance of a secondary tile . The tile can belong to the calling app or any other app in the same package.
      * @param tileId A unique ID for the tile.
      * @return The object you will use to send updates to the tile identified by tileID.
      */
    /* static member */
    inline def createTileUpdaterForSecondaryTile(tileId: String): typings.winrtUwp.Windows.UI.Notifications.TileUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createTileUpdaterForSecondaryTile")(tileId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.UI.Notifications.TileUpdater]
    
    /**
      * Gets the XML content of one of the predefined tile templates so that you can customize it for a tile update.
      * @param type The name of the template.
      * @return The object that contains the XML.
      */
    /* static member */
    inline def getTemplateContent(`type`: TileTemplateType): XmlDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateContent")(`type`.asInstanceOf[js.Any]).asInstanceOf[XmlDocument]
  }
  
  /** Changes the content of the specific tile that the updater is bound to. */
  @JSGlobal("Windows.UI.Notifications.TileUpdater")
  @js.native
  abstract class TileUpdater ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.TileUpdater
  
  /** Exposes a method that retrieves the arguments associated with a toast action initiated by the user. This lets the app tell which action was taken when multiple actions were exposed. */
  @JSGlobal("Windows.UI.Notifications.ToastActivatedEventArgs")
  @js.native
  abstract class ToastActivatedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ToastActivatedEventArgs {
    
    /** Gets the arguments associated with a toast action initiated by the user. This arguments string was included in the toast's XML payload. */
    /* CompleteClass */
    var arguments: String = js.native
  }
  
  /** Specifies the reason that a toast notification is no longer being shown. Used with ToastDismissedEventArgs.Reason . */
  @JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
  @js.native
  object ToastDismissalReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Notifications.ToastDismissalReason & Double] = js.native
    
    /* 1 */ val applicationHidden: typings.winrtUwp.Windows.UI.Notifications.ToastDismissalReason.applicationHidden & Double = js.native
    
    /* 2 */ val timedOut: typings.winrtUwp.Windows.UI.Notifications.ToastDismissalReason.timedOut & Double = js.native
    
    /* 0 */ val userCanceled: typings.winrtUwp.Windows.UI.Notifications.ToastDismissalReason.userCanceled & Double = js.native
  }
  
  /** Provides the reason that a toast notification is no longer displayed on-screen. */
  @JSGlobal("Windows.UI.Notifications.ToastDismissedEventArgs")
  @js.native
  abstract class ToastDismissedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ToastDismissedEventArgs {
    
    /** Gets the reason that a toast notification is no longer displayed on-screen. */
    /* CompleteClass */
    var reason: ToastDismissalReason = js.native
  }
  
  /** Provides the error code that was generated in the process of raising a toast notification. */
  @JSGlobal("Windows.UI.Notifications.ToastFailedEventArgs")
  @js.native
  abstract class ToastFailedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ToastFailedEventArgs {
    
    /** Gets the error code that was generated in the process of raising a toast notification. */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
  }
  
  /** Specifies the kind of change that has happened to a notification in toast history. Used with ToastNotificationHistoryChangedTriggerDetail.ChangeType . */
  @JSGlobal("Windows.UI.Notifications.ToastHistoryChangedType")
  @js.native
  object ToastHistoryChangedType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType & Double] = js.native
    
    /* 3 */ val added: typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.added & Double = js.native
    
    /* 0 */ val cleared: typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.cleared & Double = js.native
    
    /* 2 */ val expired: typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.expired & Double = js.native
    
    /* 1 */ val removed: typings.winrtUwp.Windows.UI.Notifications.ToastHistoryChangedType.removed & Double = js.native
  }
  
  /** Defines the content, associated metadata and events, and expiration time of a toast notification. */
  @JSGlobal("Windows.UI.Notifications.ToastNotification")
  @js.native
  open class ToastNotification protected ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ToastNotification {
    /**
      * Creates and initializes a new instance of the ToastNotification .
      * @param content The XML content that defines the toast notification.
      */
    def this(content: XmlDocument) = this()
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastNotificationActionTriggerDetail")
  @js.native
  abstract class ToastNotificationActionTriggerDetail ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ToastNotificationActionTriggerDetail {
    
    /* CompleteClass */
    var argument: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var userInput: Any = js.native
  }
  
  /** Manages the toast notifications for an app including the ability the clear all toast history and removing individual toasts. */
  @JSGlobal("Windows.UI.Notifications.ToastNotificationHistory")
  @js.native
  abstract class ToastNotificationHistory ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ToastNotificationHistory
  
  /** Represents the details of a toast history changed trigger. */
  @JSGlobal("Windows.UI.Notifications.ToastNotificationHistoryChangedTriggerDetail")
  @js.native
  abstract class ToastNotificationHistoryChangedTriggerDetail ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ToastNotificationHistoryChangedTriggerDetail {
    
    /** Gets a value representing the kind of change that caused the toast history changed trigger. */
    /* CompleteClass */
    var changeType: ToastHistoryChangedType = js.native
  }
  
  /** Creates ToastNotifier objects that you use to raise toast notifications. This class also provides access to the XML content of the system-provided toast templates so that you can customize that content for use in your notifications. */
  @JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
  @js.native
  abstract class ToastNotificationManager ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ToastNotificationManager
  object ToastNotificationManager {
    
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and initializes a new instance of the ToastNotification , bound to the calling application, that lets you raise a toast notification to that app.
      * @return The object you will use to send the toast notification to the app.
      */
    /* static member */
    inline def createToastNotifier(): typings.winrtUwp.Windows.UI.Notifications.ToastNotifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createToastNotifier")().asInstanceOf[typings.winrtUwp.Windows.UI.Notifications.ToastNotifier]
    /**
      * Creates and initializes a new instance of the ToastNotification , bound to a specified app, usually another app in the same package.
      * @param applicationId The unique ID of the app.
      * @return The object you will use to send the toast notification to the tile.
      */
    /* static member */
    inline def createToastNotifier(applicationId: String): typings.winrtUwp.Windows.UI.Notifications.ToastNotifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createToastNotifier")(applicationId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.UI.Notifications.ToastNotifier]
    
    /**
      * Gets the XML content of one of the predefined toast templates so that you can customize it for use in your notification.
      * @param type One of the system-provided toast templates.
      * @return The object that contains the template XML.
      */
    /* static member */
    inline def getTemplateContent(`type`: ToastTemplateType): XmlDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateContent")(`type`.asInstanceOf[js.Any]).asInstanceOf[XmlDocument]
    
    /** Gets the ToastNotificationHistory object. */
    /* static member */
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager.history")
    @js.native
    def history: typings.winrtUwp.Windows.UI.Notifications.ToastNotificationHistory = js.native
    inline def history_=(x: typings.winrtUwp.Windows.UI.Notifications.ToastNotificationHistory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
  }
  
  /** Raises a toast notification to the specific app to which the ToastNotifier is bound. This class also lets you schedule and remove toast notifications. */
  @JSGlobal("Windows.UI.Notifications.ToastNotifier")
  @js.native
  abstract class ToastNotifier ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Notifications.ToastNotifier {
    
    /**
      * Adds a ScheduledToastNotification for later display by Windows.
      * @param scheduledToast The scheduled toast notification, which includes its content and timing instructions.
      */
    /* CompleteClass */
    override def addToSchedule(scheduledToast: typings.winrtUwp.Windows.UI.Notifications.ScheduledToastNotification): Unit = js.native
    
    /**
      * Gets the collection of ScheduledToastNotification objects that this app has scheduled for display.
      * @return The collection of scheduled toast notifications that the app bound to this notifier has scheduled for timed display.
      */
    /* CompleteClass */
    override def getScheduledToastNotifications(): IVectorView[typings.winrtUwp.Windows.UI.Notifications.ScheduledToastNotification] = js.native
    
    /**
      * Removes the specified toast notification from the screen.
      * @param notification The object that specifies the toast to hide.
      */
    /* CompleteClass */
    override def hide(notification: typings.winrtUwp.Windows.UI.Notifications.ToastNotification): Unit = js.native
    
    /**
      * Cancels the scheduled display of a specified ScheduledToastNotification .
      * @param scheduledToast The notification to remove from the schedule.
      */
    /* CompleteClass */
    override def removeFromSchedule(scheduledToast: typings.winrtUwp.Windows.UI.Notifications.ScheduledToastNotification): Unit = js.native
    
    /** Gets a value that tells you whether there is an app, user, or system block that prevents the display of a toast notification. */
    /* CompleteClass */
    var setting: NotificationSetting = js.native
    
    /**
      * Displays the specified toast notification.
      * @param notification The object that contains the content of the toast notification to display.
      */
    /* CompleteClass */
    override def show(notification: typings.winrtUwp.Windows.UI.Notifications.ToastNotification): Unit = js.native
  }
  
  /** Specifies the template to use in a toast notification. */
  @JSGlobal("Windows.UI.Notifications.ToastTemplateType")
  @js.native
  object ToastTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Notifications.ToastTemplateType & Double] = js.native
    
    /* 0 */ val toastImageAndText01: typings.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText01 & Double = js.native
    
    /* 1 */ val toastImageAndText02: typings.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText02 & Double = js.native
    
    /* 2 */ val toastImageAndText03: typings.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText03 & Double = js.native
    
    /* 3 */ val toastImageAndText04: typings.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastImageAndText04 & Double = js.native
    
    /* 4 */ val toastText01: typings.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastText01 & Double = js.native
    
    /* 5 */ val toastText02: typings.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastText02 & Double = js.native
    
    /* 6 */ val toastText03: typings.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastText03 & Double = js.native
    
    /* 7 */ val toastText04: typings.winrtUwp.Windows.UI.Notifications.ToastTemplateType.toastText04 & Double = js.native
  }
}
