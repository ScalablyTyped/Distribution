package typings.titanium.Titanium.Android

import typings.titanium.ActivityResult
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of an Android Activity.
		 */
@js.native
trait Activity extends Proxy {
  /**
  			 * The action bar for this activity.
  			 */
  val actionBar: ActionBar = js.native
  /**
  			 * The last `Intent` received by this activity.
  			 */
  val intent: Intent = js.native
  /**
  			 * Specifies a specific orientation for this activity.
  			 */
  var requestedOrientation: Double = js.native
  /**
  			 * Toolbar instance that serves as ActionBar
  			 */
  var supportToolbar: Toolbar = js.native
  /**
  			 * Closes this activity.
  			 */
  def finish(): Unit = js.native
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
  def getString(resourceId: Double, format: js.Any): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.supportToolbar> property.
  			 */
  def getSupportToolbar(): Toolbar = js.native
  /**
  			 * Declares that the option menu has changed and should be recreated.
  			 */
  def invalidateOptionsMenu(): Unit = js.native
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
  def openOptionsMenu(): Unit = js.native
  /**
  			 * Broadcast the passed in `Intent` to all `BroadcastReceiver`s.
  			 */
  def sendBroadcast(intent: Intent): Unit = js.native
  /**
  			 * Broadcast the passed in `Intent` to all `BroadcastReceiver`s with an optional permission.
  			 */
  def sendBroadcastWithPermission(intent: Intent): Unit = js.native
  def sendBroadcastWithPermission(intent: Intent, receiverPermission: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onCreate> property.
  			 */
  def setOnCreate(onCreate: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onCreateOptionsMenu> property.
  			 */
  def setOnCreateOptionsMenu(onCreateOptionsMenu: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onDestroy> property.
  			 */
  def setOnDestroy(onDestroy: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onPause> property.
  			 */
  def setOnPause(onPause: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onPrepareOptionsMenu> property.
  			 */
  def setOnPrepareOptionsMenu(onPrepareOptionsMenu: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onRestart> property.
  			 */
  def setOnRestart(onRestart: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onResume> property.
  			 */
  def setOnResume(onResume: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onStart> property.
  			 */
  def setOnStart(onStart: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onStop> property.
  			 */
  def setOnStop(onStop: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the requested Activity orientation.
  			 */
  def setRequestedOrientation(orientation: Double): Unit = js.native
  /**
  			 * Sets the result of this activity using an `Intent`.
  			 */
  def setResult(resultCode: Double): Unit = js.native
  def setResult(resultCode: Double, intent: Intent): Unit = js.native
  /**
  			 * Sets a toolbar instance to be used as an ActionBar.
  			 */
  def setSupportActionBar(toolbar: Toolbar): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.supportToolbar> property.
  			 */
  def setSupportToolbar(supportToolbar: Toolbar): Unit = js.native
  /**
  			 * Starts a new activity, using the passed in `Intent` as the description.
  			 */
  def startActivity(intent: Intent): Unit = js.native
  /**
  			 * The same as `startActivity`, but also accepts a callback function for handling the result of the started Activity.
  			 */
  def startActivityForResult(intent: Intent, callback: js.Function1[/* param0 */ ActivityResult, _]): Unit = js.native
}

