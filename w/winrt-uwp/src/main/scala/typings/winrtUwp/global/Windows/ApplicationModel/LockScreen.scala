package typings.winrtUwp.global.Windows.ApplicationModel

import typings.std.Date
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** You can create an app that acts as the lock screen, allowing greater user personalization. You can develop novel unlock gestures and animations, and also display custom information or appearances for people. */
@JSGlobal("Windows.ApplicationModel.LockScreen")
@js.native
object LockScreen extends js.Object {
  /** Allows the lock screen app to request that the device unlocks, and allows the app to register to be notified when the device begins to unlock. */
  @js.native
  abstract class LockApplicationHost ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockApplicationHost
  
  /** Represents a lock screen badge for an app. */
  @js.native
  abstract class LockScreenBadge ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenBadge {
    /** Gets the name. */
    /* CompleteClass */
    override var automationName: String = js.native
    /** Gets the glyph to display. */
    /* CompleteClass */
    override var glyph: IRandomAccessStream = js.native
    /** Gets the logo to display with the badge. */
    /* CompleteClass */
    override var logo: IRandomAccessStream = js.native
    /** Gets the number to display with the badge. */
    /* CompleteClass */
    override var number: Double = js.native
    /** Launches the app corresponding to the badge. */
    /* CompleteClass */
    override def launchApp(): Unit = js.native
  }
  
  /** Provides access to the same data that the default lock screen has access to, such as wallpaper, badges, and so on. */
  @js.native
  abstract class LockScreenInfo ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenInfo
  
  /** Represents an unlock deferral. */
  @js.native
  abstract class LockScreenUnlockingDeferral ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenUnlockingDeferral {
    /** Notifies the system that your deferral is complete. If your deferral takes too long to complete, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Represents the lock screen unlocking events. */
  @js.native
  abstract class LockScreenUnlockingEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenUnlockingEventArgs {
    /** Gets the deadline by which the lock screen app must unlock the device. If your unlocking deferral takes too long, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
    /* CompleteClass */
    override var deadline: Date = js.native
    /**
      * Gets a LockScreenUnlockingDeferral , which defers the unlocking of the device.
      * @return An unlock deferral.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenUnlockingDeferral = js.native
  }
  
  /* static members */
  @js.native
  object LockApplicationHost extends js.Object {
    /**
      * Gets a LockApplicationHost object.
      * @return A LockApplicationHost object.
      */
    def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockApplicationHost = js.native
  }
  
}

