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

object RemoteViews {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getLayoutId: js.Function0[scala.Double],
    getPackageName: js.Function0[java.lang.String],
    layoutId: scala.Double,
    packageName: java.lang.String,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBoolean: js.Function3[scala.Double, java.lang.String, scala.Boolean, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setChronometer: js.Function4[scala.Double, stdLib.Date, java.lang.String, scala.Boolean, scala.Unit],
    setDouble: js.Function3[scala.Double, java.lang.String, scala.Double, scala.Unit],
    setImageViewResource: js.Function2[scala.Double, scala.Double, scala.Unit],
    setImageViewUri: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setInt: js.Function3[scala.Double, java.lang.String, scala.Double, scala.Unit],
    setLayoutId: js.Function1[scala.Double, scala.Unit],
    setOnClickPendingIntent: js.Function2[scala.Double, PendingIntent, scala.Unit],
    setPackageName: js.Function1[java.lang.String, scala.Unit],
    setProgressBar: js.Function4[scala.Double, scala.Double, scala.Double, scala.Boolean, scala.Unit],
    setString: js.Function3[scala.Double, java.lang.String, java.lang.String, scala.Unit],
    setTextColor: js.Function2[scala.Double, scala.Double, scala.Unit],
    setTextViewText: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setUri: js.Function3[scala.Double, java.lang.String, java.lang.String, scala.Unit],
    setViewVisibility: js.Function2[scala.Double, scala.Double, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): RemoteViews = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getLayoutId = getLayoutId, getPackageName = getPackageName, layoutId = layoutId, packageName = packageName, removeEventListener = removeEventListener, setBoolean = setBoolean, setBubbleParent = setBubbleParent, setChronometer = setChronometer, setDouble = setDouble, setImageViewResource = setImageViewResource, setImageViewUri = setImageViewUri, setInt = setInt, setLayoutId = setLayoutId, setOnClickPendingIntent = setOnClickPendingIntent, setPackageName = setPackageName, setProgressBar = setProgressBar, setString = setString, setTextColor = setTextColor, setTextViewText = setTextViewText, setUri = setUri, setViewVisibility = setViewVisibility)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[RemoteViews]
  }
}

