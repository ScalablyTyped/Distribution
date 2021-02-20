package typings.winrtUwp.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** You can create an app that acts as the lock screen, allowing greater user personalization. You can develop novel unlock gestures and animations, and also display custom information or appearances for people. */
object LockScreen {
  
  /** Allows the lock screen app to request that the device unlocks, and allows the app to register to be notified when the device begins to unlock. */
  @JSGlobal("Windows.ApplicationModel.LockScreen.LockApplicationHost")
  @js.native
  abstract class LockApplicationHost ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockApplicationHost
  object LockApplicationHost {
    
    /**
      * Gets a LockApplicationHost object.
      * @return A LockApplicationHost object.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.LockScreen.LockApplicationHost.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockApplicationHost = js.native
  }
  
  /** Represents a lock screen badge for an app. */
  @JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenBadge")
  @js.native
  abstract class LockScreenBadge ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenBadge
  
  /** Provides access to the same data that the default lock screen has access to, such as wallpaper, badges, and so on. */
  @JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenInfo")
  @js.native
  abstract class LockScreenInfo ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenInfo
  
  /** Represents an unlock deferral. */
  @JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenUnlockingDeferral")
  @js.native
  abstract class LockScreenUnlockingDeferral ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenUnlockingDeferral
  
  /** Represents the lock screen unlocking events. */
  @JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenUnlockingEventArgs")
  @js.native
  abstract class LockScreenUnlockingEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenUnlockingEventArgs
}
