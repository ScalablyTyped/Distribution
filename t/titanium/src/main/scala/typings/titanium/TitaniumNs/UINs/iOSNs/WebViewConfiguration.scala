package typings.titanium.TitaniumNs.UINs.iOSNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import typings.titanium.WebViewPreferencesObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A collection of properties used to initialize a web view.
			 */
trait WebViewConfiguration extends Proxy {
  /**
  				 * A Boolean value indicating whether AirPlay is allowed.
  				 */
  var allowsAirPlayMediaPlayback: Boolean
  /**
  				 * A Boolean value indicating whether HTML5 videos play inline or use the native full-screen controller.
  				 */
  var allowsInlineMediaPlayback: Boolean
  /**
  				 * A Boolean value indicating whether HTML5 videos can play picture-in-picture.
  				 */
  var allowsPictureInPictureMediaPlayback: Boolean
  /**
  				 * Determines which media types require a user gesture to begin playing.
  				 */
  var mediaTypesRequiringUserActionForPlayback: Double
  /**
  				 * The preference settings to be used by the web view.
  				 */
  var preferences: WebViewPreferencesObject
  /**
  				 * The process pool from which to obtain the  Web Content process of view.
  				 */
  var processPool: WebViewProcessPool
  /**
  				 * The level of granularity with which the user can interactively select content in the web view.
  				 */
  var selectionGranularity: Double
  /**
  				 * A Boolean value indicating whether the web view suppresses content rendering until it is fully
  				 * loaded into memory.
  				 */
  var suppressesIncrementalRendering: Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsAirPlayMediaPlayback> property.
  				 */
  def getAllowsAirPlayMediaPlayback(): Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsInlineMediaPlayback> property.
  				 */
  def getAllowsInlineMediaPlayback(): Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsPictureInPictureMediaPlayback> property.
  				 */
  def getAllowsPictureInPictureMediaPlayback(): Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.mediaTypesRequiringUserActionForPlayback> property.
  				 */
  def getMediaTypesRequiringUserActionForPlayback(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.preferences> property.
  				 */
  def getPreferences(): WebViewPreferencesObject
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.processPool> property.
  				 */
  def getProcessPool(): WebViewProcessPool
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.selectionGranularity> property.
  				 */
  def getSelectionGranularity(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.suppressesIncrementalRendering> property.
  				 */
  def getSuppressesIncrementalRendering(): Boolean
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsAirPlayMediaPlayback> property.
  				 */
  def setAllowsAirPlayMediaPlayback(allowsAirPlayMediaPlayback: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsInlineMediaPlayback> property.
  				 */
  def setAllowsInlineMediaPlayback(allowsInlineMediaPlayback: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsPictureInPictureMediaPlayback> property.
  				 */
  def setAllowsPictureInPictureMediaPlayback(allowsPictureInPictureMediaPlayback: Boolean): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.mediaTypesRequiringUserActionForPlayback> property.
  				 */
  def setMediaTypesRequiringUserActionForPlayback(mediaTypesRequiringUserActionForPlayback: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.preferences> property.
  				 */
  def setPreferences(preferences: WebViewPreferencesObject): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.processPool> property.
  				 */
  def setProcessPool(processPool: WebViewProcessPool): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.selectionGranularity> property.
  				 */
  def setSelectionGranularity(selectionGranularity: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.suppressesIncrementalRendering> property.
  				 */
  def setSuppressesIncrementalRendering(suppressesIncrementalRendering: Boolean): Unit
}

object WebViewConfiguration {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    allowsAirPlayMediaPlayback: Boolean,
    allowsInlineMediaPlayback: Boolean,
    allowsPictureInPictureMediaPlayback: Boolean,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getAllowsAirPlayMediaPlayback: () => Boolean,
    getAllowsInlineMediaPlayback: () => Boolean,
    getAllowsPictureInPictureMediaPlayback: () => Boolean,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getMediaTypesRequiringUserActionForPlayback: () => Double,
    getPreferences: () => WebViewPreferencesObject,
    getProcessPool: () => WebViewProcessPool,
    getSelectionGranularity: () => Double,
    getSuppressesIncrementalRendering: () => Boolean,
    mediaTypesRequiringUserActionForPlayback: Double,
    preferences: WebViewPreferencesObject,
    processPool: WebViewProcessPool,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    selectionGranularity: Double,
    setAllowsAirPlayMediaPlayback: Boolean => Unit,
    setAllowsInlineMediaPlayback: Boolean => Unit,
    setAllowsPictureInPictureMediaPlayback: Boolean => Unit,
    setBubbleParent: Boolean => Unit,
    setMediaTypesRequiringUserActionForPlayback: Double => Unit,
    setPreferences: WebViewPreferencesObject => Unit,
    setProcessPool: WebViewProcessPool => Unit,
    setSelectionGranularity: Double => Unit,
    setSuppressesIncrementalRendering: Boolean => Unit,
    suppressesIncrementalRendering: Boolean,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): WebViewConfiguration = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), allowsAirPlayMediaPlayback = allowsAirPlayMediaPlayback, allowsInlineMediaPlayback = allowsInlineMediaPlayback, allowsPictureInPictureMediaPlayback = allowsPictureInPictureMediaPlayback, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getAllowsAirPlayMediaPlayback = js.Any.fromFunction0(getAllowsAirPlayMediaPlayback), getAllowsInlineMediaPlayback = js.Any.fromFunction0(getAllowsInlineMediaPlayback), getAllowsPictureInPictureMediaPlayback = js.Any.fromFunction0(getAllowsPictureInPictureMediaPlayback), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getMediaTypesRequiringUserActionForPlayback = js.Any.fromFunction0(getMediaTypesRequiringUserActionForPlayback), getPreferences = js.Any.fromFunction0(getPreferences), getProcessPool = js.Any.fromFunction0(getProcessPool), getSelectionGranularity = js.Any.fromFunction0(getSelectionGranularity), getSuppressesIncrementalRendering = js.Any.fromFunction0(getSuppressesIncrementalRendering), mediaTypesRequiringUserActionForPlayback = mediaTypesRequiringUserActionForPlayback, preferences = preferences, processPool = processPool, removeEventListener = js.Any.fromFunction2(removeEventListener), selectionGranularity = selectionGranularity, setAllowsAirPlayMediaPlayback = js.Any.fromFunction1(setAllowsAirPlayMediaPlayback), setAllowsInlineMediaPlayback = js.Any.fromFunction1(setAllowsInlineMediaPlayback), setAllowsPictureInPictureMediaPlayback = js.Any.fromFunction1(setAllowsPictureInPictureMediaPlayback), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setMediaTypesRequiringUserActionForPlayback = js.Any.fromFunction1(setMediaTypesRequiringUserActionForPlayback), setPreferences = js.Any.fromFunction1(setPreferences), setProcessPool = js.Any.fromFunction1(setProcessPool), setSelectionGranularity = js.Any.fromFunction1(setSelectionGranularity), setSuppressesIncrementalRendering = js.Any.fromFunction1(setSuppressesIncrementalRendering), suppressesIncrementalRendering = suppressesIncrementalRendering)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[WebViewConfiguration]
  }
}

