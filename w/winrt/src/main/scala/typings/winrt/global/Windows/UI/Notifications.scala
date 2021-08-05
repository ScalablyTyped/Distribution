package typings.winrt.global.Windows.UI

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.UI.Notifications.BadgeTemplateType
import typings.winrt.Windows.UI.Notifications.NotificationSetting
import typings.winrt.Windows.UI.Notifications.TileTemplateType
import typings.winrt.Windows.UI.Notifications.ToastDismissalReason
import typings.winrt.Windows.UI.Notifications.ToastTemplateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notifications {
  
  @JSGlobal("Windows.UI.Notifications.BadgeNotification")
  @js.native
  class BadgeNotification protected ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.BadgeNotification {
    def this(content: XmlDocument) = this()
    
    /* CompleteClass */
    var content: XmlDocument = js.native
    
    /* CompleteClass */
    var expirationTime: Date = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.BadgeTemplateType")
  @js.native
  object BadgeTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.BadgeTemplateType & Double] = js.native
    
    /* 0 */ val badgeGlyph: typings.winrt.Windows.UI.Notifications.BadgeTemplateType.badgeGlyph & Double = js.native
    
    /* 1 */ val badgeNumber: typings.winrt.Windows.UI.Notifications.BadgeTemplateType.badgeNumber & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
  @js.native
  class BadgeUpdateManager ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.BadgeUpdateManager
  /* static members */
  object BadgeUpdateManager {
    
    @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createBadgeUpdaterForApplication(): typings.winrt.Windows.UI.Notifications.BadgeUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createBadgeUpdaterForApplication")().asInstanceOf[typings.winrt.Windows.UI.Notifications.BadgeUpdater]
    inline def createBadgeUpdaterForApplication(applicationId: String): typings.winrt.Windows.UI.Notifications.BadgeUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createBadgeUpdaterForApplication")(applicationId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.UI.Notifications.BadgeUpdater]
    
    inline def createBadgeUpdaterForSecondaryTile(tileId: String): typings.winrt.Windows.UI.Notifications.BadgeUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createBadgeUpdaterForSecondaryTile")(tileId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.UI.Notifications.BadgeUpdater]
    
    inline def getTemplateContent(`type`: BadgeTemplateType): XmlDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateContent")(`type`.asInstanceOf[js.Any]).asInstanceOf[XmlDocument]
  }
  
  @JSGlobal("Windows.UI.Notifications.BadgeUpdater")
  @js.native
  class BadgeUpdater ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.BadgeUpdater
  
  @JSGlobal("Windows.UI.Notifications.NotificationSetting")
  @js.native
  object NotificationSetting extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.NotificationSetting & Double] = js.native
    
    /* 3 */ val disabledByGroupPolicy: typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledByGroupPolicy & Double = js.native
    
    /* 4 */ val disabledByManifest: typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledByManifest & Double = js.native
    
    /* 1 */ val disabledForApplication: typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledForApplication & Double = js.native
    
    /* 2 */ val disabledForUser: typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledForUser & Double = js.native
    
    /* 0 */ val enabled: typings.winrt.Windows.UI.Notifications.NotificationSetting.enabled & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.PeriodicUpdateRecurrence")
  @js.native
  object PeriodicUpdateRecurrence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence & Double] = js.native
    
    /* 4 */ val daily: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.daily & Double = js.native
    
    /* 0 */ val halfHour: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.halfHour & Double = js.native
    
    /* 1 */ val hour: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.hour & Double = js.native
    
    /* 2 */ val sixHours: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.sixHours & Double = js.native
    
    /* 3 */ val twelveHours: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.twelveHours & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.ScheduledTileNotification")
  @js.native
  class ScheduledTileNotification protected ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.ScheduledTileNotification {
    def this(content: XmlDocument, deliveryTime: Date) = this()
    
    /* CompleteClass */
    var content: XmlDocument = js.native
    
    /* CompleteClass */
    var deliveryTime: Date = js.native
    
    /* CompleteClass */
    var expirationTime: Date = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var tag: String = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
  @js.native
  class ScheduledToastNotification protected ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.ScheduledToastNotification {
    def this(content: XmlDocument, deliveryTime: Date) = this()
    def this(content: XmlDocument, deliveryTime: Date, snoozeInterval: Double, maximumSnoozeCount: Double) = this()
    
    /* CompleteClass */
    var content: XmlDocument = js.native
    
    /* CompleteClass */
    var deliveryTime: Date = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var maximumSnoozeCount: Double = js.native
    
    /* CompleteClass */
    var snoozeInterval: Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.TileNotification")
  @js.native
  class TileNotification protected ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.TileNotification {
    def this(content: XmlDocument) = this()
    
    /* CompleteClass */
    var content: XmlDocument = js.native
    
    /* CompleteClass */
    var expirationTime: Date = js.native
    
    /* CompleteClass */
    var tag: String = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.TileTemplateType")
  @js.native
  object TileTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.TileTemplateType & Double] = js.native
    
    /* 1 */ val tileSquareBlock: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareBlock & Double = js.native
    
    /* 0 */ val tileSquareImage: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareImage & Double = js.native
    
    /* 6 */ val tileSquarePeekImageAndText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText01 & Double = js.native
    
    /* 7 */ val tileSquarePeekImageAndText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText02 & Double = js.native
    
    /* 8 */ val tileSquarePeekImageAndText03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText03 & Double = js.native
    
    /* 9 */ val tileSquarePeekImageAndText04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText04 & Double = js.native
    
    /* 2 */ val tileSquareText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareText01 & Double = js.native
    
    /* 3 */ val tileSquareText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareText02 & Double = js.native
    
    /* 4 */ val tileSquareText03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareText03 & Double = js.native
    
    /* 5 */ val tileSquareText04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareText04 & Double = js.native
    
    /* 14 */ val tileWideBlockAndText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideBlockAndText01 & Double = js.native
    
    /* 15 */ val tileWideBlockAndText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideBlockAndText02 & Double = js.native
    
    /* 10 */ val tileWideImage: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideImage & Double = js.native
    
    /* 12 */ val tileWideImageAndText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideImageAndText01 & Double = js.native
    
    /* 13 */ val tileWideImageAndText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideImageAndText02 & Double = js.native
    
    /* 11 */ val tileWideImageCollection: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideImageCollection & Double = js.native
    
    /* 24 */ val tileWidePeekImage01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage01 & Double = js.native
    
    /* 25 */ val tileWidePeekImage02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage02 & Double = js.native
    
    /* 26 */ val tileWidePeekImage03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage03 & Double = js.native
    
    /* 27 */ val tileWidePeekImage04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage04 & Double = js.native
    
    /* 28 */ val tileWidePeekImage05: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage05 & Double = js.native
    
    /* 29 */ val tileWidePeekImage06: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage06 & Double = js.native
    
    /* 22 */ val tileWidePeekImageAndText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageAndText01 & Double = js.native
    
    /* 23 */ val tileWidePeekImageAndText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageAndText02 & Double = js.native
    
    /* 16 */ val tileWidePeekImageCollection01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection01 & Double = js.native
    
    /* 17 */ val tileWidePeekImageCollection02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection02 & Double = js.native
    
    /* 18 */ val tileWidePeekImageCollection03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection03 & Double = js.native
    
    /* 19 */ val tileWidePeekImageCollection04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection04 & Double = js.native
    
    /* 20 */ val tileWidePeekImageCollection05: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection05 & Double = js.native
    
    /* 21 */ val tileWidePeekImageCollection06: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection06 & Double = js.native
    
    /* 30 */ val tileWideSmallImageAndText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText01 & Double = js.native
    
    /* 31 */ val tileWideSmallImageAndText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText02 & Double = js.native
    
    /* 32 */ val tileWideSmallImageAndText03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText03 & Double = js.native
    
    /* 33 */ val tileWideSmallImageAndText04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText04 & Double = js.native
    
    /* 34 */ val tileWideSmallImageAndText05: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText05 & Double = js.native
    
    /* 35 */ val tileWideText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText01 & Double = js.native
    
    /* 36 */ val tileWideText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText02 & Double = js.native
    
    /* 37 */ val tileWideText03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText03 & Double = js.native
    
    /* 38 */ val tileWideText04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText04 & Double = js.native
    
    /* 39 */ val tileWideText05: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText05 & Double = js.native
    
    /* 40 */ val tileWideText06: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText06 & Double = js.native
    
    /* 41 */ val tileWideText07: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText07 & Double = js.native
    
    /* 42 */ val tileWideText08: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText08 & Double = js.native
    
    /* 43 */ val tileWideText09: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText09 & Double = js.native
    
    /* 44 */ val tileWideText10: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText10 & Double = js.native
    
    /* 45 */ val tileWideText11: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText11 & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.TileUpdateManager")
  @js.native
  class TileUpdateManager ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.TileUpdateManager
  /* static members */
  object TileUpdateManager {
    
    @JSGlobal("Windows.UI.Notifications.TileUpdateManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createTileUpdaterForApplication(): typings.winrt.Windows.UI.Notifications.TileUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createTileUpdaterForApplication")().asInstanceOf[typings.winrt.Windows.UI.Notifications.TileUpdater]
    inline def createTileUpdaterForApplication(applicationId: String): typings.winrt.Windows.UI.Notifications.TileUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createTileUpdaterForApplication")(applicationId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.UI.Notifications.TileUpdater]
    
    inline def createTileUpdaterForSecondaryTile(tileId: String): typings.winrt.Windows.UI.Notifications.TileUpdater = ^.asInstanceOf[js.Dynamic].applyDynamic("createTileUpdaterForSecondaryTile")(tileId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.UI.Notifications.TileUpdater]
    
    inline def getTemplateContent(`type`: TileTemplateType): XmlDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateContent")(`type`.asInstanceOf[js.Any]).asInstanceOf[XmlDocument]
  }
  
  @JSGlobal("Windows.UI.Notifications.TileUpdater")
  @js.native
  class TileUpdater ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.TileUpdater
  
  @JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
  @js.native
  object ToastDismissalReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.ToastDismissalReason & Double] = js.native
    
    /* 1 */ val applicationHidden: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.applicationHidden & Double = js.native
    
    /* 2 */ val timedOut: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.timedOut & Double = js.native
    
    /* 0 */ val userCanceled: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.userCanceled & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastDismissedEventArgs")
  @js.native
  class ToastDismissedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.ToastDismissedEventArgs {
    
    /* CompleteClass */
    var reason: ToastDismissalReason = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastFailedEventArgs")
  @js.native
  class ToastFailedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.ToastFailedEventArgs {
    
    /* CompleteClass */
    var errorCode: Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastNotification")
  @js.native
  class ToastNotification protected ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.ToastNotification {
    def this(content: XmlDocument) = this()
    
    /* CompleteClass */
    var content: XmlDocument = js.native
    
    /* CompleteClass */
    var expirationTime: Date = js.native
    
    /* CompleteClass */
    var onactivated: js.Any = js.native
    
    /* CompleteClass */
    var ondismissed: js.Any = js.native
    
    /* CompleteClass */
    var onfailed: js.Any = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
  @js.native
  class ToastNotificationManager ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.ToastNotificationManager
  /* static members */
  object ToastNotificationManager {
    
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createToastNotifier(): typings.winrt.Windows.UI.Notifications.ToastNotifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createToastNotifier")().asInstanceOf[typings.winrt.Windows.UI.Notifications.ToastNotifier]
    inline def createToastNotifier(applicationId: String): typings.winrt.Windows.UI.Notifications.ToastNotifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createToastNotifier")(applicationId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.UI.Notifications.ToastNotifier]
    
    inline def getTemplateContent(`type`: ToastTemplateType): XmlDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateContent")(`type`.asInstanceOf[js.Any]).asInstanceOf[XmlDocument]
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastNotifier")
  @js.native
  class ToastNotifier ()
    extends StObject
       with typings.winrt.Windows.UI.Notifications.ToastNotifier {
    
    /* CompleteClass */
    override def addToSchedule(scheduledToast: typings.winrt.Windows.UI.Notifications.ScheduledToastNotification): Unit = js.native
    
    /* CompleteClass */
    override def getScheduledToastNotifications(): IVectorView[typings.winrt.Windows.UI.Notifications.ScheduledToastNotification] = js.native
    
    /* CompleteClass */
    override def hide(notification: typings.winrt.Windows.UI.Notifications.ToastNotification): Unit = js.native
    
    /* CompleteClass */
    override def removeFromSchedule(scheduledToast: typings.winrt.Windows.UI.Notifications.ScheduledToastNotification): Unit = js.native
    
    /* CompleteClass */
    var setting: NotificationSetting = js.native
    
    /* CompleteClass */
    override def show(notification: typings.winrt.Windows.UI.Notifications.ToastNotification): Unit = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastTemplateType")
  @js.native
  object ToastTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.ToastTemplateType & Double] = js.native
    
    /* 0 */ val toastImageAndText01: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText01 & Double = js.native
    
    /* 1 */ val toastImageAndText02: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText02 & Double = js.native
    
    /* 2 */ val toastImageAndText03: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText03 & Double = js.native
    
    /* 3 */ val toastImageAndText04: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText04 & Double = js.native
    
    /* 4 */ val toastText01: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText01 & Double = js.native
    
    /* 5 */ val toastText02: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText02 & Double = js.native
    
    /* 6 */ val toastText03: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText03 & Double = js.native
    
    /* 7 */ val toastText04: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText04 & Double = js.native
  }
}
