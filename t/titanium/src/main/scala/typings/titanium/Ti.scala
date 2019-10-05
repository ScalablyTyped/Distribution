package typings.titanium

import typings.titanium.Titanium.Buffer
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ti")
@js.native
object Ti extends js.Object {
  /**
  	 * The top-level API module, containing methods to output messages to the system log.
  	 */
  val API: TypeofAPI = js.native
  /**
  	 * The top-level Accelerometer module, used to determine the device's physical position.
  	 */
  val Accelerometer: TypeofAccelerometer = js.native
  /**
  	 * Used for transmitting developer-defined Analytics events to the Appcelerator Analytics product.
  	 */
  val Analytics: TypeofAnalytics = js.native
  /**
  	 * The top-level Android module.
  	 */
  val Android: TypeofAndroidACTIONAIRPLANEMODECHANGED = js.native
  /**
  	 * The top-level App module is mainly used for accessing information about the
  	 * application at runtime, and for sending or listening for system events.
  	 */
  val App: TypeofApp = js.native
  /**
  	 * The Calendar module provides an API for accessing the native calendar functionality.
  	 */
  val Calendar: TypeofCalendarATTENDEEROLECHAIR = js.native
  /**
  	 * A module for translating between primitive types and raw byte streams.
  	 */
  val Codec: TypeofCodec = js.native
  /**
  	 * The top-level Contacts module, used for accessing and modifying the system contacts address book.
  	 */
  val Contacts: TypeofContacts = js.native
  /**
  	 * The top-level `Database` module, used for creating and accessing the
  	 * in-application SQLite database.
  	 */
  val Database: TypeofDatabase = js.native
  /**
  	 * The top level filesystem module, used to access files and directories on the device.
  	 */
  val Filesystem: TypeofFilesystem = js.native
  /**
  	 * The top level Geolocation module. The Geolocation module is used for accessing device location based information.
  	 */
  val Geolocation: TypeofGeolocation = js.native
  /**
  	 * The Gesture module is responsible for high-level device gestures such as orientation changes
  	 * and shake gestures.
  	 */
  val Gesture: TypeofGesture = js.native
  /**
  	 * The top level Locale module.
  	 */
  val Locale: TypeofLocale = js.native
  /**
  	 * The top-level Media module.
  	 */
  val Media: TypeofMedia = js.native
  /**
  	 * Base type for all Titanium modules.
  	 */
  val Module: TypeofModule = js.native
  /**
  	 * The top level network module.
  	 */
  val Network: TypeofNetwork = js.native
  /**
  	 * The top-level Platform module.  The Platform module is used to access the device's platform-related
  	 * functionality.
  	 */
  val Platform: TypeofPlatform = js.native
  /**
  	 * Stream module containing stream utility methods.
  	 */
  val Stream: TypeofStream = js.native
  /**
  	 * The main <Titanium.UI> module.
  	 */
  val UI: TypeofUI = js.native
  /**
  	 * The top-level Utils module, containing a set of JavaScript methods that are often useful when
  	 * building applications.
  	 */
  val Utils: TypeofUtils = js.native
  /**
  	 * Used to enable data and file transfers between a watchOS and iOS application.
  	 */
  val WatchSession: TypeofWatchSession = js.native
  /**
  	 * The top level XML module.  The XML module is used for parsing and processing XML-based content.
  	 */
  val XML: TypeofXML = js.native
  /**
  	 * The top level Yahoo module.  The Yahoo module is used for accessing Yahoo related API services.
  	 */
  val Yahoo: TypeofYahoo = js.native
  /**
  	 * The name of the API that this proxy corresponds to.
  	 */
  val apiName: String = js.native
  /**
  	 * Indicates if the proxy will bubble an event to its parent.
  	 */
  var bubbleParent: Boolean = js.native
  /**
  	 * Date of the Titanium build.
  	 */
  val buildDate: String = js.native
  /**
  	 * Git hash of the Titanium build.
  	 */
  val buildHash: String = js.native
  /**
  	 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  	 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  	 * User-agent string used by Titanium.
  	 */
  var userAgent: String = js.native
  /**
  	 * Version of Titanium that is executing.
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
  	 * Creates a new buffer based on the params.
  	 */
  def createBuffer(params: CreateBufferArgs): Buffer = js.native
  /**
  	 * Creates and returns an instance of <Titanium.Proxy>.
  	 */
  def createProxy(): Proxy = js.native
  def createProxy(parameters: js.Any): Proxy = js.native
  /**
  	 * Fires a synthesized event to any registered listeners.
  	 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  	 * Gets the value of the <Titanium.apiName> property.
  	 */
  def getApiName(): String = js.native
  /**
  	 * Gets the value of the <Titanium.bubbleParent> property.
  	 */
  def getBubbleParent(): Boolean = js.native
  /**
  	 * Gets the value of the <Titanium.buildDate> property.
  	 */
  def getBuildDate(): String = js.native
  /**
  	 * Gets the value of the <Titanium.buildHash> property.
  	 */
  def getBuildHash(): String = js.native
  /**
  	 * Gets the value of the <Titanium.lifecycleContainer> property.
  	 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  	 * Gets the value of the <Titanium.userAgent> property.
  	 */
  def getUserAgent(): String = js.native
  /**
  	 * Gets the value of the <Titanium.version> property.
  	 */
  def getVersion(): String = js.native
  /**
  	 * Removes the specified callback as an event listener for the named event.
  	 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  	 * Sets the value of the <Titanium.bubbleParent> property.
  	 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  	 * Sets the value of the <Titanium.lifecycleContainer> property.
  	 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  	 * Sets the value of the <Titanium.lifecycleContainer> property.
  	 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  	 * Sets the value of the <Titanium.userAgent> property.
  	 */
  def setUserAgent(userAgent: String): Unit = js.native
}

