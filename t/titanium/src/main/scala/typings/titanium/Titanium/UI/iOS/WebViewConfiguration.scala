package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.WebViewPreferencesObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of properties used to initialize a web view.
  */
@js.native
trait WebViewConfiguration extends Proxy {
  /**
    * A Boolean value indicating whether AirPlay is allowed.
    */
  var allowsAirPlayMediaPlayback: Boolean = js.native
  /**
    * A Boolean value indicating whether HTML5 videos play inline or use the native full-screen controller.
    */
  var allowsInlineMediaPlayback: Boolean = js.native
  /**
    * A Boolean value indicating whether HTML5 videos can play picture-in-picture.
    */
  var allowsPictureInPictureMediaPlayback: Boolean = js.native
  /**
    * Determines which media types require a user gesture to begin playing.
    */
  var mediaTypesRequiringUserActionForPlayback: Double = js.native
  /**
    * The preference settings to be used by the web view.
    */
  var preferences: WebViewPreferencesObject = js.native
  /**
    * The process pool from which to obtain the  Web Content process of view.
    */
  var processPool: WebViewProcessPool = js.native
  /**
    * The level of granularity with which the user can interactively select content in the web view.
    */
  var selectionGranularity: Double = js.native
  /**
    * A Boolean value indicating whether the web view suppresses content rendering until it is fully
    * loaded into memory.
    */
  var suppressesIncrementalRendering: Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsAirPlayMediaPlayback> property.
    * @deprecated Access <Titanium.UI.iOS.WebViewConfiguration.allowsAirPlayMediaPlayback> instead.
    */
  def getAllowsAirPlayMediaPlayback(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsInlineMediaPlayback> property.
    * @deprecated Access <Titanium.UI.iOS.WebViewConfiguration.allowsInlineMediaPlayback> instead.
    */
  def getAllowsInlineMediaPlayback(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsPictureInPictureMediaPlayback> property.
    * @deprecated Access <Titanium.UI.iOS.WebViewConfiguration.allowsPictureInPictureMediaPlayback> instead.
    */
  def getAllowsPictureInPictureMediaPlayback(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.mediaTypesRequiringUserActionForPlayback> property.
    * @deprecated Access <Titanium.UI.iOS.WebViewConfiguration.mediaTypesRequiringUserActionForPlayback> instead.
    */
  def getMediaTypesRequiringUserActionForPlayback(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.preferences> property.
    * @deprecated Access <Titanium.UI.iOS.WebViewConfiguration.preferences> instead.
    */
  def getPreferences(): WebViewPreferencesObject = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.processPool> property.
    * @deprecated Access <Titanium.UI.iOS.WebViewConfiguration.processPool> instead.
    */
  def getProcessPool(): WebViewProcessPool = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.selectionGranularity> property.
    * @deprecated Access <Titanium.UI.iOS.WebViewConfiguration.selectionGranularity> instead.
    */
  def getSelectionGranularity(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.WebViewConfiguration.suppressesIncrementalRendering> property.
    * @deprecated Access <Titanium.UI.iOS.WebViewConfiguration.suppressesIncrementalRendering> instead.
    */
  def getSuppressesIncrementalRendering(): Boolean = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsAirPlayMediaPlayback> property.
    * @deprecated Set the value using <Titanium.UI.iOS.WebViewConfiguration.allowsAirPlayMediaPlayback> instead.
    */
  def setAllowsAirPlayMediaPlayback(allowsAirPlayMediaPlayback: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsInlineMediaPlayback> property.
    * @deprecated Set the value using <Titanium.UI.iOS.WebViewConfiguration.allowsInlineMediaPlayback> instead.
    */
  def setAllowsInlineMediaPlayback(allowsInlineMediaPlayback: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.allowsPictureInPictureMediaPlayback> property.
    * @deprecated Set the value using <Titanium.UI.iOS.WebViewConfiguration.allowsPictureInPictureMediaPlayback> instead.
    */
  def setAllowsPictureInPictureMediaPlayback(allowsPictureInPictureMediaPlayback: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.mediaTypesRequiringUserActionForPlayback> property.
    * @deprecated Set the value using <Titanium.UI.iOS.WebViewConfiguration.mediaTypesRequiringUserActionForPlayback> instead.
    */
  def setMediaTypesRequiringUserActionForPlayback(mediaTypesRequiringUserActionForPlayback: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.preferences> property.
    * @deprecated Set the value using <Titanium.UI.iOS.WebViewConfiguration.preferences> instead.
    */
  def setPreferences(preferences: WebViewPreferencesObject): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.processPool> property.
    * @deprecated Set the value using <Titanium.UI.iOS.WebViewConfiguration.processPool> instead.
    */
  def setProcessPool(processPool: WebViewProcessPool): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.selectionGranularity> property.
    * @deprecated Set the value using <Titanium.UI.iOS.WebViewConfiguration.selectionGranularity> instead.
    */
  def setSelectionGranularity(selectionGranularity: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.WebViewConfiguration.suppressesIncrementalRendering> property.
    * @deprecated Set the value using <Titanium.UI.iOS.WebViewConfiguration.suppressesIncrementalRendering> instead.
    */
  def setSuppressesIncrementalRendering(suppressesIncrementalRendering: Boolean): Unit = js.native
}

