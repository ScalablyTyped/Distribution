package typings.titanium.Titanium.Android

import typings.std.Date
import typings.titanium.Titanium.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Titanium binding of [Android RemoteViews](https://developer.android.com/reference/android/widget/RemoteViews.html).
  */
@js.native
trait RemoteViews extends Proxy {
  
  /**
    * Gets the value of the <Titanium.Android.RemoteViews.layoutId> property.
    * @deprecated Access <Titanium.Android.RemoteViews.layoutId> instead.
    */
  def getLayoutId(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Android.RemoteViews.packageName> property.
    * @deprecated Access <Titanium.Android.RemoteViews.packageName> instead.
    */
  def getPackageName(): String = js.native
  
  /**
    * Android layout resource ID for the view to display. Required.
    */
  var layoutId: Double = js.native
  
  /**
    * Package name that the resource ID lives in. Optional.
    */
  var packageName: String = js.native
  
  /**
    * Calls a method taking a single `boolean` argument on a view in the remote view
    * hierarchy.  See Android's documentation for
    * [setBoolean](https://developer.android.com/reference/android/widget/RemoteViews.html#setBoolean(int, java.lang.String, boolean)).
    */
  def setBoolean(viewId: Double, methodName: String, value: Boolean): Unit = js.native
  
  /**
    * Sets the base time, format string, and started flag for a chronometer
    * in the remote view hierarchy.
    */
  def setChronometer(viewId: Double, base: Date, format: String, started: Boolean): Unit = js.native
  
  /**
    * Calls a method taking a single `double` argument on a view in the remote view
    * hierarchy.
    */
  def setDouble(viewId: Double, methodName: String, value: Double): Unit = js.native
  
  /**
    * Sets the image for an image view in the remote view hierarchy using an Android drawable resource.
    */
  def setImageViewResource(viewId: Double, srcId: Double): Unit = js.native
  
  /**
    * Sets the image for an image view in the remote view hierarchy using a URI.
    */
  def setImageViewUri(viewId: Double, uri: String): Unit = js.native
  
  /**
    * Calls a method taking a single `int` argument on a view in the remote view hierarchy.
    */
  def setInt(viewId: Double, methodName: String, value: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.RemoteViews.layoutId> property.
    * @deprecated Set the value using <Titanium.Android.RemoteViews.layoutId> instead.
    */
  def setLayoutId(layoutId: Double): Unit = js.native
  
  /**
    * Launches a <Titanium.Android.PendingIntent> when the specified view is clicked.
    */
  def setOnClickPendingIntent(viewId: Double, pendingIntent: PendingIntent): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Android.RemoteViews.packageName> property.
    * @deprecated Set the value using <Titanium.Android.RemoteViews.packageName> instead.
    */
  def setPackageName(packageName: String): Unit = js.native
  
  /**
    * Sets the progress, max value, and indeterminate flag of a progress bar in the
    * remote view hierarchy.
    */
  def setProgressBar(viewId: Double, max: Double, progress: Double, indeterminate: Boolean): Unit = js.native
  
  /**
    * Calls a method taking a single String argument on a view in the remote view
    * hierarchy.
    */
  def setString(viewId: Double, methodName: String, value: String): Unit = js.native
  
  /**
    * Sets the text color of a view in the remote view hierarchy.
    */
  def setTextColor(viewId: Double, color: Double): Unit = js.native
  
  /**
    * Sets the text of a text view in the remote view hierarchy.
    */
  def setTextViewText(viewId: Double, text: String): Unit = js.native
  
  /**
    * Calls a method taking one URI on a view in the remote view hierarchy.
    */
  def setUri(viewId: Double, methodName: String, value: String): Unit = js.native
  
  /**
    * Sets the visibility of a view in the remote view hierarchy.
    */
  def setViewVisibility(viewId: Double, visibility: Double): Unit = js.native
}
