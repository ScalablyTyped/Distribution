package typings.winrt.global.Windows.UI

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.UI.Notifications.BadgeTemplateType
import typings.winrt.Windows.UI.Notifications.TileTemplateType
import typings.winrt.Windows.UI.Notifications.ToastTemplateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notifications {
  
  @JSGlobal("Windows.UI.Notifications.BadgeNotification")
  @js.native
  class BadgeNotification protected ()
    extends typings.winrt.Windows.UI.Notifications.BadgeNotification {
    def this(content: XmlDocument) = this()
  }
  
  @JSGlobal("Windows.UI.Notifications.BadgeTemplateType")
  @js.native
  object BadgeTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.BadgeTemplateType with Double] = js.native
    
    /* 0 */ val badgeGlyph: typings.winrt.Windows.UI.Notifications.BadgeTemplateType.badgeGlyph with Double = js.native
    
    /* 1 */ val badgeNumber: typings.winrt.Windows.UI.Notifications.BadgeTemplateType.badgeNumber with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
  @js.native
  class BadgeUpdateManager ()
    extends typings.winrt.Windows.UI.Notifications.BadgeUpdateManager
  /* static members */
  object BadgeUpdateManager {
    
    @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager.createBadgeUpdaterForApplication")
    @js.native
    def createBadgeUpdaterForApplication(): typings.winrt.Windows.UI.Notifications.BadgeUpdater = js.native
    @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager.createBadgeUpdaterForApplication")
    @js.native
    def createBadgeUpdaterForApplication(applicationId: String): typings.winrt.Windows.UI.Notifications.BadgeUpdater = js.native
    
    @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager.createBadgeUpdaterForSecondaryTile")
    @js.native
    def createBadgeUpdaterForSecondaryTile(tileId: String): typings.winrt.Windows.UI.Notifications.BadgeUpdater = js.native
    
    @JSGlobal("Windows.UI.Notifications.BadgeUpdateManager.getTemplateContent")
    @js.native
    def getTemplateContent(`type`: BadgeTemplateType): XmlDocument = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.BadgeUpdater")
  @js.native
  class BadgeUpdater ()
    extends typings.winrt.Windows.UI.Notifications.BadgeUpdater
  
  @JSGlobal("Windows.UI.Notifications.NotificationSetting")
  @js.native
  object NotificationSetting extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.NotificationSetting with Double] = js.native
    
    /* 3 */ val disabledByGroupPolicy: typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledByGroupPolicy with Double = js.native
    
    /* 4 */ val disabledByManifest: typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledByManifest with Double = js.native
    
    /* 1 */ val disabledForApplication: typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledForApplication with Double = js.native
    
    /* 2 */ val disabledForUser: typings.winrt.Windows.UI.Notifications.NotificationSetting.disabledForUser with Double = js.native
    
    /* 0 */ val enabled: typings.winrt.Windows.UI.Notifications.NotificationSetting.enabled with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.PeriodicUpdateRecurrence")
  @js.native
  object PeriodicUpdateRecurrence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence with Double] = js.native
    
    /* 4 */ val daily: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.daily with Double = js.native
    
    /* 0 */ val halfHour: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.halfHour with Double = js.native
    
    /* 1 */ val hour: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.hour with Double = js.native
    
    /* 2 */ val sixHours: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.sixHours with Double = js.native
    
    /* 3 */ val twelveHours: typings.winrt.Windows.UI.Notifications.PeriodicUpdateRecurrence.twelveHours with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.ScheduledTileNotification")
  @js.native
  class ScheduledTileNotification protected ()
    extends typings.winrt.Windows.UI.Notifications.ScheduledTileNotification {
    def this(content: XmlDocument, deliveryTime: Date) = this()
  }
  
  @JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
  @js.native
  class ScheduledToastNotification protected ()
    extends typings.winrt.Windows.UI.Notifications.ScheduledToastNotification {
    def this(content: XmlDocument, deliveryTime: Date) = this()
    def this(content: XmlDocument, deliveryTime: Date, snoozeInterval: Double, maximumSnoozeCount: Double) = this()
  }
  
  @JSGlobal("Windows.UI.Notifications.TileNotification")
  @js.native
  class TileNotification protected ()
    extends typings.winrt.Windows.UI.Notifications.TileNotification {
    def this(content: XmlDocument) = this()
  }
  
  @JSGlobal("Windows.UI.Notifications.TileTemplateType")
  @js.native
  object TileTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.TileTemplateType with Double] = js.native
    
    /* 1 */ val tileSquareBlock: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareBlock with Double = js.native
    
    /* 0 */ val tileSquareImage: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareImage with Double = js.native
    
    /* 6 */ val tileSquarePeekImageAndText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText01 with Double = js.native
    
    /* 7 */ val tileSquarePeekImageAndText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText02 with Double = js.native
    
    /* 8 */ val tileSquarePeekImageAndText03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText03 with Double = js.native
    
    /* 9 */ val tileSquarePeekImageAndText04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquarePeekImageAndText04 with Double = js.native
    
    /* 2 */ val tileSquareText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareText01 with Double = js.native
    
    /* 3 */ val tileSquareText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareText02 with Double = js.native
    
    /* 4 */ val tileSquareText03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareText03 with Double = js.native
    
    /* 5 */ val tileSquareText04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileSquareText04 with Double = js.native
    
    /* 14 */ val tileWideBlockAndText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideBlockAndText01 with Double = js.native
    
    /* 15 */ val tileWideBlockAndText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideBlockAndText02 with Double = js.native
    
    /* 10 */ val tileWideImage: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideImage with Double = js.native
    
    /* 12 */ val tileWideImageAndText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideImageAndText01 with Double = js.native
    
    /* 13 */ val tileWideImageAndText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideImageAndText02 with Double = js.native
    
    /* 11 */ val tileWideImageCollection: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideImageCollection with Double = js.native
    
    /* 24 */ val tileWidePeekImage01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage01 with Double = js.native
    
    /* 25 */ val tileWidePeekImage02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage02 with Double = js.native
    
    /* 26 */ val tileWidePeekImage03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage03 with Double = js.native
    
    /* 27 */ val tileWidePeekImage04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage04 with Double = js.native
    
    /* 28 */ val tileWidePeekImage05: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage05 with Double = js.native
    
    /* 29 */ val tileWidePeekImage06: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImage06 with Double = js.native
    
    /* 22 */ val tileWidePeekImageAndText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageAndText01 with Double = js.native
    
    /* 23 */ val tileWidePeekImageAndText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageAndText02 with Double = js.native
    
    /* 16 */ val tileWidePeekImageCollection01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection01 with Double = js.native
    
    /* 17 */ val tileWidePeekImageCollection02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection02 with Double = js.native
    
    /* 18 */ val tileWidePeekImageCollection03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection03 with Double = js.native
    
    /* 19 */ val tileWidePeekImageCollection04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection04 with Double = js.native
    
    /* 20 */ val tileWidePeekImageCollection05: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection05 with Double = js.native
    
    /* 21 */ val tileWidePeekImageCollection06: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWidePeekImageCollection06 with Double = js.native
    
    /* 30 */ val tileWideSmallImageAndText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText01 with Double = js.native
    
    /* 31 */ val tileWideSmallImageAndText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText02 with Double = js.native
    
    /* 32 */ val tileWideSmallImageAndText03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText03 with Double = js.native
    
    /* 33 */ val tileWideSmallImageAndText04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText04 with Double = js.native
    
    /* 34 */ val tileWideSmallImageAndText05: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideSmallImageAndText05 with Double = js.native
    
    /* 35 */ val tileWideText01: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText01 with Double = js.native
    
    /* 36 */ val tileWideText02: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText02 with Double = js.native
    
    /* 37 */ val tileWideText03: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText03 with Double = js.native
    
    /* 38 */ val tileWideText04: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText04 with Double = js.native
    
    /* 39 */ val tileWideText05: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText05 with Double = js.native
    
    /* 40 */ val tileWideText06: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText06 with Double = js.native
    
    /* 41 */ val tileWideText07: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText07 with Double = js.native
    
    /* 42 */ val tileWideText08: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText08 with Double = js.native
    
    /* 43 */ val tileWideText09: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText09 with Double = js.native
    
    /* 44 */ val tileWideText10: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText10 with Double = js.native
    
    /* 45 */ val tileWideText11: typings.winrt.Windows.UI.Notifications.TileTemplateType.tileWideText11 with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.TileUpdateManager")
  @js.native
  class TileUpdateManager ()
    extends typings.winrt.Windows.UI.Notifications.TileUpdateManager
  /* static members */
  object TileUpdateManager {
    
    @JSGlobal("Windows.UI.Notifications.TileUpdateManager.createTileUpdaterForApplication")
    @js.native
    def createTileUpdaterForApplication(): typings.winrt.Windows.UI.Notifications.TileUpdater = js.native
    @JSGlobal("Windows.UI.Notifications.TileUpdateManager.createTileUpdaterForApplication")
    @js.native
    def createTileUpdaterForApplication(applicationId: String): typings.winrt.Windows.UI.Notifications.TileUpdater = js.native
    
    @JSGlobal("Windows.UI.Notifications.TileUpdateManager.createTileUpdaterForSecondaryTile")
    @js.native
    def createTileUpdaterForSecondaryTile(tileId: String): typings.winrt.Windows.UI.Notifications.TileUpdater = js.native
    
    @JSGlobal("Windows.UI.Notifications.TileUpdateManager.getTemplateContent")
    @js.native
    def getTemplateContent(`type`: TileTemplateType): XmlDocument = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.TileUpdater")
  @js.native
  class TileUpdater ()
    extends typings.winrt.Windows.UI.Notifications.TileUpdater
  
  @JSGlobal("Windows.UI.Notifications.ToastDismissalReason")
  @js.native
  object ToastDismissalReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.ToastDismissalReason with Double] = js.native
    
    /* 1 */ val applicationHidden: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.applicationHidden with Double = js.native
    
    /* 2 */ val timedOut: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.timedOut with Double = js.native
    
    /* 0 */ val userCanceled: typings.winrt.Windows.UI.Notifications.ToastDismissalReason.userCanceled with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastDismissedEventArgs")
  @js.native
  class ToastDismissedEventArgs ()
    extends typings.winrt.Windows.UI.Notifications.ToastDismissedEventArgs
  
  @JSGlobal("Windows.UI.Notifications.ToastFailedEventArgs")
  @js.native
  class ToastFailedEventArgs ()
    extends typings.winrt.Windows.UI.Notifications.ToastFailedEventArgs
  
  @JSGlobal("Windows.UI.Notifications.ToastNotification")
  @js.native
  class ToastNotification protected ()
    extends typings.winrt.Windows.UI.Notifications.ToastNotification {
    def this(content: XmlDocument) = this()
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
  @js.native
  class ToastNotificationManager ()
    extends typings.winrt.Windows.UI.Notifications.ToastNotificationManager
  /* static members */
  object ToastNotificationManager {
    
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager.createToastNotifier")
    @js.native
    def createToastNotifier(): typings.winrt.Windows.UI.Notifications.ToastNotifier = js.native
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager.createToastNotifier")
    @js.native
    def createToastNotifier(applicationId: String): typings.winrt.Windows.UI.Notifications.ToastNotifier = js.native
    
    @JSGlobal("Windows.UI.Notifications.ToastNotificationManager.getTemplateContent")
    @js.native
    def getTemplateContent(`type`: ToastTemplateType): XmlDocument = js.native
  }
  
  @JSGlobal("Windows.UI.Notifications.ToastNotifier")
  @js.native
  class ToastNotifier ()
    extends typings.winrt.Windows.UI.Notifications.ToastNotifier
  
  @JSGlobal("Windows.UI.Notifications.ToastTemplateType")
  @js.native
  object ToastTemplateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Notifications.ToastTemplateType with Double] = js.native
    
    /* 0 */ val toastImageAndText01: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText01 with Double = js.native
    
    /* 1 */ val toastImageAndText02: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText02 with Double = js.native
    
    /* 2 */ val toastImageAndText03: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText03 with Double = js.native
    
    /* 3 */ val toastImageAndText04: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastImageAndText04 with Double = js.native
    
    /* 4 */ val toastText01: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText01 with Double = js.native
    
    /* 5 */ val toastText02: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText02 with Double = js.native
    
    /* 6 */ val toastText03: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText03 with Double = js.native
    
    /* 7 */ val toastText04: typings.winrt.Windows.UI.Notifications.ToastTemplateType.toastText04 with Double = js.native
  }
}
