package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of [Android RemoteViews](https://developer.android.com/reference/android/widget/RemoteViews.html).
		 */
trait RemoteViews
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Android layout resource ID for the view to display. Required.
  			 */
  var layoutId: scala.Double
  /**
  			 * Package name that the resource ID lives in. Optional.
  			 */
  var packageName: java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.RemoteViews.layoutId> property.
  			 */
  def getLayoutId(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Android.RemoteViews.packageName> property.
  			 */
  def getPackageName(): java.lang.String
  /**
  			 * Calls a method taking a single `boolean` argument on a view in the remote view
  			 * hierarchy.  See Android's documentation for
  			 * [setBoolean](https://developer.android.com/reference/android/widget/RemoteViews.html#setBoolean(int, java.lang.String, boolean)).
  			 */
  def setBoolean(viewId: scala.Double, methodName: java.lang.String, value: scala.Boolean): scala.Unit
  /**
  			 * Sets the base time, format string, and started flag for a chronometer
  			 * in the remote view hierarchy.
  			 */
  def setChronometer(viewId: scala.Double, base: stdLib.Date, format: java.lang.String, started: scala.Boolean): scala.Unit
  /**
  			 * Calls a method taking a single `double` argument on a view in the remote view
  			 * hierarchy.
  			 */
  def setDouble(viewId: scala.Double, methodName: java.lang.String, value: scala.Double): scala.Unit
  /**
  			 * Sets the image for an image view in the remote view hierarchy using an Android drawable resource.
  			 */
  def setImageViewResource(viewId: scala.Double, srcId: scala.Double): scala.Unit
  /**
  			 * Sets the image for an image view in the remote view hierarchy using a URI.
  			 */
  def setImageViewUri(viewId: scala.Double, uri: java.lang.String): scala.Unit
  /**
  			 * Calls a method taking a single `int` argument on a view in the remote view hierarchy.
  			 */
  def setInt(viewId: scala.Double, methodName: java.lang.String, value: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.RemoteViews.layoutId> property.
  			 */
  def setLayoutId(layoutId: scala.Double): scala.Unit
  /**
  			 * Launches a <Titanium.Android.PendingIntent> when the specified view is clicked.
  			 */
  def setOnClickPendingIntent(viewId: scala.Double, pendingIntent: PendingIntent): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.RemoteViews.packageName> property.
  			 */
  def setPackageName(packageName: java.lang.String): scala.Unit
  /**
  			 * Sets the progress, max value, and indeterminate flag of a progress bar in the
  			 * remote view hierarchy.
  			 */
  def setProgressBar(viewId: scala.Double, max: scala.Double, progress: scala.Double, indeterminate: scala.Boolean): scala.Unit
  /**
  			 * Calls a method taking a single String argument on a view in the remote view
  			 * hierarchy.
  			 */
  def setString(viewId: scala.Double, methodName: java.lang.String, value: java.lang.String): scala.Unit
  /**
  			 * Sets the text color of a view in the remote view hierarchy.
  			 */
  def setTextColor(viewId: scala.Double, color: scala.Double): scala.Unit
  /**
  			 * Sets the text of a text view in the remote view hierarchy.
  			 */
  def setTextViewText(viewId: scala.Double, text: java.lang.String): scala.Unit
  /**
  			 * Calls a method taking one URI on a view in the remote view hierarchy.
  			 */
  def setUri(viewId: scala.Double, methodName: java.lang.String, value: java.lang.String): scala.Unit
  /**
  			 * Sets the visibility of a view in the remote view hierarchy.
  			 */
  def setViewVisibility(viewId: scala.Double, visibility: scala.Double): scala.Unit
}

