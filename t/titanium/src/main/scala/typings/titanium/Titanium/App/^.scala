package typings.titanium.Titanium.App

import typings.titanium.Titanium.App.iOS.BackgroundService
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
import typings.titanium.launchOptions
import typings.titanium.titaniumStrings.accessibilitychanged
import typings.titanium.titaniumStrings.close
import typings.titanium.titaniumStrings.keyboardframechanged
import typings.titanium.titaniumStrings.memorywarning
import typings.titanium.titaniumStrings.pause
import typings.titanium.titaniumStrings.paused
import typings.titanium.titaniumStrings.proximity
import typings.titanium.titaniumStrings.resume
import typings.titanium.titaniumStrings.resumed
import typings.titanium.titaniumStrings.shortcutitemclick
import typings.titanium.titaniumStrings.significanttimechange
import typings.titanium.titaniumStrings.started
import typings.titanium.titaniumStrings.uncaughtException
import typings.titanium.titaniumStrings.userinteraction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.App")
@js.native
object ^ extends js.Object {
  /**
  		 * Indicates whether Accessibility is enabled by the system.
  		 */
  val accessibilityEnabled: Boolean = js.native
  /**
  		 * Indicates whether Analytics is enabled, determined by `tiapp.xml`.
  		 */
  val analytics: Boolean = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * Application copyright statement, determined by `tiapp.xml`.
  		 */
  val copyright: String = js.native
  /**
  		 * A reference to the currnet background service running when the application is placed in the background.
  		 */
  val currentService: BackgroundService = js.native
  /**
  		 * Build type that reflects how the application was packaged.
  		 * Returns one of the following values:
  		 * * `development` (Simulator)
  		 * * `test` (Device)
  		 * * `production` (App Store / Adhoc)
  		 */
  val deployType: String = js.native
  /**
  		 * Application description, determined by `tiapp.xml`.
  		 */
  val description: String = js.native
  /**
  		 * Prevents network activity indicator from being displayed.
  		 */
  var disableNetworkActivityIndicator: Boolean = js.native
  /**
  		 * Shows the application's splash screen on app resume.
  		 */
  var forceSplashAsSnapshot: Boolean = js.native
  /**
  		 * Application globally-unique ID, determined by `tiapp.xml`.
  		 */
  val guid: String = js.native
  /**
  		 * Application ID, from `tiapp.xml`.
  		 */
  val id: String = js.native
  /**
  		 * Determines whether the screen is locked when the device is idle.
  		 */
  var idleTimerDisabled: Boolean = js.native
  /**
  		 * The install ID for this application.
  		 */
  val installId: String = js.native
  /**
  		 * Indicates whether or not the soft keyboard is visible.
  		 */
  val keyboardVisible: Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Application name, determined by `tiapp.xml`.
  		 */
  val name: String = js.native
  /**
  		 * Determines whether proximity detection is enabled.
  		 */
  var proximityDetection: Boolean = js.native
  /**
  		 * Indicates the state of the device's proximity sensor, according to the
  		 * <Titanium.App.proximity> event.
  		 */
  val proximityState: Boolean = js.native
  /**
  		 * Application publisher, from `tiapp.xml`.
  		 */
  val publisher: String = js.native
  /**
  		 * Unique session identifier for the current continuous run of the application.
  		 */
  val sessionId: String = js.native
  /**
  		 * Indicates whether or not the user interaction shoud be tracked.
  		 */
  var trackUserInteraction: Boolean = js.native
  /**
  		 * Application URL, from `tiapp.xml`.
  		 */
  val url: String = js.native
  /**
  		 * Application version, from `tiapp.xml`.
  		 */
  val version: String = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  @JSName("addEventListener")
  def addEventListener_accessibilitychanged(
    name: accessibilitychanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppAccessibilitychangedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(name: close, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppCloseEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyboardframechanged(
    name: keyboardframechanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppKeyboardframechangedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_memorywarning(
    name: memorywarning,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppMemorywarningEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(name: pause, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppPauseEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paused(name: paused, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppPausedEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_proximity(
    name: proximity,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppProximityEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(name: resume, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppResumeEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resumed(name: resumed, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppResumedEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortcutitemclick(
    name: shortcutitemclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppShortcutitemclickEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_significanttimechange(
    name: significanttimechange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppSignificanttimechangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_started(name: started, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppStartedEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_uncaughtException(
    name: uncaughtException,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppUncaughtExceptionEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_userinteraction(
    name: userinteraction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppUserinteractionEvent, Unit]
  ): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  @JSName("fireEvent")
  def fireEvent_accessibilitychanged(name: accessibilitychanged): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_accessibilitychanged(name: accessibilitychanged, event: AppAccessibilitychangedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_close(name: close, event: AppCloseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keyboardframechanged(name: keyboardframechanged): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keyboardframechanged(name: keyboardframechanged, event: AppKeyboardframechangedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_memorywarning(name: memorywarning): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_memorywarning(name: memorywarning, event: AppMemorywarningEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pause(name: pause): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pause(name: pause, event: AppPauseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_paused(name: paused): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_paused(name: paused, event: AppPausedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_proximity(name: proximity): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_proximity(name: proximity, event: AppProximityEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume, event: AppResumeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resumed(name: resumed): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resumed(name: resumed, event: AppResumedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_shortcutitemclick(name: shortcutitemclick): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_shortcutitemclick(name: shortcutitemclick, event: AppShortcutitemclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_significanttimechange(name: significanttimechange): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_significanttimechange(name: significanttimechange, event: AppSignificanttimechangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_started(name: started): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_started(name: started, event: AppStartedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_uncaughtException(name: uncaughtException): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_uncaughtException(name: uncaughtException, event: AppUncaughtExceptionEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_userinteraction(name: userinteraction): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_userinteraction(name: userinteraction, event: AppUserinteractionEvent): Unit = js.native
  /**
  		 * Fire a system-level event such as <Titanium.App.EVENT_ACCESSIBILITY_ANNOUNCEMENT>.
  		 */
  def fireSystemEvent(eventName: String): Unit = js.native
  def fireSystemEvent(eventName: String, param: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.App.accessibilityEnabled> property.
  		 * @deprecated Access <Titanium.App.accessibilityEnabled> instead.
  		 */
  def getAccessibilityEnabled(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.analytics> property.
  		 * @deprecated Access <Titanium.App.analytics> instead.
  		 */
  def getAnalytics(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.apiName> property.
  		 * @deprecated Access <Titanium.App.apiName> instead.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Returns the arguments passed to the application on startup.
  		 */
  def getArguments(): launchOptions = js.native
  /**
  		 * Gets the value of the <Titanium.App.bubbleParent> property.
  		 * @deprecated Access <Titanium.App.bubbleParent> instead.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.copyright> property.
  		 * @deprecated Access <Titanium.App.copyright> instead.
  		 */
  def getCopyright(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.currentService> property.
  		 * @deprecated Access <Titanium.App.currentService> instead.
  		 */
  def getCurrentService(): BackgroundService = js.native
  /**
  		 * Gets the value of the <Titanium.App.deployType> property.
  		 * @deprecated Access <Titanium.App.deployType> instead.
  		 */
  def getDeployType(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.description> property.
  		 * @deprecated Access <Titanium.App.description> instead.
  		 */
  def getDescription(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.disableNetworkActivityIndicator> property.
  		 * @deprecated Access <Titanium.App.disableNetworkActivityIndicator> instead.
  		 */
  def getDisableNetworkActivityIndicator(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.forceSplashAsSnapshot> property.
  		 * @deprecated Access <Titanium.App.forceSplashAsSnapshot> instead.
  		 */
  def getForceSplashAsSnapshot(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.guid> property.
  		 * @deprecated Access <Titanium.App.guid> instead.
  		 */
  def getGuid(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.id> property.
  		 * @deprecated Access <Titanium.App.id> instead.
  		 */
  def getId(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.idleTimerDisabled> property.
  		 * @deprecated Access <Titanium.App.idleTimerDisabled> instead.
  		 */
  def getIdleTimerDisabled(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.installId> property.
  		 * @deprecated Access <Titanium.App.installId> instead.
  		 */
  def getInstallId(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.keyboardVisible> property.
  		 * @deprecated Access <Titanium.App.keyboardVisible> instead.
  		 */
  def getKeyboardVisible(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.lifecycleContainer> property.
  		 * @deprecated Access <Titanium.App.lifecycleContainer> instead.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.App.name> property.
  		 * @deprecated Access <Titanium.App.name> instead.
  		 */
  def getName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.proximityDetection> property.
  		 * @deprecated Access <Titanium.App.proximityDetection> instead.
  		 */
  def getProximityDetection(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.proximityState> property.
  		 * @deprecated Access <Titanium.App.proximityState> instead.
  		 */
  def getProximityState(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.publisher> property.
  		 * @deprecated Access <Titanium.App.publisher> instead.
  		 */
  def getPublisher(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.sessionId> property.
  		 * @deprecated Access <Titanium.App.sessionId> instead.
  		 */
  def getSessionId(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.url> property.
  		 * @deprecated Access <Titanium.App.url> instead.
  		 */
  def getUrl(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.version> property.
  		 * @deprecated Access <Titanium.App.version> instead.
  		 */
  def getVersion(): String = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  @JSName("removeEventListener")
  def removeEventListener_accessibilitychanged(
    name: accessibilitychanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppAccessibilitychangedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(name: close, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppCloseEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyboardframechanged(
    name: keyboardframechanged,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppKeyboardframechangedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_memorywarning(
    name: memorywarning,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppMemorywarningEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(name: pause, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppPauseEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paused(name: paused, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppPausedEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_proximity(
    name: proximity,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppProximityEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(name: resume, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppResumeEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resumed(name: resumed, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppResumedEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shortcutitemclick(
    name: shortcutitemclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppShortcutitemclickEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_significanttimechange(
    name: significanttimechange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppSignificanttimechangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_started(name: started, callback: js.ThisFunction1[/* this */ this.type, /* event */ AppStartedEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_uncaughtException(
    name: uncaughtException,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppUncaughtExceptionEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_userinteraction(
    name: userinteraction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AppUserinteractionEvent, Unit]
  ): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.bubbleParent> property.
  		 * @deprecated Set the value using <Titanium.App.bubbleParent> instead.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.disableNetworkActivityIndicator> property.
  		 * @deprecated Set the value using <Titanium.App.disableNetworkActivityIndicator> instead.
  		 */
  def setDisableNetworkActivityIndicator(disableNetworkActivityIndicator: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.forceSplashAsSnapshot> property.
  		 * @deprecated Set the value using <Titanium.App.forceSplashAsSnapshot> instead.
  		 */
  def setForceSplashAsSnapshot(forceSplashAsSnapshot: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.idleTimerDisabled> property.
  		 * @deprecated Set the value using <Titanium.App.idleTimerDisabled> instead.
  		 */
  def setIdleTimerDisabled(idleTimerDisabled: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.lifecycleContainer> property.
  		 * @deprecated Set the value using <Titanium.App.lifecycleContainer> instead.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.proximityDetection> property.
  		 * @deprecated Set the value using <Titanium.App.proximityDetection> instead.
  		 */
  def setProximityDetection(proximityDetection: Boolean): Unit = js.native
}

