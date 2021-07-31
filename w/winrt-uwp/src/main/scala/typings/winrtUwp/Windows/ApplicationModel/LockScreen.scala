package typings.winrtUwp.Windows.ApplicationModel

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.alarmiconchanged
import typings.winrtUwp.winrtUwpStrings.badgeschanged
import typings.winrtUwp.winrtUwpStrings.detailtextchanged
import typings.winrtUwp.winrtUwpStrings.lockscreenimagechanged
import typings.winrtUwp.winrtUwpStrings.unlocking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** You can create an app that acts as the lock screen, allowing greater user personalization. You can develop novel unlock gestures and animations, and also display custom information or appearances for people. */
object LockScreen {
  
  /** Allows the lock screen app to request that the device unlocks, and allows the app to register to be notified when the device begins to unlock. */
  @js.native
  trait LockApplicationHost extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_unlocking(`type`: unlocking, listener: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs]): Unit = js.native
    
    /** Indicates the device is unlocking. */
    def onunlocking(ev: LockScreenUnlockingEventArgs & WinRTEvent[LockApplicationHost]): Unit = js.native
    /** Indicates the device is unlocking. */
    @JSName("onunlocking")
    var onunlocking_Original: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_unlocking(`type`: unlocking, listener: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs]): Unit = js.native
    
    /** Requests that the device unlocks. */
    def requestUnlock(): Unit = js.native
  }
  
  /** Represents a lock screen badge for an app. */
  trait LockScreenBadge extends StObject {
    
    /** Gets the name. */
    var automationName: String
    
    /** Gets the glyph to display. */
    var glyph: IRandomAccessStream
    
    /** Launches the app corresponding to the badge. */
    def launchApp(): Unit
    
    /** Gets the logo to display with the badge. */
    var logo: IRandomAccessStream
    
    /** Gets the number to display with the badge. */
    var number: Double
  }
  object LockScreenBadge {
    
    @scala.inline
    def apply(
      automationName: String,
      glyph: IRandomAccessStream,
      launchApp: () => Unit,
      logo: IRandomAccessStream,
      number: Double
    ): LockScreenBadge = {
      val __obj = js.Dynamic.literal(automationName = automationName.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any], launchApp = js.Any.fromFunction0(launchApp), logo = logo.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[LockScreenBadge]
    }
    
    @scala.inline
    implicit class LockScreenBadgeMutableBuilder[Self <: LockScreenBadge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomationName(value: String): Self = StObject.set(x, "automationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyph(value: IRandomAccessStream): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchApp(value: () => Unit): Self = StObject.set(x, "launchApp", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLogo(value: IRandomAccessStream): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides access to the same data that the default lock screen has access to, such as wallpaper, badges, and so on. */
  @js.native
  trait LockScreenInfo extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_alarmiconchanged(`type`: alarmiconchanged, listener: TypedEventHandler[LockScreenInfo, js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_badgeschanged(`type`: badgeschanged, listener: TypedEventHandler[LockScreenInfo, js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_detailtextchanged(`type`: detailtextchanged, listener: TypedEventHandler[LockScreenInfo, js.Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_lockscreenimagechanged(`type`: lockscreenimagechanged, listener: TypedEventHandler[LockScreenInfo, js.Any]): Unit = js.native
    
    /** Gets the alarm icon to display. */
    var alarmIcon: IRandomAccessStream = js.native
    
    /** Gets the badges to display. */
    var badges: IVectorView[LockScreenBadge] = js.native
    
    /** Gets the detail text to display. */
    var detailText: IVectorView[String] = js.native
    
    /** Gets the image to display on the lock screen. */
    var lockScreenImage: IRandomAccessStream = js.native
    
    /** Indicates the alarm icon has changed. */
    def onalarmiconchanged(ev: js.Any & WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the alarm icon has changed. */
    @JSName("onalarmiconchanged")
    var onalarmiconchanged_Original: TypedEventHandler[LockScreenInfo, js.Any] = js.native
    
    /** Indicates the badges have changed. */
    def onbadgeschanged(ev: js.Any & WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the badges have changed. */
    @JSName("onbadgeschanged")
    var onbadgeschanged_Original: TypedEventHandler[LockScreenInfo, js.Any] = js.native
    
    /** Indicates the detail text has changed. */
    def ondetailtextchanged(ev: js.Any & WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the detail text has changed. */
    @JSName("ondetailtextchanged")
    var ondetailtextchanged_Original: TypedEventHandler[LockScreenInfo, js.Any] = js.native
    
    /** Indicates the lock screen image has changed. */
    def onlockscreenimagechanged(ev: js.Any & WinRTEvent[LockScreenInfo]): Unit = js.native
    /** Indicates the lock screen image has changed. */
    @JSName("onlockscreenimagechanged")
    var onlockscreenimagechanged_Original: TypedEventHandler[LockScreenInfo, js.Any] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_alarmiconchanged(`type`: alarmiconchanged, listener: TypedEventHandler[LockScreenInfo, js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_badgeschanged(`type`: badgeschanged, listener: TypedEventHandler[LockScreenInfo, js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_detailtextchanged(`type`: detailtextchanged, listener: TypedEventHandler[LockScreenInfo, js.Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_lockscreenimagechanged(`type`: lockscreenimagechanged, listener: TypedEventHandler[LockScreenInfo, js.Any]): Unit = js.native
  }
  
  /** Represents an unlock deferral. */
  trait LockScreenUnlockingDeferral extends StObject {
    
    /** Notifies the system that your deferral is complete. If your deferral takes too long to complete, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
    def complete(): Unit
  }
  object LockScreenUnlockingDeferral {
    
    @scala.inline
    def apply(complete: () => Unit): LockScreenUnlockingDeferral = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[LockScreenUnlockingDeferral]
    }
    
    @scala.inline
    implicit class LockScreenUnlockingDeferralMutableBuilder[Self <: LockScreenUnlockingDeferral] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    }
  }
  
  /** Represents the lock screen unlocking events. */
  trait LockScreenUnlockingEventArgs extends StObject {
    
    /** Gets the deadline by which the lock screen app must unlock the device. If your unlocking deferral takes too long, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
    var deadline: Date
    
    /**
      * Gets a LockScreenUnlockingDeferral , which defers the unlocking of the device.
      * @return An unlock deferral.
      */
    def getDeferral(): LockScreenUnlockingDeferral
  }
  object LockScreenUnlockingEventArgs {
    
    @scala.inline
    def apply(deadline: Date, getDeferral: () => LockScreenUnlockingDeferral): LockScreenUnlockingEventArgs = {
      val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
      __obj.asInstanceOf[LockScreenUnlockingEventArgs]
    }
    
    @scala.inline
    implicit class LockScreenUnlockingEventArgsMutableBuilder[Self <: LockScreenUnlockingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDeferral(value: () => LockScreenUnlockingDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    }
  }
}
