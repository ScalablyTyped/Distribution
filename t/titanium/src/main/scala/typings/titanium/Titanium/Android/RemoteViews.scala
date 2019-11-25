package typings.titanium.Titanium.Android

import typings.std.Date
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of [Android RemoteViews](https://developer.android.com/reference/android/widget/RemoteViews.html).
		 */
trait RemoteViews extends Proxy {
  /**
  			 * Android layout resource ID for the view to display. Required.
  			 */
  var layoutId: Double
  /**
  			 * Package name that the resource ID lives in. Optional.
  			 */
  var packageName: String
  /**
  			 * Gets the value of the <Titanium.Android.RemoteViews.layoutId> property.
  			 */
  def getLayoutId(): Double
  /**
  			 * Gets the value of the <Titanium.Android.RemoteViews.packageName> property.
  			 */
  def getPackageName(): String
  /**
  			 * Calls a method taking a single `boolean` argument on a view in the remote view
  			 * hierarchy.  See Android's documentation for
  			 * [setBoolean](https://developer.android.com/reference/android/widget/RemoteViews.html#setBoolean(int, java.lang.String, boolean)).
  			 */
  def setBoolean(viewId: Double, methodName: String, value: Boolean): Unit
  /**
  			 * Sets the base time, format string, and started flag for a chronometer
  			 * in the remote view hierarchy.
  			 */
  def setChronometer(viewId: Double, base: Date, format: String, started: Boolean): Unit
  /**
  			 * Calls a method taking a single `double` argument on a view in the remote view
  			 * hierarchy.
  			 */
  def setDouble(viewId: Double, methodName: String, value: Double): Unit
  /**
  			 * Sets the image for an image view in the remote view hierarchy using an Android drawable resource.
  			 */
  def setImageViewResource(viewId: Double, srcId: Double): Unit
  /**
  			 * Sets the image for an image view in the remote view hierarchy using a URI.
  			 */
  def setImageViewUri(viewId: Double, uri: String): Unit
  /**
  			 * Calls a method taking a single `int` argument on a view in the remote view hierarchy.
  			 */
  def setInt(viewId: Double, methodName: String, value: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.RemoteViews.layoutId> property.
  			 */
  def setLayoutId(layoutId: Double): Unit
  /**
  			 * Launches a <Titanium.Android.PendingIntent> when the specified view is clicked.
  			 */
  def setOnClickPendingIntent(viewId: Double, pendingIntent: PendingIntent): Unit
  /**
  			 * Sets the value of the <Titanium.Android.RemoteViews.packageName> property.
  			 */
  def setPackageName(packageName: String): Unit
  /**
  			 * Sets the progress, max value, and indeterminate flag of a progress bar in the
  			 * remote view hierarchy.
  			 */
  def setProgressBar(viewId: Double, max: Double, progress: Double, indeterminate: Boolean): Unit
  /**
  			 * Calls a method taking a single String argument on a view in the remote view
  			 * hierarchy.
  			 */
  def setString(viewId: Double, methodName: String, value: String): Unit
  /**
  			 * Sets the text color of a view in the remote view hierarchy.
  			 */
  def setTextColor(viewId: Double, color: Double): Unit
  /**
  			 * Sets the text of a text view in the remote view hierarchy.
  			 */
  def setTextViewText(viewId: Double, text: String): Unit
  /**
  			 * Calls a method taking one URI on a view in the remote view hierarchy.
  			 */
  def setUri(viewId: Double, methodName: String, value: String): Unit
  /**
  			 * Sets the visibility of a view in the remote view hierarchy.
  			 */
  def setViewVisibility(viewId: Double, visibility: Double): Unit
}

object RemoteViews {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getLayoutId: () => Double,
    getPackageName: () => String,
    layoutId: Double,
    packageName: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBoolean: (Double, String, Boolean) => Unit,
    setBubbleParent: Boolean => Unit,
    setChronometer: (Double, Date, String, Boolean) => Unit,
    setDouble: (Double, String, Double) => Unit,
    setImageViewResource: (Double, Double) => Unit,
    setImageViewUri: (Double, String) => Unit,
    setInt: (Double, String, Double) => Unit,
    setLayoutId: Double => Unit,
    setOnClickPendingIntent: (Double, PendingIntent) => Unit,
    setPackageName: String => Unit,
    setProgressBar: (Double, Double, Double, Boolean) => Unit,
    setString: (Double, String, String) => Unit,
    setTextColor: (Double, Double) => Unit,
    setTextViewText: (Double, String) => Unit,
    setUri: (Double, String, String) => Unit,
    setViewVisibility: (Double, Double) => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): RemoteViews = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getLayoutId = js.Any.fromFunction0(getLayoutId), getPackageName = js.Any.fromFunction0(getPackageName), layoutId = layoutId.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setBoolean = js.Any.fromFunction3(setBoolean), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setChronometer = js.Any.fromFunction4(setChronometer), setDouble = js.Any.fromFunction3(setDouble), setImageViewResource = js.Any.fromFunction2(setImageViewResource), setImageViewUri = js.Any.fromFunction2(setImageViewUri), setInt = js.Any.fromFunction3(setInt), setLayoutId = js.Any.fromFunction1(setLayoutId), setOnClickPendingIntent = js.Any.fromFunction2(setOnClickPendingIntent), setPackageName = js.Any.fromFunction1(setPackageName), setProgressBar = js.Any.fromFunction4(setProgressBar), setString = js.Any.fromFunction3(setString), setTextColor = js.Any.fromFunction2(setTextColor), setTextViewText = js.Any.fromFunction2(setTextViewText), setUri = js.Any.fromFunction3(setUri), setViewVisibility = js.Any.fromFunction2(setViewVisibility))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteViews]
  }
}

