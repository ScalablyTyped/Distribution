package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A collection of properties used to initialize a web view.
			 */
trait WebViewConfiguration
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * A Boolean value indicating whether AirPlay is allowed.
  				 */
  var allowsAirPlayMediaPlayback: scala.Boolean
  /**
  				 * A Boolean value indicating whether HTML5 videos play inline or use the native full-screen controller.
  				 */
  var allowsInlineMediaPlayback: scala.Boolean
  /**
  				 * A Boolean value indicating whether HTML5 videos can play picture-in-picture.
  				 */
  var allowsPictureInPictureMediaPlayback: scala.Boolean
  /**
  				 * Determines which media types require a user gesture to begin playing.
  				 */
  var mediaTypesRequiringUserActionForPlayback: scala.Double
  /**
  				 * The preference settings to be used by the web view.
  				 */
  var preferences: titaniumLib.WebViewPreferencesObject
  /**
  				 * The process pool from which to obtain the  Web Content process of view.
  				 */
  var processPool: WebViewProcessPool
  /**
  				 * The level of granularity with which the user can interactively select content in the web view.
  				 */
  var selectionGranularity: scala.Double
  /**
  				 * A Boolean value indicating whether the web view suppresses content rendering until it is fully
  				 * loaded into memory.
  				 */
  var suppressesIncrementalRendering: scala.Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsAirPlayMediaPlayback> property.
  				 */
  def getAllowsAirPlayMediaPlayback(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsInlineMediaPlayback> property.
  				 */
  def getAllowsInlineMediaPlayback(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsPictureInPictureMediaPlayback> property.
  				 */
  def getAllowsPictureInPictureMediaPlayback(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.mediaTypesRequiringUserActionForPlayback> property.
  				 */
  def getMediaTypesRequiringUserActionForPlayback(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.preferences> property.
  				 */
  def getPreferences(): titaniumLib.WebViewPreferencesObject
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.processPool> property.
  				 */
  def getProcessPool(): WebViewProcessPool
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.selectionGranularity> property.
  				 */
  def getSelectionGranularity(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.suppressesIncrementalRendering> property.
  				 */
  def getSuppressesIncrementalRendering(): scala.Boolean
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsAirPlayMediaPlayback> property.
  				 */
  def setAllowsAirPlayMediaPlayback(allowsAirPlayMediaPlayback: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsInlineMediaPlayback> property.
  				 */
  def setAllowsInlineMediaPlayback(allowsInlineMediaPlayback: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsPictureInPictureMediaPlayback> property.
  				 */
  def setAllowsPictureInPictureMediaPlayback(allowsPictureInPictureMediaPlayback: scala.Boolean): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.mediaTypesRequiringUserActionForPlayback> property.
  				 */
  def setMediaTypesRequiringUserActionForPlayback(mediaTypesRequiringUserActionForPlayback: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.preferences> property.
  				 */
  def setPreferences(preferences: titaniumLib.WebViewPreferencesObject): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.processPool> property.
  				 */
  def setProcessPool(processPool: WebViewProcessPool): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.selectionGranularity> property.
  				 */
  def setSelectionGranularity(selectionGranularity: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.suppressesIncrementalRendering> property.
  				 */
  def setSuppressesIncrementalRendering(suppressesIncrementalRendering: scala.Boolean): scala.Unit
}

object WebViewConfiguration {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    allowsAirPlayMediaPlayback: scala.Boolean,
    allowsInlineMediaPlayback: scala.Boolean,
    allowsPictureInPictureMediaPlayback: scala.Boolean,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getAllowsAirPlayMediaPlayback: () => scala.Boolean,
    getAllowsInlineMediaPlayback: () => scala.Boolean,
    getAllowsPictureInPictureMediaPlayback: () => scala.Boolean,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getMediaTypesRequiringUserActionForPlayback: () => scala.Double,
    getPreferences: () => titaniumLib.WebViewPreferencesObject,
    getProcessPool: () => WebViewProcessPool,
    getSelectionGranularity: () => scala.Double,
    getSuppressesIncrementalRendering: () => scala.Boolean,
    mediaTypesRequiringUserActionForPlayback: scala.Double,
    preferences: titaniumLib.WebViewPreferencesObject,
    processPool: WebViewProcessPool,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    selectionGranularity: scala.Double,
    setAllowsAirPlayMediaPlayback: scala.Boolean => scala.Unit,
    setAllowsInlineMediaPlayback: scala.Boolean => scala.Unit,
    setAllowsPictureInPictureMediaPlayback: scala.Boolean => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setMediaTypesRequiringUserActionForPlayback: scala.Double => scala.Unit,
    setPreferences: titaniumLib.WebViewPreferencesObject => scala.Unit,
    setProcessPool: WebViewProcessPool => scala.Unit,
    setSelectionGranularity: scala.Double => scala.Unit,
    setSuppressesIncrementalRendering: scala.Boolean => scala.Unit,
    suppressesIncrementalRendering: scala.Boolean,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): WebViewConfiguration = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), allowsAirPlayMediaPlayback = allowsAirPlayMediaPlayback, allowsInlineMediaPlayback = allowsInlineMediaPlayback, allowsPictureInPictureMediaPlayback = allowsPictureInPictureMediaPlayback, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getAllowsAirPlayMediaPlayback = js.Any.fromFunction0(getAllowsAirPlayMediaPlayback), getAllowsInlineMediaPlayback = js.Any.fromFunction0(getAllowsInlineMediaPlayback), getAllowsPictureInPictureMediaPlayback = js.Any.fromFunction0(getAllowsPictureInPictureMediaPlayback), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getMediaTypesRequiringUserActionForPlayback = js.Any.fromFunction0(getMediaTypesRequiringUserActionForPlayback), getPreferences = js.Any.fromFunction0(getPreferences), getProcessPool = js.Any.fromFunction0(getProcessPool), getSelectionGranularity = js.Any.fromFunction0(getSelectionGranularity), getSuppressesIncrementalRendering = js.Any.fromFunction0(getSuppressesIncrementalRendering), mediaTypesRequiringUserActionForPlayback = mediaTypesRequiringUserActionForPlayback, preferences = preferences, processPool = processPool, removeEventListener = js.Any.fromFunction2(removeEventListener), selectionGranularity = selectionGranularity, setAllowsAirPlayMediaPlayback = js.Any.fromFunction1(setAllowsAirPlayMediaPlayback), setAllowsInlineMediaPlayback = js.Any.fromFunction1(setAllowsInlineMediaPlayback), setAllowsPictureInPictureMediaPlayback = js.Any.fromFunction1(setAllowsPictureInPictureMediaPlayback), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setMediaTypesRequiringUserActionForPlayback = js.Any.fromFunction1(setMediaTypesRequiringUserActionForPlayback), setPreferences = js.Any.fromFunction1(setPreferences), setProcessPool = js.Any.fromFunction1(setProcessPool), setSelectionGranularity = js.Any.fromFunction1(setSelectionGranularity), setSuppressesIncrementalRendering = js.Any.fromFunction1(setSuppressesIncrementalRendering), suppressesIncrementalRendering = suppressesIncrementalRendering)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[WebViewConfiguration]
  }
}

