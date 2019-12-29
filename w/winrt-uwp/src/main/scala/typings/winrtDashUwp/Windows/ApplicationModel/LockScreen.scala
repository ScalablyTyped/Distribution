package typings.winrtDashUwp.Windows.ApplicationModel

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.alarmiconchanged
import typings.winrtDashUwp.winrtDashUwpStrings.badgeschanged
import typings.winrtDashUwp.winrtDashUwpStrings.detailtextchanged
import typings.winrtDashUwp.winrtDashUwpStrings.lockscreenimagechanged
import typings.winrtDashUwp.winrtDashUwpStrings.unlocking
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** You can create an app that acts as the lock screen, allowing greater user personalization. You can develop novel unlock gestures and animations, and also display custom information or appearances for people. */
@JSGlobal("Windows.ApplicationModel.LockScreen")
@js.native
object LockScreen extends js.Object {
  /** Allows the lock screen app to request that the device unlocks, and allows the app to register to be notified when the device begins to unlock. */
  @js.native
  abstract class LockApplicationHost () extends js.Object {
    /** Indicates the device is unlocking. */
    @JSName("onunlocking")
    var onunlocking_Original: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs] = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unlocking(`type`: unlocking, listener: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs]): Unit = js.native
    /** Indicates the device is unlocking. */
    def onunlocking(ev: LockScreenUnlockingEventArgs with WinRTEvent[LockApplicationHost]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unlocking(`type`: unlocking, listener: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs]): Unit = js.native
    /** Requests that the device unlocks. */
    def requestUnlock(): Unit = js.native
  }
  
  /** Represents a lock screen badge for an app. */
  @js.native
  abstract class LockScreenBadge () extends js.Object {
    /** Gets the name. */
    var automationName: String = js.native
    /** Gets the glyph to display. */
    var glyph: IRandomAccessStream = js.native
    /** Gets the logo to display with the badge. */
    var logo: IRandomAccessStream = js.native
    /** Gets the number to display with the badge. */
    var number: Double = js.native
    /** Launches the app corresponding to the badge. */
    def launchApp(): Unit = js.native
  }
  
  /** Provides access to the same data that the default lock screen has access to, such as wallpaper, badges, and so on. */
  @js.native
  abstract class LockScreenInfo () extends js.Object {
    /** Gets the alarm icon to display. */
    var alarmIcon: IRandomAccessStream = js.native
    /** Gets the badges to display. */
    var badges: IVectorView[LockScreenBadge] = js.native
    /** Gets the detail text to display. */
    var detailText: IVectorView[String] = js.native
    /** Gets the image to display on the lock screen. */
    var lockScreenImage: IRandomAccessStream = js.native
    /** Indicates the alarm icon has changed. */
    @JSName("onalarmiconchanged")
    var onalarmiconchanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
    /** Indicates the badges have changed. */
    @JSName("onbadgeschanged")
    var onbadgeschanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
    /** Indicates the detail text has changed. */
    @JSName("ondetailtextchanged")
    var ondetailtextchanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
    /** Indicates the lock screen image has changed. */
    @JSName("onlockscreenimagechanged")
    var onlockscreenimagechanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_alarmiconchanged(`type`: alarmiconchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_badgeschanged(`type`: badgeschanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_detailtextchanged(`type`: detailtextchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lockscreenimagechanged(`type`: lockscreenimagechanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
    /** Indicates the alarm icon has changed. */
    def onalarmiconchanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the badges have changed. */
    def onbadgeschanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the detail text has changed. */
    def ondetailtextchanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the lock screen image has changed. */
    def onlockscreenimagechanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_alarmiconchanged(`type`: alarmiconchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_badgeschanged(`type`: badgeschanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_detailtextchanged(`type`: detailtextchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lockscreenimagechanged(`type`: lockscreenimagechanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  }
  
  /** Represents an unlock deferral. */
  @js.native
  abstract class LockScreenUnlockingDeferral () extends js.Object {
    /** Notifies the system that your deferral is complete. If your deferral takes too long to complete, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
    def complete(): Unit = js.native
  }
  
  /** Represents the lock screen unlocking events. */
  @js.native
  abstract class LockScreenUnlockingEventArgs () extends js.Object {
    /** Gets the deadline by which the lock screen app must unlock the device. If your unlocking deferral takes too long, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
    var deadline: Date = js.native
    /**
      * Gets a LockScreenUnlockingDeferral , which defers the unlocking of the device.
      * @return An unlock deferral.
      */
    def getDeferral(): LockScreenUnlockingDeferral = js.native
  }
  
  /* static members */
  @js.native
  object LockApplicationHost extends js.Object {
    /**
      * Gets a LockApplicationHost object.
      * @return A LockApplicationHost object.
      */
    def getForCurrentView(): LockApplicationHost = js.native
  }
  
}

