package typings
package titaniumLib.TitaniumNs.AppNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.App")
@js.native
object AppNsMembers extends js.Object {
  /**
  		 * Convenience constant for system event "accessibilityannouncement".
  		 */
  val EVENT_ACCESSIBILITY_ANNOUNCEMENT: java.lang.String = js.native
  /**
  		 * Convenience constant for system event "accessibilitychanged".
  		 */
  val EVENT_ACCESSIBILITY_CHANGED: java.lang.String = js.native
  /**
  		 * Indicates whether Accessibility is enabled by the system.
  		 */
  val accessibilityEnabled: scala.Boolean = js.native
  /**
  		 * Indicates whether Analytics is enabled, determined by `tiapp.xml`.
  		 */
  val analytics: scala.Boolean = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * Application copyright statement, determined by `tiapp.xml`.
  		 */
  val copyright: java.lang.String = js.native
  /**
  		 * Build type that reflects how the application was packaged.
  		 * Returns one of the following values:
  		 * * `development` (Simulator)
  		 * * `test` (Device)
  		 * * `production` (App Store / Adhoc)
  		 */
  val deployType: java.lang.String = js.native
  /**
  		 * Application description, determined by `tiapp.xml`.
  		 */
  val description: java.lang.String = js.native
  /**
  		 * Prevents network activity indicator from being displayed.
  		 */
  var disableNetworkActivityIndicator: scala.Boolean = js.native
  /**
  		 * Shows the application's splash screen on app resume.
  		 */
  var forceSplashAsSnapshot: scala.Boolean = js.native
  /**
  		 * Application globally-unique ID, determined by `tiapp.xml`.
  		 */
  val guid: java.lang.String = js.native
  /**
  		 * Application ID, from `tiapp.xml`.
  		 */
  val id: java.lang.String = js.native
  /**
  		 * Determines whether the screen is locked when the device is idle.
  		 */
  var idleTimerDisabled: scala.Boolean = js.native
  /**
  		 * The install ID for this application.
  		 */
  val installId: java.lang.String = js.native
  /**
  		 * Indicates whether or not the soft keyboard is visible.
  		 */
  val keyboardVisible: scala.Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Application name, determined by `tiapp.xml`.
  		 */
  val name: java.lang.String = js.native
  /**
  		 * Determines whether proximity detection is enabled.
  		 */
  var proximityDetection: scala.Boolean = js.native
  /**
  		 * Indicates the state of the device's proximity sensor, according to the
  		 * <Titanium.App.proximity> event.
  		 */
  val proximityState: scala.Boolean = js.native
  /**
  		 * Application publisher, from `tiapp.xml`.
  		 */
  val publisher: java.lang.String = js.native
  /**
  		 * Unique session identifier for the current continuous run of the application.
  		 */
  val sessionId: java.lang.String = js.native
  /**
  		 * Application URL, from `tiapp.xml`.
  		 */
  val url: java.lang.String = js.native
  /**
  		 * Application version, from `tiapp.xml`.
  		 */
  val version: java.lang.String = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Fire a system-level event such as <Titanium.App.EVENT_ACCESSIBILITY_ANNOUNCEMENT>.
  		 */
  def fireSystemEvent(eventName: java.lang.String): scala.Unit = js.native
  def fireSystemEvent(eventName: java.lang.String, param: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.App.accessibilityEnabled> property.
  		 */
  def getAccessibilityEnabled(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.analytics> property.
  		 */
  def getAnalytics(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Returns the arguments passed to the application on startup.
  		 */
  def getArguments(): titaniumLib.launchOptions = js.native
  /**
  		 * Gets the value of the <Titanium.App.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.copyright> property.
  		 */
  def getCopyright(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.App.deployType> property.
  		 */
  def getDeployType(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.App.description> property.
  		 */
  def getDescription(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.App.disableNetworkActivityIndicator> property.
  		 */
  def getDisableNetworkActivityIndicator(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.forceSplashAsSnapshot> property.
  		 */
  def getForceSplashAsSnapshot(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.guid> property.
  		 */
  def getGuid(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.App.id> property.
  		 */
  def getId(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.App.idleTimerDisabled> property.
  		 */
  def getIdleTimerDisabled(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.installId> property.
  		 */
  def getInstallId(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.App.keyboardVisible> property.
  		 */
  def getKeyboardVisible(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.App.name> property.
  		 */
  def getName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.App.proximityDetection> property.
  		 */
  def getProximityDetection(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.proximityState> property.
  		 */
  def getProximityState(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.App.publisher> property.
  		 */
  def getPublisher(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.App.sessionId> property.
  		 */
  def getSessionId(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.App.url> property.
  		 */
  def getUrl(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.App.version> property.
  		 */
  def getVersion(): java.lang.String = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.disableNetworkActivityIndicator> property.
  		 */
  def setDisableNetworkActivityIndicator(disableNetworkActivityIndicator: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.forceSplashAsSnapshot> property.
  		 */
  def setForceSplashAsSnapshot(forceSplashAsSnapshot: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.idleTimerDisabled> property.
  		 */
  def setIdleTimerDisabled(idleTimerDisabled: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.App.proximityDetection> property.
  		 */
  def setProximityDetection(proximityDetection: scala.Boolean): scala.Unit = js.native
}

