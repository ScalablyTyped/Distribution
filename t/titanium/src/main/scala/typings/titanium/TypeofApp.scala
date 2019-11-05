package typings.titanium

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofApp extends js.Object {
  /**
  		 * A module used to access Android application resources.
  		 */
  val Android: TypeofAndroidAddEventListener = js.native
  /**
  		 * Convenience constant for system event "accessibilityannouncement".
  		 */
  val EVENT_ACCESSIBILITY_ANNOUNCEMENT: String = js.native
  /**
  		 * Convenience constant for system event "accessibilitychanged".
  		 */
  val EVENT_ACCESSIBILITY_CHANGED: String = js.native
  /**
  		 * The App Properties module is used for storing application-related data in property/value pairs
  		 * that persist beyond application sessions and device power cycles.
  		 */
  val Properties: TypeofProperties = js.native
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
  		 * The top-level App iOS module, available only to iOS devices, that includes the facilities to
  		 * create and manage local notifications and background services.
  		 */
  val iOS: TypeofiOSAddEventListener = js.native
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
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
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
  		 * Fire a system-level event such as <Titanium.App.EVENT_ACCESSIBILITY_ANNOUNCEMENT>.
  		 */
  def fireSystemEvent(eventName: String): Unit = js.native
  def fireSystemEvent(eventName: String, param: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.App.accessibilityEnabled> property.
  		 */
  def getAccessibilityEnabled(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.analytics> property.
  		 */
  def getAnalytics(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Returns the arguments passed to the application on startup.
  		 */
  def getArguments(): launchOptions = js.native
  /**
  		 * Gets the value of the <Titanium.App.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.copyright> property.
  		 */
  def getCopyright(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.deployType> property.
  		 */
  def getDeployType(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.description> property.
  		 */
  def getDescription(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.disableNetworkActivityIndicator> property.
  		 */
  def getDisableNetworkActivityIndicator(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.forceSplashAsSnapshot> property.
  		 */
  def getForceSplashAsSnapshot(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.guid> property.
  		 */
  def getGuid(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.id> property.
  		 */
  def getId(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.idleTimerDisabled> property.
  		 */
  def getIdleTimerDisabled(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.installId> property.
  		 */
  def getInstallId(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.keyboardVisible> property.
  		 */
  def getKeyboardVisible(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.App.name> property.
  		 */
  def getName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.proximityDetection> property.
  		 */
  def getProximityDetection(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.proximityState> property.
  		 */
  def getProximityState(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.publisher> property.
  		 */
  def getPublisher(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.sessionId> property.
  		 */
  def getSessionId(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.url> property.
  		 */
  def getUrl(): String = js.native
  /**
  		 * Gets the value of the <Titanium.App.version> property.
  		 */
  def getVersion(): String = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.disableNetworkActivityIndicator> property.
  		 */
  def setDisableNetworkActivityIndicator(disableNetworkActivityIndicator: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.forceSplashAsSnapshot> property.
  		 */
  def setForceSplashAsSnapshot(forceSplashAsSnapshot: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.idleTimerDisabled> property.
  		 */
  def setIdleTimerDisabled(idleTimerDisabled: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.proximityDetection> property.
  		 */
  def setProximityDetection(proximityDetection: Boolean): Unit = js.native
}

