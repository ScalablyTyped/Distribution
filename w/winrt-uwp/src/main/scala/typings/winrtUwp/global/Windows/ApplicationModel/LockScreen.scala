package typings.winrtUwp.global.Windows.ApplicationModel

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
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenBadge
  
  /** Provides access to the same data that the default lock screen has access to, such as wallpaper, badges, and so on. */
  @js.native
  abstract class LockScreenInfo ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenInfo
  
  /** Represents an unlock deferral. */
  @js.native
  abstract class LockScreenUnlockingDeferral ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenUnlockingDeferral
  
  /** Represents the lock screen unlocking events. */
  @js.native
  abstract class LockScreenUnlockingEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenUnlockingEventArgs
  
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

