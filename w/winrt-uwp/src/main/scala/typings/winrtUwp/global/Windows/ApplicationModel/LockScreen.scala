package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** You can create an app that acts as the lock screen, allowing greater user personalization. You can develop novel unlock gestures and animations, and also display custom information or appearances for people. */
object LockScreen {
  
  /** Allows the lock screen app to request that the device unlocks, and allows the app to register to be notified when the device begins to unlock. */
  @JSGlobal("Windows.ApplicationModel.LockScreen.LockApplicationHost")
  @js.native
  abstract class LockApplicationHost ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockApplicationHost
  object LockApplicationHost {
    
    @JSGlobal("Windows.ApplicationModel.LockScreen.LockApplicationHost")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a LockApplicationHost object.
      * @return A LockApplicationHost object.
      */
    /* static member */
    inline def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockApplicationHost = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockApplicationHost]
  }
  
  /** Represents a lock screen badge for an app. */
  @JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenBadge")
  @js.native
  abstract class LockScreenBadge ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenBadge {
    
    /** Gets the name. */
    /* CompleteClass */
    var automationName: String = js.native
    
    /** Gets the glyph to display. */
    /* CompleteClass */
    var glyph: IRandomAccessStream = js.native
    
    /** Launches the app corresponding to the badge. */
    /* CompleteClass */
    override def launchApp(): Unit = js.native
    
    /** Gets the logo to display with the badge. */
    /* CompleteClass */
    var logo: IRandomAccessStream = js.native
    
    /** Gets the number to display with the badge. */
    /* CompleteClass */
    var number: Double = js.native
  }
  
  /** Provides access to the same data that the default lock screen has access to, such as wallpaper, badges, and so on. */
  @JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenInfo")
  @js.native
  abstract class LockScreenInfo ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenInfo
  
  /** Represents an unlock deferral. */
  @JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenUnlockingDeferral")
  @js.native
  abstract class LockScreenUnlockingDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenUnlockingDeferral {
    
    /** Notifies the system that your deferral is complete. If your deferral takes too long to complete, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Represents the lock screen unlocking events. */
  @JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenUnlockingEventArgs")
  @js.native
  abstract class LockScreenUnlockingEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenUnlockingEventArgs {
    
    /** Gets the deadline by which the lock screen app must unlock the device. If your unlocking deferral takes too long, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
    /* CompleteClass */
    var deadline: js.Date = js.native
    
    /**
      * Gets a LockScreenUnlockingDeferral , which defers the unlocking of the device.
      * @return An unlock deferral.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.LockScreen.LockScreenUnlockingDeferral = js.native
  }
}
