package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassStatusBar
  extends org.scalablytyped.runtime.Instantiable0[reactDashNativeLib.reactDashNativeMod.StatusBar] {
  /**
    * The current height of the status bar on the device.
    * @platform android
    */
  var currentHeight: js.UndefOr[scala.Double] = js.native
  /**
    * Set the background color for the status bar
    * @param color Background color.
    * @param animated Animate the style change.
    */
  def setBackgroundColor(color: java.lang.String): scala.Unit = js.native
  def setBackgroundColor(color: java.lang.String, animated: scala.Boolean): scala.Unit = js.native
  /**
    * Set the status bar style
    * @param style Status bar style to set
    * @param animated Animate the style change.
    */
  def setBarStyle(style: reactDashNativeLib.reactDashNativeMod.StatusBarStyle): scala.Unit = js.native
  def setBarStyle(style: reactDashNativeLib.reactDashNativeMod.StatusBarStyle, animated: scala.Boolean): scala.Unit = js.native
  /**
    * Show or hide the status bar
    * @param hidden The dialog's title.
    * @param animation Optional animation when
    *    changing the status bar hidden property.
    */
  def setHidden(hidden: scala.Boolean): scala.Unit = js.native
  def setHidden(hidden: scala.Boolean, animation: reactDashNativeLib.reactDashNativeMod.StatusBarAnimation): scala.Unit = js.native
  /**
    * Control the visibility of the network activity indicator
    * @param visible Show the indicator.
    */
  def setNetworkActivityIndicatorVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
    * Control the translucency of the status bar
    * @param translucent Set as translucent.
    */
  def setTranslucent(translucent: scala.Boolean): scala.Unit = js.native
}

