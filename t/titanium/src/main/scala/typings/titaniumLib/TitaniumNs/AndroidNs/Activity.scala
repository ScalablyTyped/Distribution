package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of an Android Activity.
		 */
@js.native
trait Activity
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The action bar for this activity.
  			 */
  val actionBar: ActionBar = js.native
  /**
  			 * The `Intent` that was used to start this Activity.
  			 */
  val intent: Intent = js.native
  /**
  			 * Specifies a specific orientation for this activity.
  			 */
  var requestedOrientation: scala.Double = js.native
  /**
  			 * Toolbar instance that serves as ActionBar
  			 */
  var supportToolbar: titaniumLib.TitaniumNs.UINs.Toolbar = js.native
  /**
  			 * Closes this activity.
  			 */
  def finish(): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.actionBar> property.
  			 */
  def getActionBar(): ActionBar = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.intent> property.
  			 */
  def getIntent(): Intent = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onCreate> property.
  			 */
  def getOnCreate(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onCreateOptionsMenu> property.
  			 */
  def getOnCreateOptionsMenu(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onDestroy> property.
  			 */
  def getOnDestroy(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onPause> property.
  			 */
  def getOnPause(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onPrepareOptionsMenu> property.
  			 */
  def getOnPrepareOptionsMenu(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onRestart> property.
  			 */
  def getOnRestart(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onResume> property.
  			 */
  def getOnResume(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onStart> property.
  			 */
  def getOnStart(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onStop> property.
  			 */
  def getOnStop(): js.Function1[/* param0 */ js.Any, _] = js.native
  /**
  			 * Gets an Android or Application string using the specified Resource ID and optional format arguments.
  			 */
  def getString(resourceId: scala.Double, format: js.Any): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.supportToolbar> property.
  			 */
  def getSupportToolbar(): titaniumLib.TitaniumNs.UINs.Toolbar = js.native
  /**
  			 * Declares that the option menu has changed and should be recreated.
  			 */
  def invalidateOptionsMenu(): scala.Unit = js.native
  /**
  			 * Callback function called when the Android activity is created.
  			 */
  def onCreate(param0: js.Any): js.Any = js.native
  /**
  			 * Callback function called to initially create an Android options menu
  			 * for this Activity when the user presses the **Menu** button.
  			 */
  def onCreateOptionsMenu(param0: js.Any): js.Any = js.native
  /**
  			 * Callback function called when the Android activity is destroyed.
  			 */
  def onDestroy(param0: js.Any): js.Any = js.native
  /**
  			 * Callback function called when the Android activity is paused.
  			 */
  def onPause(param0: js.Any): js.Any = js.native
  /**
  			 * Callback function called to prepare an options menu for display when the user presses
  			 * the **Menu** button.
  			 */
  def onPrepareOptionsMenu(param0: js.Any): js.Any = js.native
  /**
  			 * Callback function called when the Android activity is restarted.
  			 */
  def onRestart(param0: js.Any): js.Any = js.native
  /**
  			 * Callback function called when the Android activity is resumed.
  			 */
  def onResume(param0: js.Any): js.Any = js.native
  /**
  			 * Callback function called when the Android activity is started.
  			 */
  def onStart(param0: js.Any): js.Any = js.native
  /**
  			 * Callback function called when the Android activity is stopped.
  			 */
  def onStop(param0: js.Any): js.Any = js.native
  /**
  			 * Programmatically opens the options menu.
  			 */
  def openOptionsMenu(): scala.Unit = js.native
  /**
  			 * Broadcast the passed in `Intent` to all `BroadcastReceiver`s.
  			 */
  def sendBroadcast(intent: Intent): scala.Unit = js.native
  /**
  			 * Broadcast the passed in `Intent` to all `BroadcastReceiver`s with an optional permission.
  			 */
  def sendBroadcastWithPermission(intent: Intent): scala.Unit = js.native
  def sendBroadcastWithPermission(intent: Intent, receiverPermission: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onCreate> property.
  			 */
  def setOnCreate(onCreate: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onCreateOptionsMenu> property.
  			 */
  def setOnCreateOptionsMenu(onCreateOptionsMenu: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onDestroy> property.
  			 */
  def setOnDestroy(onDestroy: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onPause> property.
  			 */
  def setOnPause(onPause: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onPrepareOptionsMenu> property.
  			 */
  def setOnPrepareOptionsMenu(onPrepareOptionsMenu: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onRestart> property.
  			 */
  def setOnRestart(onRestart: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onResume> property.
  			 */
  def setOnResume(onResume: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onStart> property.
  			 */
  def setOnStart(onStart: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onStop> property.
  			 */
  def setOnStop(onStop: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the requested Activity orientation.
  			 */
  def setRequestedOrientation(orientation: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the result of this activity using an `Intent`.
  			 */
  def setResult(resultCode: scala.Double): scala.Unit = js.native
  def setResult(resultCode: scala.Double, intent: Intent): scala.Unit = js.native
  /**
  			 * Sets a toolbar instance to be used as an ActionBar.
  			 */
  def setSupportActionBar(toolbar: titaniumLib.TitaniumNs.UINs.Toolbar): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.supportToolbar> property.
  			 */
  def setSupportToolbar(supportToolbar: titaniumLib.TitaniumNs.UINs.Toolbar): scala.Unit = js.native
  /**
  			 * Starts a new activity, using the passed in `Intent` as the description.
  			 */
  def startActivity(intent: Intent): scala.Unit = js.native
  /**
  			 * The same as `startActivity`, but also accepts a callback function for handling the result of the started Activity.
  			 */
  def startActivityForResult(intent: Intent, callback: js.Function1[/* param0 */ titaniumLib.ActivityResult, _]): scala.Unit = js.native
}

