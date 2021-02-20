package typings.titanium.global.Titanium

import typings.titanium.Dictionary
import typings.titanium.GetUserNotificationSettings
import typings.titanium.NotificationParams
import typings.titanium.Titanium.Android.Intent
import typings.titanium.Titanium.App.AndroidShortcutitemclickEvent
import typings.titanium.Titanium.App.PropertiesChangeEvent
import typings.titanium.Titanium.App.iOS.BackgroundService
import typings.titanium.Titanium.App.iOS.UserDefaults
import typings.titanium.Titanium.App.iOSBackgroundfetchEvent
import typings.titanium.Titanium.App.iOSBackgroundtransferEvent
import typings.titanium.Titanium.App.iOSContinueactivityEvent
import typings.titanium.Titanium.App.iOSDownloadcompletedEvent
import typings.titanium.Titanium.App.iOSDownloadprogressEvent
import typings.titanium.Titanium.App.iOSHandleurlEvent
import typings.titanium.Titanium.App.iOSLocalnotificationactionEvent
import typings.titanium.Titanium.App.iOSNotificationEvent
import typings.titanium.Titanium.App.iOSRemotenotificationactionEvent
import typings.titanium.Titanium.App.iOSScreenshotcapturedEvent
import typings.titanium.Titanium.App.iOSSessioncompletedEvent
import typings.titanium.Titanium.App.iOSSessioneventscompletedEvent
import typings.titanium.Titanium.App.iOSShortcutitemclickEvent
import typings.titanium.Titanium.App.iOSSilentpushEvent
import typings.titanium.Titanium.App.iOSTraitcollectionchangeEvent
import typings.titanium.Titanium.App.iOSUploadprogressEvent
import typings.titanium.Titanium.App.iOSUsernotificationsettingsEvent
import typings.titanium.Titanium.App.iOSWatchkitextensionrequestEvent
import typings.titanium.Titanium.AppAccessibilitychangedEvent
import typings.titanium.Titanium.AppCloseEvent
import typings.titanium.Titanium.AppKeyboardframechangedEvent
import typings.titanium.Titanium.AppMemorywarningEvent
import typings.titanium.Titanium.AppPauseEvent
import typings.titanium.Titanium.AppPausedEvent
import typings.titanium.Titanium.AppProximityEvent
import typings.titanium.Titanium.AppResumeEvent
import typings.titanium.Titanium.AppResumedEvent
import typings.titanium.Titanium.AppShortcutitemclickEvent
import typings.titanium.Titanium.AppSignificanttimechangeEvent
import typings.titanium.Titanium.AppStartedEvent
import typings.titanium.Titanium.AppUncaughtExceptionEvent
import typings.titanium.Titanium.AppUserinteractionEvent
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.UserNotificationCallbackResponse
import typings.titanium.UserNotificationDictionary
import typings.titanium.UserNotificationSettings
import typings.titanium.launchOptions
import typings.titanium.titaniumStrings.accessibilitychanged
import typings.titanium.titaniumStrings.backgroundfetch
import typings.titanium.titaniumStrings.backgroundtransfer
import typings.titanium.titaniumStrings.change
import typings.titanium.titaniumStrings.close
import typings.titanium.titaniumStrings.continueactivity
import typings.titanium.titaniumStrings.downloadcompleted
import typings.titanium.titaniumStrings.downloadprogress
import typings.titanium.titaniumStrings.handleurl
import typings.titanium.titaniumStrings.keyboardframechanged
import typings.titanium.titaniumStrings.localnotificationaction
import typings.titanium.titaniumStrings.memorywarning
import typings.titanium.titaniumStrings.notification
import typings.titanium.titaniumStrings.pause
import typings.titanium.titaniumStrings.paused
import typings.titanium.titaniumStrings.proximity
import typings.titanium.titaniumStrings.remotenotificationaction
import typings.titanium.titaniumStrings.resume
import typings.titanium.titaniumStrings.resumed
import typings.titanium.titaniumStrings.screenshotcaptured
import typings.titanium.titaniumStrings.sessioncompleted
import typings.titanium.titaniumStrings.sessioneventscompleted
import typings.titanium.titaniumStrings.shortcutitemclick
import typings.titanium.titaniumStrings.significanttimechange
import typings.titanium.titaniumStrings.silentpush
import typings.titanium.titaniumStrings.started
import typings.titanium.titaniumStrings.traitcollectionchange
import typings.titanium.titaniumStrings.uncaughtException
import typings.titanium.titaniumStrings.uploadprogress
import typings.titanium.titaniumStrings.userinteraction
import typings.titanium.titaniumStrings.usernotificationsettings
import typings.titanium.titaniumStrings.watchkitextensionrequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level App module is mainly used for accessing information about the
  * application at runtime, and for sending or listening for system events.
  */
@JSGlobal("Titanium.App")
@js.native
class App ()
  extends typings.titanium.Titanium.Proxy
/**
  * The top-level App module is mainly used for accessing information about the
  * application at runtime, and for sending or listening for system events.
  */
object App {
  
  @JSGlobal("Titanium.App")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A module used to access Android application resources.
    */
  @JSGlobal("Titanium.App.Android")
  @js.native
  class Android ()
    extends typings.titanium.Titanium.Proxy
  object Android {
    
    @JSGlobal("Titanium.App.Android")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The `R` namespace for application resources.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.R")
    @js.native
    val R: typings.titanium.Titanium.Android.R = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.addEventListener")
    @js.native
    def addEventListener_shortcutitemclick(
      name: shortcutitemclick,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.Android, 
          /* event */ AndroidShortcutitemclickEvent, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * The version number of the application.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.appVersionCode")
    @js.native
    val appVersionCode: Double = js.native
    
    /**
      * The version name of the application.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.appVersionName")
    @js.native
    val appVersionName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.App.Android.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.fireEvent")
    @js.native
    def fireEvent_shortcutitemclick(name: shortcutitemclick): Unit = js.native
    @JSGlobal("Titanium.App.Android.fireEvent")
    @js.native
    def fireEvent_shortcutitemclick(name: shortcutitemclick, event: AndroidShortcutitemclickEvent): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.apiName> property.
      * @deprecated Access <Titanium.App.Android.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.appVersionCode> property.
      * @deprecated Access <Titanium.App.Android.appVersionCode> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.getAppVersionCode")
    @js.native
    def getAppVersionCode(): Double = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.appVersionName> property.
      * @deprecated Access <Titanium.App.Android.appVersionName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.getAppVersionName")
    @js.native
    def getAppVersionName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.bubbleParent> property.
      * @deprecated Access <Titanium.App.Android.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.launchIntent> property.
      * @deprecated Access <Titanium.App.Android.launchIntent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.getLaunchIntent")
    @js.native
    def getLaunchIntent(): Intent = js.native
    
    /**
      * Gets the value of the <Titanium.App.Android.lifecycleContainer> property.
      * @deprecated Access <Titanium.App.Android.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.getLifecycleContainer")
    @js.native
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * Return the intent that was used to launch the application.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.launchIntent")
    @js.native
    val launchIntent: Intent = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.lifecycleContainer")
    @js.native
    def lifecycleContainer: Window | TabGroup = js.native
    @scala.inline
    def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.removeEventListener")
    @js.native
    def removeEventListener_shortcutitemclick(
      name: shortcutitemclick,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.Android, 
          /* event */ AndroidShortcutitemclickEvent, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.Android.bubbleParent> property.
      * @deprecated Set the value using <Titanium.App.Android.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    @JSGlobal("Titanium.App.Android.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.App.Android.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.App.Android.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Android.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  }
  
  /**
    * Convenience constant for system event "accessibilityannouncement".
    */
  @JSGlobal("Titanium.App.EVENT_ACCESSIBILITY_ANNOUNCEMENT")
  @js.native
  val EVENT_ACCESSIBILITY_ANNOUNCEMENT: String = js.native
  
  /**
    * Convenience constant for system event "accessibilitychanged".
    */
  @JSGlobal("Titanium.App.EVENT_ACCESSIBILITY_CHANGED")
  @js.native
  val EVENT_ACCESSIBILITY_CHANGED: String = js.native
  
  /**
    * The App Properties module is used for storing application-related data in property/value pairs
    * that persist beyond application sessions and device power cycles.
    */
  @JSGlobal("Titanium.App.Properties")
  @js.native
  class Properties ()
    extends typings.titanium.Titanium.Proxy
  object Properties {
    
    @JSGlobal("Titanium.App.Properties")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.addEventListener")
    @js.native
    def addEventListener_change(
      name: change,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.Properties, 
          /* event */ PropertiesChangeEvent, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.App.Properties.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.fireEvent")
    @js.native
    def fireEvent_change(name: change): Unit = js.native
    @JSGlobal("Titanium.App.Properties.fireEvent")
    @js.native
    def fireEvent_change(name: change, event: PropertiesChangeEvent): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.App.Properties.apiName> property.
      * @deprecated Access <Titanium.App.Properties.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Returns the value of a property as a boolean data type.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.getBool")
    @js.native
    def getBool(property: String): Boolean = js.native
    @JSGlobal("Titanium.App.Properties.getBool")
    @js.native
    def getBool(property: String, defaultValue: Boolean): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.Properties.bubbleParent> property.
      * @deprecated Access <Titanium.App.Properties.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Returns the value of a property as a double (double-precision, floating point) data type.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.getDouble")
    @js.native
    def getDouble(property: String): Double = js.native
    @JSGlobal("Titanium.App.Properties.getDouble")
    @js.native
    def getDouble(property: String, defaultValue: Double): Double = js.native
    
    /**
      * Returns the value of a property as an integer data type.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.getInt")
    @js.native
    def getInt(property: String): Double = js.native
    @JSGlobal("Titanium.App.Properties.getInt")
    @js.native
    def getInt(property: String, defaultValue: Double): Double = js.native
    
    /**
      * Gets the value of the <Titanium.App.Properties.lifecycleContainer> property.
      * @deprecated Access <Titanium.App.Properties.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.getLifecycleContainer")
    @js.native
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * Returns the value of a property as an array data type.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.getList")
    @js.native
    def getList(property: String): js.Array[_] = js.native
    @JSGlobal("Titanium.App.Properties.getList")
    @js.native
    def getList(property: String, defaultValue: js.Array[_]): js.Array[_] = js.native
    
    /**
      * Returns the value of a property as an object.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.getObject")
    @js.native
    def getObject(property: String): js.Any = js.native
    @JSGlobal("Titanium.App.Properties.getObject")
    @js.native
    def getObject(property: String, defaultValue: js.Any): js.Any = js.native
    
    /**
      * Returns the value of a property as a string data type.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.getString")
    @js.native
    def getString(property: String): String = js.native
    @JSGlobal("Titanium.App.Properties.getString")
    @js.native
    def getString(property: String, defaultValue: String): String = js.native
    
    /**
      * Indicates whether a property exists.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.hasProperty")
    @js.native
    def hasProperty(property: String): Boolean = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.lifecycleContainer")
    @js.native
    def lifecycleContainer: Window | TabGroup = js.native
    @scala.inline
    def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
    
    /**
      * Returns an array of property names.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.listProperties")
    @js.native
    def listProperties(): js.Array[_] = js.native
    
    /**
      * Removes all properties that have been set by the user on runtime, or does nothing otherwise.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.removeAllProperties")
    @js.native
    def removeAllProperties(): Unit = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.removeEventListener")
    @js.native
    def removeEventListener_change(
      name: change,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.Properties, 
          /* event */ PropertiesChangeEvent, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Removes a property if it exists, or does nothing otherwise.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.removeProperty")
    @js.native
    def removeProperty(property: String): Unit = js.native
    
    /**
      * Sets the value of a property as a boolean data type. The property will be created if it
      * does not exist.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.setBool")
    @js.native
    def setBool(property: String, value: Boolean): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.Properties.bubbleParent> property.
      * @deprecated Set the value using <Titanium.App.Properties.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    /**
      * Sets the value of a property as a double (double-precision, floating point) data type. The
      * property will be created if it does not exist.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.setDouble")
    @js.native
    def setDouble(property: String, value: Double): Unit = js.native
    
    /**
      * Sets the value of a property as an integer data type. The property will be created if it
      * does not exist.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.setInt")
    @js.native
    def setInt(property: String, value: Double): Unit = js.native
    
    @JSGlobal("Titanium.App.Properties.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.App.Properties.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.App.Properties.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
    
    /**
      * Sets the value of a property as an array data type. The property will be created if it
      * does not exist.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.setList")
    @js.native
    def setList(property: String, value: js.Array[_]): Unit = js.native
    
    /**
      * Sets the value of a property as an object data type. The property will be created if it
      * does not exist.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.setObject")
    @js.native
    def setObject(property: String, value: js.Any): Unit = js.native
    
    /**
      * Sets the value of a property as a string data type. The property will be created if it
      * does not exist.
      */
    /* static member */
    @JSGlobal("Titanium.App.Properties.setString")
    @js.native
    def setString(property: String, value: String): Unit = js.native
  }
  
  /**
    * Indicates whether Accessibility is enabled by the system.
    */
  /* static member */
  @JSGlobal("Titanium.App.accessibilityEnabled")
  @js.native
  val accessibilityEnabled: Boolean = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_accessibilitychanged(
    name: accessibilitychanged,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.App, 
      /* event */ AppAccessibilitychangedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_close(
    name: close,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppCloseEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_keyboardframechanged(
    name: keyboardframechanged,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.App, 
      /* event */ AppKeyboardframechangedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_memorywarning(
    name: memorywarning,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppMemorywarningEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_pause(
    name: pause,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppPauseEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_paused(
    name: paused,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppPausedEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_proximity(
    name: proximity,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppProximityEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_resume(
    name: resume,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppResumeEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_resumed(
    name: resumed,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppResumedEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_shortcutitemclick(
    name: shortcutitemclick,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.App, 
      /* event */ AppShortcutitemclickEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_significanttimechange(
    name: significanttimechange,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.App, 
      /* event */ AppSignificanttimechangeEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_started(
    name: started,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppStartedEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_uncaughtException(
    name: uncaughtException,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.App, 
      /* event */ AppUncaughtExceptionEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.App.addEventListener")
  @js.native
  def addEventListener_userinteraction(
    name: userinteraction,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppUserinteractionEvent, Unit]
  ): Unit = js.native
  
  /**
    * Indicates whether Analytics is enabled, determined by `tiapp.xml`.
    */
  /* static member */
  @JSGlobal("Titanium.App.analytics")
  @js.native
  val analytics: Boolean = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.App.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.App.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.App.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Application copyright statement, determined by `tiapp.xml`.
    */
  /* static member */
  @JSGlobal("Titanium.App.copyright")
  @js.native
  val copyright: String = js.native
  
  /**
    * A reference to the currnet background service running when the application is placed in the background.
    */
  /* static member */
  @JSGlobal("Titanium.App.currentService")
  @js.native
  val currentService: BackgroundService = js.native
  
  /**
    * Build type that reflects how the application was packaged.
    * Returns one of the following values:
    * * `development` (Simulator)
    * * `test` (Device)
    * * `production` (App Store / Adhoc)
    */
  /* static member */
  @JSGlobal("Titanium.App.deployType")
  @js.native
  val deployType: String = js.native
  
  /**
    * Application description, determined by `tiapp.xml`.
    */
  /* static member */
  @JSGlobal("Titanium.App.description")
  @js.native
  val description: String = js.native
  
  /**
    * Prevents network activity indicator from being displayed.
    */
  /* static member */
  @JSGlobal("Titanium.App.disableNetworkActivityIndicator")
  @js.native
  def disableNetworkActivityIndicator: Boolean = js.native
  @scala.inline
  def disableNetworkActivityIndicator_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableNetworkActivityIndicator")(x.asInstanceOf[js.Any])
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_accessibilitychanged(name: accessibilitychanged): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_accessibilitychanged(name: accessibilitychanged, event: AppAccessibilitychangedEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_close(name: close): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_close(name: close, event: AppCloseEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_keyboardframechanged(name: keyboardframechanged): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_keyboardframechanged(name: keyboardframechanged, event: AppKeyboardframechangedEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_memorywarning(name: memorywarning): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_memorywarning(name: memorywarning, event: AppMemorywarningEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_pause(name: pause): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_pause(name: pause, event: AppPauseEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_paused(name: paused): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_paused(name: paused, event: AppPausedEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_proximity(name: proximity): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_proximity(name: proximity, event: AppProximityEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_resume(name: resume): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_resume(name: resume, event: AppResumeEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_resumed(name: resumed): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_resumed(name: resumed, event: AppResumedEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_shortcutitemclick(name: shortcutitemclick): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_shortcutitemclick(name: shortcutitemclick, event: AppShortcutitemclickEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_significanttimechange(name: significanttimechange): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_significanttimechange(name: significanttimechange, event: AppSignificanttimechangeEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_started(name: started): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_started(name: started, event: AppStartedEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_uncaughtException(name: uncaughtException): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_uncaughtException(name: uncaughtException, event: AppUncaughtExceptionEvent): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_userinteraction(name: userinteraction): Unit = js.native
  @JSGlobal("Titanium.App.fireEvent")
  @js.native
  def fireEvent_userinteraction(name: userinteraction, event: AppUserinteractionEvent): Unit = js.native
  
  /**
    * Fire a system-level event such as <Titanium.App.EVENT_ACCESSIBILITY_ANNOUNCEMENT>.
    */
  /* static member */
  @JSGlobal("Titanium.App.fireSystemEvent")
  @js.native
  def fireSystemEvent(eventName: String): Unit = js.native
  @JSGlobal("Titanium.App.fireSystemEvent")
  @js.native
  def fireSystemEvent(eventName: String, param: js.Any): Unit = js.native
  
  /**
    * Shows the application's splash screen on app resume.
    */
  /* static member */
  @JSGlobal("Titanium.App.forceSplashAsSnapshot")
  @js.native
  def forceSplashAsSnapshot: Boolean = js.native
  @scala.inline
  def forceSplashAsSnapshot_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceSplashAsSnapshot")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the value of the <Titanium.App.accessibilityEnabled> property.
    * @deprecated Access <Titanium.App.accessibilityEnabled> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getAccessibilityEnabled")
  @js.native
  def getAccessibilityEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.analytics> property.
    * @deprecated Access <Titanium.App.analytics> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getAnalytics")
  @js.native
  def getAnalytics(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.apiName> property.
    * @deprecated Access <Titanium.App.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Returns the arguments passed to the application on startup.
    */
  /* static member */
  @JSGlobal("Titanium.App.getArguments")
  @js.native
  def getArguments(): launchOptions = js.native
  
  /**
    * Gets the value of the <Titanium.App.bubbleParent> property.
    * @deprecated Access <Titanium.App.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.copyright> property.
    * @deprecated Access <Titanium.App.copyright> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getCopyright")
  @js.native
  def getCopyright(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.currentService> property.
    * @deprecated Access <Titanium.App.currentService> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getCurrentService")
  @js.native
  def getCurrentService(): BackgroundService = js.native
  
  /**
    * Gets the value of the <Titanium.App.deployType> property.
    * @deprecated Access <Titanium.App.deployType> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getDeployType")
  @js.native
  def getDeployType(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.description> property.
    * @deprecated Access <Titanium.App.description> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getDescription")
  @js.native
  def getDescription(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.disableNetworkActivityIndicator> property.
    * @deprecated Access <Titanium.App.disableNetworkActivityIndicator> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getDisableNetworkActivityIndicator")
  @js.native
  def getDisableNetworkActivityIndicator(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.forceSplashAsSnapshot> property.
    * @deprecated Access <Titanium.App.forceSplashAsSnapshot> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getForceSplashAsSnapshot")
  @js.native
  def getForceSplashAsSnapshot(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.guid> property.
    * @deprecated Access <Titanium.App.guid> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getGuid")
  @js.native
  def getGuid(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.id> property.
    * @deprecated Access <Titanium.App.id> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getId")
  @js.native
  def getId(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.idleTimerDisabled> property.
    * @deprecated Access <Titanium.App.idleTimerDisabled> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getIdleTimerDisabled")
  @js.native
  def getIdleTimerDisabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.installId> property.
    * @deprecated Access <Titanium.App.installId> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getInstallId")
  @js.native
  def getInstallId(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.keyboardVisible> property.
    * @deprecated Access <Titanium.App.keyboardVisible> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getKeyboardVisible")
  @js.native
  def getKeyboardVisible(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.lifecycleContainer> property.
    * @deprecated Access <Titanium.App.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.App.name> property.
    * @deprecated Access <Titanium.App.name> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getName")
  @js.native
  def getName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.proximityDetection> property.
    * @deprecated Access <Titanium.App.proximityDetection> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getProximityDetection")
  @js.native
  def getProximityDetection(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.proximityState> property.
    * @deprecated Access <Titanium.App.proximityState> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getProximityState")
  @js.native
  def getProximityState(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.App.publisher> property.
    * @deprecated Access <Titanium.App.publisher> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getPublisher")
  @js.native
  def getPublisher(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.sessionId> property.
    * @deprecated Access <Titanium.App.sessionId> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getSessionId")
  @js.native
  def getSessionId(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.url> property.
    * @deprecated Access <Titanium.App.url> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getUrl")
  @js.native
  def getUrl(): String = js.native
  
  /**
    * Gets the value of the <Titanium.App.version> property.
    * @deprecated Access <Titanium.App.version> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.getVersion")
  @js.native
  def getVersion(): String = js.native
  
  /**
    * Application globally-unique ID, determined by `tiapp.xml`.
    */
  /* static member */
  @JSGlobal("Titanium.App.guid")
  @js.native
  val guid: String = js.native
  
  /**
    * The top-level App iOS module, available only to iOS devices, that includes the facilities to
    * create and manage local notifications and background services.
    */
  @JSGlobal("Titanium.App.iOS")
  @js.native
  class iOS ()
    extends typings.titanium.Titanium.Proxy
  /**
    * The top-level App iOS module, available only to iOS devices, that includes the facilities to
    * create and manage local notifications and background services.
    */
  object iOS {
    
    @JSGlobal("Titanium.App.iOS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Use with [setMinimumBackgroundFetchInterval](Titanium.App.iOS.setMinimumBackgroundFetchInterval) method.
      * Specifies the smallest fetch interval supported by the system.
      */
    @JSGlobal("Titanium.App.iOS.BACKGROUNDFETCHINTERVAL_MIN")
    @js.native
    val BACKGROUNDFETCHINTERVAL_MIN: Double = js.native
    
    /**
      * Use with [setMinimumBackgroundFetchInterval](Titanium.App.iOS.setMinimumBackgroundFetchInterval) method.
      * Used to specify a fetch interval large enough to prevent fetch operations from occurring.
      */
    @JSGlobal("Titanium.App.iOS.BACKGROUNDFETCHINTERVAL_NEVER")
    @js.native
    val BACKGROUNDFETCHINTERVAL_NEVER: Double = js.native
    
    /**
      * A service that runs when the application is placed in the background.
      */
    @JSGlobal("Titanium.App.iOS.BackgroundService")
    @js.native
    class BackgroundService ()
      extends typings.titanium.Titanium.App.iOS.BackgroundService
    
    /**
      * Convenience constant for system event "accessibilitylayoutchanged".
      */
    @JSGlobal("Titanium.App.iOS.EVENT_ACCESSIBILITY_LAYOUT_CHANGED")
    @js.native
    val EVENT_ACCESSIBILITY_LAYOUT_CHANGED: String = js.native
    
    /**
      * Convenience constant for system event "accessibilityscreenchanged".
      */
    @JSGlobal("Titanium.App.iOS.EVENT_ACCESSIBILITY_SCREEN_CHANGED")
    @js.native
    val EVENT_ACCESSIBILITY_SCREEN_CHANGED: String = js.native
    
    /**
      * A local notification to alert the user of new or pending application information.
      */
    @JSGlobal("Titanium.App.iOS.LocalNotification")
    @js.native
    class LocalNotification ()
      extends typings.titanium.Titanium.App.iOS.LocalNotification
    
    /**
      * A search query object manages the criteria to apply when searching app content that you have previously
      * indexed by using the Core Spotlight APIs.
      */
    @JSGlobal("Titanium.App.iOS.SearchQuery")
    @js.native
    class SearchQuery ()
      extends typings.titanium.Titanium.App.iOS.SearchQuery
    
    /**
      * The SearchableIndex module is used to add or remove Ti.App.iOS.SearchableItem objects from the device search index.
      */
    @JSGlobal("Titanium.App.iOS.SearchableIndex")
    @js.native
    class SearchableIndex ()
      extends typings.titanium.Titanium.App.iOS.SearchableIndex
    
    /**
      * Used to create a unique object containing all of the search information that will appear in the device search index.
      */
    @JSGlobal("Titanium.App.iOS.SearchableItem")
    @js.native
    class SearchableItem ()
      extends typings.titanium.Titanium.App.iOS.SearchableItem
    
    /**
      * The SearchableItemAttributeSet module defines metadata properties for SearchItem and UserActivity objects.
      */
    @JSGlobal("Titanium.App.iOS.SearchableItemAttributeSet")
    @js.native
    class SearchableItemAttributeSet ()
      extends typings.titanium.Titanium.App.iOS.SearchableItemAttributeSet
    
    /**
      * A dark interface style.
      * @deprecated Use <Titanium.UI.USER_INTERFACE_STYLE_DARK> instead, which is supported cross-platform.
      */
    @JSGlobal("Titanium.App.iOS.USER_INTERFACE_STYLE_DARK")
    @js.native
    val USER_INTERFACE_STYLE_DARK: Double = js.native
    
    /**
      * A light interface style.
      * @deprecated Use <Titanium.UI.USER_INTERFACE_STYLE_LIGHT> instead, which is supported cross-platform.
      */
    @JSGlobal("Titanium.App.iOS.USER_INTERFACE_STYLE_LIGHT")
    @js.native
    val USER_INTERFACE_STYLE_LIGHT: Double = js.native
    
    /**
      * An unspecified interface style.
      * @deprecated Use <Titanium.UI.USER_INTERFACE_STYLE_UNSPECIFIED> instead, which is supported cross-platform.
      */
    @JSGlobal("Titanium.App.iOS.USER_INTERFACE_STYLE_UNSPECIFIED")
    @js.native
    val USER_INTERFACE_STYLE_UNSPECIFIED: Double = js.native
    
    /**
      * The action will execute in background. Use with the
      * [activationMode](Titanium.App.iOS.UserNotificationAction.activationMode) property.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_ACTIVATION_MODE_BACKGROUND")
    @js.native
    val USER_NOTIFICATION_ACTIVATION_MODE_BACKGROUND: Double = js.native
    
    /**
      * The action will launch the application and execute in the foreground.
      * Use with the [activationMode](Titanium.App.iOS.UserNotificationAction.activationMode) property.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_ACTIVATION_MODE_FOREGROUND")
    @js.native
    val USER_NOTIFICATION_ACTIVATION_MODE_FOREGROUND: Double = js.native
    
    /**
      * A alert dialog is presented when the notification is received.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_ALERT_STYLE_ALERT")
    @js.native
    val USER_NOTIFICATION_ALERT_STYLE_ALERT: Double = js.native
    
    /**
      * A banner is presented when the notification is received.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_ALERT_STYLE_BANNER")
    @js.native
    val USER_NOTIFICATION_ALERT_STYLE_BANNER: Double = js.native
    
    /**
      * No banner or alert dialog is presented when the notification is received.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_ALERT_STYLE_NONE")
    @js.native
    val USER_NOTIFICATION_ALERT_STYLE_NONE: Double = js.native
    
    /**
      * The application is authorized to post user notifications.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_AUTHORIZATION_STATUS_AUTHORIZED")
    @js.native
    val USER_NOTIFICATION_AUTHORIZATION_STATUS_AUTHORIZED: Double = js.native
    
    /**
      * The application is not authorized to post user notifications.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_AUTHORIZATION_STATUS_DENIED")
    @js.native
    val USER_NOTIFICATION_AUTHORIZATION_STATUS_DENIED: Double = js.native
    
    /**
      * The user has not yet made a choice regarding whether the application may post
      * user notifications.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_AUTHORIZATION_STATUS_NOT_DETERMINED")
    @js.native
    val USER_NOTIFICATION_AUTHORIZATION_STATUS_NOT_DETERMINED: Double = js.native
    
    /**
      * The application is provisionally authorized to post non-interruptive user notifications.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_AUTHORIZATION_STATUS_PROVISIONAL")
    @js.native
    val USER_NOTIFICATION_AUTHORIZATION_STATUS_PROVISIONAL: Double = js.native
    
    /**
      * Default action behavior with no additional action support.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_BEHAVIOR_DEFAULT")
    @js.native
    val USER_NOTIFICATION_BEHAVIOR_DEFAULT: Double = js.native
    
    /**
      * Provides a textfield with the notification for the user to enter a text response.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_BEHAVIOR_TEXTINPUT")
    @js.native
    val USER_NOTIFICATION_BEHAVIOR_TEXTINPUT: Double = js.native
    
    /**
      * Allow CarPlay to display notifications of this type.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_CATEGORY_OPTION_ALLOW_IN_CARPLAY")
    @js.native
    val USER_NOTIFICATION_CATEGORY_OPTION_ALLOW_IN_CARPLAY: Double = js.native
    
    /**
      * Send dismiss actions to the UNUserNotificationCenter object's delegate for handling.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_CATEGORY_OPTION_CUSTOM_DISMISS_ACTION")
    @js.native
    val USER_NOTIFICATION_CATEGORY_OPTION_CUSTOM_DISMISS_ACTION: Double = js.native
    
    /**
      * Show the notification's subtitle, even if the user has disabled notification previews for the app.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_CATEGORY_OPTION_HIDDEN_PREVIEWS_SHOW_SUBTITLE")
    @js.native
    val USER_NOTIFICATION_CATEGORY_OPTION_HIDDEN_PREVIEWS_SHOW_SUBTITLE: Double = js.native
    
    /**
      * Show the notification's title, even if the user has disabled notification previews for the app.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_CATEGORY_OPTION_HIDDEN_PREVIEWS_SHOW_TITLE")
    @js.native
    val USER_NOTIFICATION_CATEGORY_OPTION_HIDDEN_PREVIEWS_SHOW_TITLE: Double = js.native
    
    /**
      * No options.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_CATEGORY_OPTION_NONE")
    @js.native
    val USER_NOTIFICATION_CATEGORY_OPTION_NONE: Double = js.native
    
    /**
      * The notification setting is turned off.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_SETTING_DISABLED")
    @js.native
    val USER_NOTIFICATION_SETTING_DISABLED: Double = js.native
    
    /**
      * The notification setting is turned on.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_SETTING_ENABLED")
    @js.native
    val USER_NOTIFICATION_SETTING_ENABLED: Double = js.native
    
    /**
      * The application does not support this notification type.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_SETTING_NOT_SUPPORTED")
    @js.native
    val USER_NOTIFICATION_SETTING_NOT_SUPPORTED: Double = js.native
    
    /**
      * The application may display an alert upon a notification being received.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_TYPE_ALERT")
    @js.native
    val USER_NOTIFICATION_TYPE_ALERT: Double = js.native
    
    /**
      * The application may badge its icon upon a notification being received.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_TYPE_BADGE")
    @js.native
    val USER_NOTIFICATION_TYPE_BADGE: Double = js.native
    
    /**
      * The ability to play sounds for critical alerts.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_TYPE_CRITICAL_ALERT")
    @js.native
    val USER_NOTIFICATION_TYPE_CRITICAL_ALERT: Double = js.native
    
    /**
      * The application may not present any UI upon a notification being received.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_TYPE_NONE")
    @js.native
    val USER_NOTIFICATION_TYPE_NONE: Double = js.native
    
    /**
      * An option indicating the system should display a button for in-app notification settings.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_TYPE_PROVIDES_APP_NOTIFICATION_SETTINGS")
    @js.native
    val USER_NOTIFICATION_TYPE_PROVIDES_APP_NOTIFICATION_SETTINGS: Double = js.native
    
    /**
      * The ability to post non-interrupting notifications provisionally to the Notification Center.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_TYPE_PROVISIONAL")
    @js.native
    val USER_NOTIFICATION_TYPE_PROVISIONAL: Double = js.native
    
    /**
      * The application may play a sound upon a notification being received.
      * Use with the [types](UserNotificationSettings.types) property.
      */
    @JSGlobal("Titanium.App.iOS.USER_NOTIFICATION_TYPE_SOUND")
    @js.native
    val USER_NOTIFICATION_TYPE_SOUND: Double = js.native
    
    /**
      * Uniform type identifier for Mac OS icon images.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_APPLE_ICNS")
    @js.native
    val UTTYPE_APPLE_ICNS: String = js.native
    
    /**
      * Uniform type identifier for protected MPEG-4 audio (iTunes music store format).
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_APPLE_PROTECTED_MPEG4_AUDIO")
    @js.native
    val UTTYPE_APPLE_PROTECTED_MPEG4_AUDIO: String = js.native
    
    /**
      * Uniform type identifier for all audio content.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_AUDIO")
    @js.native
    val UTTYPE_AUDIO: String = js.native
    
    /**
      * Uniform type identifier for Windows bitmap images.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_BMP")
    @js.native
    val UTTYPE_BMP: String = js.native
    
    /**
      * Uniform type identifier for Rich Text with content embedding, pasteboard format.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_FLAT_RTFD")
    @js.native
    val UTTYPE_FLAT_RTFD: String = js.native
    
    /**
      * Uniform type identifier for GIF images.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_GIF")
    @js.native
    val UTTYPE_GIF: String = js.native
    
    /**
      * Uniform type identifier for HTML.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_HTML")
    @js.native
    val UTTYPE_HTML: String = js.native
    
    /**
      * Uniform type identifier for Windows icon images.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_ICO")
    @js.native
    val UTTYPE_ICO: String = js.native
    
    /**
      * Uniform type identifier for all image types.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_IMAGE")
    @js.native
    val UTTYPE_IMAGE: String = js.native
    
    /**
      * Uniform type identifier for JPEG images.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_JPEG")
    @js.native
    val UTTYPE_JPEG: String = js.native
    
    /**
      * Uniform type identifier for JPEG 2000 images.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_JPEG2000")
    @js.native
    val UTTYPE_JPEG2000: String = js.native
    
    /**
      * Uniform type identifier for all audiovisual content.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_MOVIE")
    @js.native
    val UTTYPE_MOVIE: String = js.native
    
    /**
      * Uniform type identifier for MP3 audio.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_MP3")
    @js.native
    val UTTYPE_MP3: String = js.native
    
    /**
      * Uniform type identifier for MPEG-1 and MPEG-2 content.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_MPEG")
    @js.native
    val UTTYPE_MPEG: String = js.native
    
    /**
      * Uniform type identifier for MPEG-4 content.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_MPEG4")
    @js.native
    val UTTYPE_MPEG4: String = js.native
    
    /**
      * Uniform type identifier for MPEG-4 audio.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_MPEG4_AUDIO")
    @js.native
    val UTTYPE_MPEG4_AUDIO: String = js.native
    
    /**
      * Uniform type identifier for PDF data.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_PDF")
    @js.native
    val UTTYPE_PDF: String = js.native
    
    /**
      * Uniform type identifier for PICT images.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_PICT")
    @js.native
    val UTTYPE_PICT: String = js.native
    
    /**
      * Uniform type identifier for a plain text type, equivalent to MIME type text/plain.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_PLAIN_TEXT")
    @js.native
    val UTTYPE_PLAIN_TEXT: String = js.native
    
    /**
      * Uniform type identifier for PNG images.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_PNG")
    @js.native
    val UTTYPE_PNG: String = js.native
    
    /**
      * Uniform type identifier for QuickTime images.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_QUICKTIME_IMAGE")
    @js.native
    val UTTYPE_QUICKTIME_IMAGE: String = js.native
    
    /**
      * Uniform type identifier for QuickTime movies.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_QUICKTIME_MOVIE")
    @js.native
    val UTTYPE_QUICKTIME_MOVIE: String = js.native
    
    /**
      * Uniform type identifier for Rich Text.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_RTF")
    @js.native
    val UTTYPE_RTF: String = js.native
    
    /**
      * Uniform type identifier for Rich Text Format Directory, that is, Rich Text with content embedding, on-disk format.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_RTFD")
    @js.native
    val UTTYPE_RTFD: String = js.native
    
    /**
      * Uniform type identifier for all text types.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_TEXT")
    @js.native
    val UTTYPE_TEXT: String = js.native
    
    /**
      * Uniform type identifier for TIFF images.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_TIFF")
    @js.native
    val UTTYPE_TIFF: String = js.native
    
    /**
      * Uniform type identifier for MLTE (Textension) format for mixed text and multimedia data.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_TXN_TEXT_AND_MULTIMEDIA_DATA")
    @js.native
    val UTTYPE_TXN_TEXT_AND_MULTIMEDIA_DATA: String = js.native
    
    /**
      * Uniform type identifier for Unicode-16 with byte-order mark (BOM), or if BOM is not present,
      * an external representation byte order (big-endian).
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_UTF16_EXTERNAL_PLAIN_TEXT")
    @js.native
    val UTTYPE_UTF16_EXTERNAL_PLAIN_TEXT: String = js.native
    
    /**
      * Uniform type identifier for Unicode-16, native byte order, with an optional byte-order mark (BOM).
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_UTF16_PLAIN_TEXT")
    @js.native
    val UTTYPE_UTF16_PLAIN_TEXT: String = js.native
    
    /**
      * Uniform type identifier for Unicode-8 plain text type.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_UTF8_PLAIN_TEXT")
    @js.native
    val UTTYPE_UTF8_PLAIN_TEXT: String = js.native
    
    /**
      * Uniform type identifier for all video content without audio.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_VIDEO")
    @js.native
    val UTTYPE_VIDEO: String = js.native
    
    /**
      * Uniform type identifier for WebKit webarchive format.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_WEB_ARCHIVE")
    @js.native
    val UTTYPE_WEB_ARCHIVE: String = js.native
    
    /**
      * Uniform type identifier for XML.
      */
    @JSGlobal("Titanium.App.iOS.UTTYPE_XML")
    @js.native
    val UTTYPE_XML: String = js.native
    
    /**
      * The UserActivity module is used to enable device Handoff and to create User Activities.
      */
    @JSGlobal("Titanium.App.iOS.UserActivity")
    @js.native
    class UserActivity ()
      extends typings.titanium.Titanium.App.iOS.UserActivity
    
    /**
      * An action the user selects in response to an interactive notification.
      */
    @JSGlobal("Titanium.App.iOS.UserNotificationAction")
    @js.native
    class UserNotificationAction ()
      extends typings.titanium.Titanium.App.iOS.UserNotificationAction
    
    /**
      * A set of notification actions to associate with a notification.
      */
    @JSGlobal("Titanium.App.iOS.UserNotificationCategory")
    @js.native
    class UserNotificationCategory ()
      extends typings.titanium.Titanium.App.iOS.UserNotificationCategory
    
    /**
      * The top-level App iOS Notification Center module. It is used to control scheduled notifications
      * and receive details about the system-wide notification settings.
      */
    @JSGlobal("Titanium.App.iOS.UserNotificationCenter")
    @js.native
    class UserNotificationCenter ()
      extends typings.titanium.Titanium.Proxy
    object UserNotificationCenter {
      
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Adds the specified callback as an event listener for the named event.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.addEventListener")
      @js.native
      def addEventListener: scala.Nothing = js.native
      @scala.inline
      def addEventListener_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
      
      /**
        * The name of the API that this proxy corresponds to.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.apiName")
      @js.native
      val apiName: String = js.native
      
      /**
        * Applies the properties to the proxy.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.applyProperties")
      @js.native
      def applyProperties: scala.Nothing = js.native
      @scala.inline
      def applyProperties_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applyProperties")(x.asInstanceOf[js.Any])
      
      /**
        * Indicates if the proxy will bubble an event to its parent.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.bubbleParent")
      @js.native
      def bubbleParent: scala.Nothing = js.native
      @scala.inline
      def bubbleParent_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
      
      /**
        * Fires a synthesized event to any registered listeners.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.fireEvent")
      @js.native
      def fireEvent: scala.Nothing = js.native
      @scala.inline
      def fireEvent_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fireEvent")(x.asInstanceOf[js.Any])
      
      /**
        * Gets the value of the <Titanium.App.iOS.UserNotificationCenter.apiName> property.
        * @deprecated Access <Titanium.App.iOS.UserNotificationCenter.apiName> instead.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.getApiName")
      @js.native
      def getApiName(): String = js.native
      
      /**
        * Gets the value of the <Titanium.App.iOS.UserNotificationCenter.bubbleParent> property.
        * @deprecated Access <Titanium.App.iOS.UserNotificationCenter.bubbleParent> instead.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.getBubbleParent")
      @js.native
      def getBubbleParent: scala.Nothing = js.native
      @scala.inline
      def getBubbleParent_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getBubbleParent")(x.asInstanceOf[js.Any])
      
      /**
        * Fetches the delivered notifications asynchronously.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.getDeliveredNotifications")
      @js.native
      def getDeliveredNotifications(callback: js.Function1[/* param0 */ UserNotificationCallbackResponse, Unit]): Unit = js.native
      
      /**
        * Fetches the pending notifications asynchronously.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.getPendingNotifications")
      @js.native
      def getPendingNotifications(callback: js.Function1[/* param0 */ UserNotificationCallbackResponse, Unit]): Unit = js.native
      
      /**
        * Removes the specified delivered notifications from the notification-center.
        * If no notifications are specified, all delivered notifications will be removed.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.removeDeliveredNotifications")
      @js.native
      def removeDeliveredNotifications(notifications: js.Array[UserNotificationDictionary]): Unit = js.native
      
      /**
        * Removes the specified callback as an event listener for the named event.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.removeEventListener")
      @js.native
      def removeEventListener: scala.Nothing = js.native
      @scala.inline
      def removeEventListener_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
      
      /**
        * Removes the specified pending notifications to prevent them from being triggered.
        * If no notifications are specified, all pending notifications will be removed.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.removePendingNotifications")
      @js.native
      def removePendingNotifications(notifications: js.Array[UserNotificationDictionary]): Unit = js.native
      
      /**
        * Notification types and user notification categories the application is registered to use.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings")
      @js.native
      def requestUserNotificationSettings(callback: js.Function1[/* param0 */ GetUserNotificationSettings, Unit]): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.App.iOS.UserNotificationCenter.bubbleParent> property.
        * @deprecated Set the value using <Titanium.App.iOS.UserNotificationCenter.bubbleParent> instead.
        */
      /* static member */
      @JSGlobal("Titanium.App.iOS.UserNotificationCenter.setBubbleParent")
      @js.native
      def setBubbleParent: scala.Nothing = js.native
      @scala.inline
      def setBubbleParent_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setBubbleParent")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_backgroundfetch(
      name: backgroundfetch,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSBackgroundfetchEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_backgroundtransfer(
      name: backgroundtransfer,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSBackgroundtransferEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_continueactivity(
      name: continueactivity,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSContinueactivityEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_downloadcompleted(
      name: downloadcompleted,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSDownloadcompletedEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_downloadprogress(
      name: downloadprogress,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSDownloadprogressEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_handleurl(
      name: handleurl,
      callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App.iOS, /* event */ iOSHandleurlEvent, Unit]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_localnotificationaction(
      name: localnotificationaction,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSLocalnotificationactionEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_notification(
      name: notification,
      callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App.iOS, /* event */ iOSNotificationEvent, Unit]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_remotenotificationaction(
      name: remotenotificationaction,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSRemotenotificationactionEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_screenshotcaptured(
      name: screenshotcaptured,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSScreenshotcapturedEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_sessioncompleted(
      name: sessioncompleted,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSSessioncompletedEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_sessioneventscompleted(
      name: sessioneventscompleted,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSSessioneventscompletedEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_shortcutitemclick(
      name: shortcutitemclick,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSShortcutitemclickEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_silentpush(
      name: silentpush,
      callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App.iOS, /* event */ iOSSilentpushEvent, Unit]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_traitcollectionchange(
      name: traitcollectionchange,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSTraitcollectionchangeEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_uploadprogress(
      name: uploadprogress,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSUploadprogressEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_usernotificationsettings(
      name: usernotificationsettings,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSUsernotificationsettingsEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.addEventListener")
    @js.native
    def addEventListener_watchkitextensionrequest(
      name: watchkitextensionrequest,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSWatchkitextensionrequestEvent, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Returns a URL to open the app's settings.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.applicationOpenSettingsURL")
    @js.native
    val applicationOpenSettingsURL: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Cancels all scheduled local notifications.
      * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.removePendingNotifications](Titanium.App.iOS.UserNotificationCenter.removePendingNotifications) instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.cancelAllLocalNotifications")
    @js.native
    def cancelAllLocalNotifications(): Unit = js.native
    
    @JSGlobal("Titanium.App.iOS.cancelLocalNotification")
    @js.native
    def cancelLocalNotification(id: String): Unit = js.native
    /**
      * Cancels a local notification.
      * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.removePendingNotifications](Titanium.App.iOS.UserNotificationCenter.removePendingNotifications) instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.cancelLocalNotification")
    @js.native
    def cancelLocalNotification(id: Double): Unit = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.SearchQuery>.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.createSearchQuery")
    @js.native
    def createSearchQuery(): typings.titanium.Titanium.App.iOS.SearchQuery = js.native
    @JSGlobal("Titanium.App.iOS.createSearchQuery")
    @js.native
    def createSearchQuery(parameters: Dictionary[typings.titanium.Titanium.App.iOS.SearchQuery]): typings.titanium.Titanium.App.iOS.SearchQuery = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.SearchableIndex>.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.createSearchableIndex")
    @js.native
    def createSearchableIndex(): typings.titanium.Titanium.App.iOS.SearchableIndex = js.native
    @JSGlobal("Titanium.App.iOS.createSearchableIndex")
    @js.native
    def createSearchableIndex(parameters: Dictionary[typings.titanium.Titanium.App.iOS.SearchableIndex]): typings.titanium.Titanium.App.iOS.SearchableIndex = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.SearchableItem>.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.createSearchableItem")
    @js.native
    def createSearchableItem(): typings.titanium.Titanium.App.iOS.SearchableItem = js.native
    @JSGlobal("Titanium.App.iOS.createSearchableItem")
    @js.native
    def createSearchableItem(parameters: Dictionary[typings.titanium.Titanium.App.iOS.SearchableItem]): typings.titanium.Titanium.App.iOS.SearchableItem = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.SearchableItemAttributeSet>.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.createSearchableItemAttributeSet")
    @js.native
    def createSearchableItemAttributeSet(): typings.titanium.Titanium.App.iOS.SearchableItemAttributeSet = js.native
    @JSGlobal("Titanium.App.iOS.createSearchableItemAttributeSet")
    @js.native
    def createSearchableItemAttributeSet(parameters: Dictionary[typings.titanium.Titanium.App.iOS.SearchableItemAttributeSet]): typings.titanium.Titanium.App.iOS.SearchableItemAttributeSet = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.UserActivity>.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.createUserActivity")
    @js.native
    def createUserActivity(): typings.titanium.Titanium.App.iOS.UserActivity = js.native
    @JSGlobal("Titanium.App.iOS.createUserActivity")
    @js.native
    def createUserActivity(parameters: Dictionary[typings.titanium.Titanium.App.iOS.UserActivity]): typings.titanium.Titanium.App.iOS.UserActivity = js.native
    
    /**
      * Creates and returns an instance of Titanium.App.iOS.UserDefaults.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.createUserDefaults")
    @js.native
    def createUserDefaults(parameters: Dictionary[UserDefaults]): UserDefaults = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.UserNotificationAction>.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.createUserNotificationAction")
    @js.native
    def createUserNotificationAction(): typings.titanium.Titanium.App.iOS.UserNotificationAction = js.native
    @JSGlobal("Titanium.App.iOS.createUserNotificationAction")
    @js.native
    def createUserNotificationAction(parameters: Dictionary[typings.titanium.Titanium.App.iOS.UserNotificationAction]): typings.titanium.Titanium.App.iOS.UserNotificationAction = js.native
    
    /**
      * Creates and returns an instance of <Titanium.App.iOS.UserNotificationCategory>.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.createUserNotificationCategory")
    @js.native
    def createUserNotificationCategory(): typings.titanium.Titanium.App.iOS.UserNotificationCategory = js.native
    @JSGlobal("Titanium.App.iOS.createUserNotificationCategory")
    @js.native
    def createUserNotificationCategory(parameters: Dictionary[typings.titanium.Titanium.App.iOS.UserNotificationCategory]): typings.titanium.Titanium.App.iOS.UserNotificationCategory = js.native
    
    /**
      * Notification types and user notification categories the application is registered to use.
      * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings](Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings) instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.currentUserNotificationSettings")
    @js.native
    val currentUserNotificationSettings: UserNotificationSettings = js.native
    
    /**
      * Marks the end of the app execution after initiating the download operation. Available only on iOS 7 and later.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.endBackgroundHandler")
    @js.native
    def endBackgroundHandler(handlerID: String): Unit = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_backgroundfetch(name: backgroundfetch): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_backgroundfetch(name: backgroundfetch, event: iOSBackgroundfetchEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_backgroundtransfer(name: backgroundtransfer): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_backgroundtransfer(name: backgroundtransfer, event: iOSBackgroundtransferEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_continueactivity(name: continueactivity): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_continueactivity(name: continueactivity, event: iOSContinueactivityEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_downloadcompleted(name: downloadcompleted): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_downloadcompleted(name: downloadcompleted, event: iOSDownloadcompletedEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_downloadprogress(name: downloadprogress): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_downloadprogress(name: downloadprogress, event: iOSDownloadprogressEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_handleurl(name: handleurl): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_handleurl(name: handleurl, event: iOSHandleurlEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_localnotificationaction(name: localnotificationaction): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_localnotificationaction(name: localnotificationaction, event: iOSLocalnotificationactionEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_notification(name: notification): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_notification(name: notification, event: iOSNotificationEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_remotenotificationaction(name: remotenotificationaction): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_remotenotificationaction(name: remotenotificationaction, event: iOSRemotenotificationactionEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_screenshotcaptured(name: screenshotcaptured): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_screenshotcaptured(name: screenshotcaptured, event: iOSScreenshotcapturedEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_sessioncompleted(name: sessioncompleted): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_sessioncompleted(name: sessioncompleted, event: iOSSessioncompletedEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_sessioneventscompleted(name: sessioneventscompleted): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_sessioneventscompleted(name: sessioneventscompleted, event: iOSSessioneventscompletedEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_shortcutitemclick(name: shortcutitemclick): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_shortcutitemclick(name: shortcutitemclick, event: iOSShortcutitemclickEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_silentpush(name: silentpush): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_silentpush(name: silentpush, event: iOSSilentpushEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_traitcollectionchange(name: traitcollectionchange): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_traitcollectionchange(name: traitcollectionchange, event: iOSTraitcollectionchangeEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_uploadprogress(name: uploadprogress): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_uploadprogress(name: uploadprogress, event: iOSUploadprogressEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_usernotificationsettings(name: usernotificationsettings): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_usernotificationsettings(name: usernotificationsettings, event: iOSUsernotificationsettingsEvent): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_watchkitextensionrequest(name: watchkitextensionrequest): Unit = js.native
    @JSGlobal("Titanium.App.iOS.fireEvent")
    @js.native
    def fireEvent_watchkitextensionrequest(name: watchkitextensionrequest, event: iOSWatchkitextensionrequestEvent): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.apiName> property.
      * @deprecated Access <Titanium.App.iOS.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.applicationOpenSettingsURL> property.
      * @deprecated Access <Titanium.App.iOS.applicationOpenSettingsURL> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.getApplicationOpenSettingsURL")
    @js.native
    def getApplicationOpenSettingsURL(): String = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.bubbleParent> property.
      * @deprecated Access <Titanium.App.iOS.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.currentUserNotificationSettings> property.
      * @deprecated Use [Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings](Titanium.App.iOS.UserNotificationCenter.requestUserNotificationSettings) instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.getCurrentUserNotificationSettings")
    @js.native
    def getCurrentUserNotificationSettings(): UserNotificationSettings = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.supportedUserActivityTypes> property.
      * @deprecated Access <Titanium.App.iOS.supportedUserActivityTypes> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.getSupportedUserActivityTypes")
    @js.native
    def getSupportedUserActivityTypes(): js.Array[String] = js.native
    
    /**
      * Gets the value of the <Titanium.App.iOS.userInterfaceStyle> property.
      * @deprecated Use <Titanium.UI.userInterfaceStyle> instead, which is supported cross-platform.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.getUserInterfaceStyle")
    @js.native
    def getUserInterfaceStyle(): Double = js.native
    
    /**
      * Registers a service to run when the application is placed in the background.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.registerBackgroundService")
    @js.native
    def registerBackgroundService(params: js.Any): typings.titanium.Titanium.App.iOS.BackgroundService = js.native
    
    /**
      * Registers the application to use the requested notification types and categories.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.registerUserNotificationSettings")
    @js.native
    def registerUserNotificationSettings(params: UserNotificationSettings): Unit = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_backgroundfetch(
      name: backgroundfetch,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSBackgroundfetchEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_backgroundtransfer(
      name: backgroundtransfer,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSBackgroundtransferEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_continueactivity(
      name: continueactivity,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSContinueactivityEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_downloadcompleted(
      name: downloadcompleted,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSDownloadcompletedEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_downloadprogress(
      name: downloadprogress,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSDownloadprogressEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_handleurl(
      name: handleurl,
      callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App.iOS, /* event */ iOSHandleurlEvent, Unit]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_localnotificationaction(
      name: localnotificationaction,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSLocalnotificationactionEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_notification(
      name: notification,
      callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App.iOS, /* event */ iOSNotificationEvent, Unit]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_remotenotificationaction(
      name: remotenotificationaction,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSRemotenotificationactionEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_screenshotcaptured(
      name: screenshotcaptured,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSScreenshotcapturedEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_sessioncompleted(
      name: sessioncompleted,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSSessioncompletedEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_sessioneventscompleted(
      name: sessioneventscompleted,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSSessioneventscompletedEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_shortcutitemclick(
      name: shortcutitemclick,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSShortcutitemclickEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_silentpush(
      name: silentpush,
      callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App.iOS, /* event */ iOSSilentpushEvent, Unit]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_traitcollectionchange(
      name: traitcollectionchange,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSTraitcollectionchangeEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_uploadprogress(
      name: uploadprogress,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSUploadprogressEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_usernotificationsettings(
      name: usernotificationsettings,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSUsernotificationsettingsEvent, 
          Unit
        ]
    ): Unit = js.native
    @JSGlobal("Titanium.App.iOS.removeEventListener")
    @js.native
    def removeEventListener_watchkitextensionrequest(
      name: watchkitextensionrequest,
      callback: js.ThisFunction1[
          /* this */ typings.titanium.Titanium.App.iOS, 
          /* event */ iOSWatchkitextensionrequestEvent, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Schedule a local notification.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.scheduleLocalNotification")
    @js.native
    def scheduleLocalNotification(params: NotificationParams): typings.titanium.Titanium.App.iOS.LocalNotification = js.native
    
    /**
      * Marks the end of an `openParentApplication:reply` execution by a WatchKit extension.
      * @deprecated Use [Titanium.WatchSession](Titanium.WatchSession) instead, which is supported on iOS 9 and later.
      *
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.sendWatchExtensionReply")
    @js.native
    def sendWatchExtensionReply(handlerId: String, userInfo: js.Any): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.App.iOS.bubbleParent> property.
      * @deprecated Set the value using <Titanium.App.iOS.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    /**
      * Specifies the minimum amount of time that must elapse between background fetch operations.
      * Available only on iOS 7 and later.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.setMinimumBackgroundFetchInterval")
    @js.native
    def setMinimumBackgroundFetchInterval(fetchInterval: Double): Unit = js.native
    
    /**
      * Provides an Array of the NSUserActivityTypes keys defined within your Titanium project.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.supportedUserActivityTypes")
    @js.native
    val supportedUserActivityTypes: js.Array[String] = js.native
    
    /**
      * The style associated with the user interface.
      * @deprecated Use <Titanium.UI.userInterfaceStyle> instead, which is supported cross-platform.
      */
    /* static member */
    @JSGlobal("Titanium.App.iOS.userInterfaceStyle")
    @js.native
    val userInterfaceStyle: Double = js.native
  }
  
  /**
    * Application ID, from `tiapp.xml`.
    */
  /* static member */
  @JSGlobal("Titanium.App.id")
  @js.native
  val id: String = js.native
  
  /**
    * Determines whether the screen is locked when the device is idle.
    */
  /* static member */
  @JSGlobal("Titanium.App.idleTimerDisabled")
  @js.native
  def idleTimerDisabled: Boolean = js.native
  @scala.inline
  def idleTimerDisabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idleTimerDisabled")(x.asInstanceOf[js.Any])
  
  /**
    * The install ID for this application.
    */
  /* static member */
  @JSGlobal("Titanium.App.installId")
  @js.native
  val installId: String = js.native
  
  /**
    * Indicates whether or not the soft keyboard is visible.
    */
  /* static member */
  @JSGlobal("Titanium.App.keyboardVisible")
  @js.native
  val keyboardVisible: Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.App.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Application name, determined by `tiapp.xml`.
    */
  /* static member */
  @JSGlobal("Titanium.App.name")
  @js.native
  val name: String = js.native
  
  /**
    * Determines whether proximity detection is enabled.
    */
  /* static member */
  @JSGlobal("Titanium.App.proximityDetection")
  @js.native
  def proximityDetection: Boolean = js.native
  @scala.inline
  def proximityDetection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("proximityDetection")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates the state of the device's proximity sensor, according to the
    * <Titanium.App.proximity> event.
    */
  /* static member */
  @JSGlobal("Titanium.App.proximityState")
  @js.native
  val proximityState: Boolean = js.native
  
  /**
    * Application publisher, from `tiapp.xml`.
    */
  /* static member */
  @JSGlobal("Titanium.App.publisher")
  @js.native
  val publisher: String = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_accessibilitychanged(
    name: accessibilitychanged,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.App, 
      /* event */ AppAccessibilitychangedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_close(
    name: close,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppCloseEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_keyboardframechanged(
    name: keyboardframechanged,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.App, 
      /* event */ AppKeyboardframechangedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_memorywarning(
    name: memorywarning,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppMemorywarningEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_pause(
    name: pause,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppPauseEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_paused(
    name: paused,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppPausedEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_proximity(
    name: proximity,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppProximityEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_resume(
    name: resume,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppResumeEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_resumed(
    name: resumed,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppResumedEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_shortcutitemclick(
    name: shortcutitemclick,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.App, 
      /* event */ AppShortcutitemclickEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_significanttimechange(
    name: significanttimechange,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.App, 
      /* event */ AppSignificanttimechangeEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_started(
    name: started,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppStartedEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_uncaughtException(
    name: uncaughtException,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.App, 
      /* event */ AppUncaughtExceptionEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.App.removeEventListener")
  @js.native
  def removeEventListener_userinteraction(
    name: userinteraction,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.App, /* event */ AppUserinteractionEvent, Unit]
  ): Unit = js.native
  
  /**
    * Unique session identifier for the current continuous run of the application.
    */
  /* static member */
  @JSGlobal("Titanium.App.sessionId")
  @js.native
  val sessionId: String = js.native
  
  /**
    * Sets the value of the <Titanium.App.bubbleParent> property.
    * @deprecated Set the value using <Titanium.App.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.disableNetworkActivityIndicator> property.
    * @deprecated Set the value using <Titanium.App.disableNetworkActivityIndicator> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.setDisableNetworkActivityIndicator")
  @js.native
  def setDisableNetworkActivityIndicator(disableNetworkActivityIndicator: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.forceSplashAsSnapshot> property.
    * @deprecated Set the value using <Titanium.App.forceSplashAsSnapshot> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.setForceSplashAsSnapshot")
  @js.native
  def setForceSplashAsSnapshot(forceSplashAsSnapshot: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.idleTimerDisabled> property.
    * @deprecated Set the value using <Titanium.App.idleTimerDisabled> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.setIdleTimerDisabled")
  @js.native
  def setIdleTimerDisabled(idleTimerDisabled: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.App.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.App.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.App.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.App.proximityDetection> property.
    * @deprecated Set the value using <Titanium.App.proximityDetection> instead.
    */
  /* static member */
  @JSGlobal("Titanium.App.setProximityDetection")
  @js.native
  def setProximityDetection(proximityDetection: Boolean): Unit = js.native
  
  /**
    * Indicates whether or not the user interaction shoud be tracked.
    */
  /* static member */
  @JSGlobal("Titanium.App.trackUserInteraction")
  @js.native
  def trackUserInteraction: Boolean = js.native
  @scala.inline
  def trackUserInteraction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trackUserInteraction")(x.asInstanceOf[js.Any])
  
  /**
    * Application URL, from `tiapp.xml`.
    */
  /* static member */
  @JSGlobal("Titanium.App.url")
  @js.native
  val url: String = js.native
  
  /**
    * Application version, from `tiapp.xml`.
    */
  /* static member */
  @JSGlobal("Titanium.App.version")
  @js.native
  val version: String = js.native
}
