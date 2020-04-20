package typings.titanium.Titanium.Android

import typings.titanium.ActivityLifecycleCallbackObject
import typings.titanium.ActivityResult
import typings.titanium.OptionsMenuCallbackObject
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.Toolbar
import typings.titanium.titaniumStrings.newintent
import typings.titanium.titaniumStrings.onIntent
import typings.titanium.titaniumStrings.userinteraction
import typings.titanium.titaniumStrings.userleavehint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of an Android Activity.
		 */
@JSGlobal("Titanium.Android.Activity")
@js.native
class Activity () extends Proxy {
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
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_newintent(
    name: newintent,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ActivityNewintentEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_onIntent(
    name: onIntent,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ActivityOnIntentEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_userinteraction(
    name: userinteraction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ActivityUserinteractionEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_userleavehint(
    name: userleavehint,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ActivityUserleavehintEvent, Unit]
  ): Unit = js.native
  /**
  			 * Closes this activity.
  			 */
  def finish(): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_newintent(name: newintent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_newintent(name: newintent, event: ActivityNewintentEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_onIntent(name: onIntent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_onIntent(name: onIntent, event: ActivityOnIntentEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_userinteraction(name: userinteraction): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_userinteraction(name: userinteraction, event: ActivityUserinteractionEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_userleavehint(name: userleavehint): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_userleavehint(name: userleavehint, event: ActivityUserleavehintEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.actionBar> property.
  			 * @deprecated Access <Titanium.Android.Activity.actionBar> instead.
  			 */
  def getActionBar(): ActionBar = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.intent> property.
  			 * @deprecated Access <Titanium.Android.Activity.intent> instead.
  			 */
  def getIntent(): Intent = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onCreate> property.
  			 * @deprecated Access <Titanium.Android.Activity.onCreate> instead.
  			 */
  def getOnCreate(): js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onCreateOptionsMenu> property.
  			 * @deprecated Access <Titanium.Android.Activity.onCreateOptionsMenu> instead.
  			 */
  def getOnCreateOptionsMenu(): js.Function1[/* param0 */ OptionsMenuCallbackObject, Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onDestroy> property.
  			 * @deprecated Access <Titanium.Android.Activity.onDestroy> instead.
  			 */
  def getOnDestroy(): js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onPause> property.
  			 * @deprecated Access <Titanium.Android.Activity.onPause> instead.
  			 */
  def getOnPause(): js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onPrepareOptionsMenu> property.
  			 * @deprecated Access <Titanium.Android.Activity.onPrepareOptionsMenu> instead.
  			 */
  def getOnPrepareOptionsMenu(): js.Function1[/* param0 */ OptionsMenuCallbackObject, Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onRestart> property.
  			 * @deprecated Access <Titanium.Android.Activity.onRestart> instead.
  			 */
  def getOnRestart(): js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onResume> property.
  			 * @deprecated Access <Titanium.Android.Activity.onResume> instead.
  			 */
  def getOnResume(): js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onStart> property.
  			 * @deprecated Access <Titanium.Android.Activity.onStart> instead.
  			 */
  def getOnStart(): js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.onStop> property.
  			 * @deprecated Access <Titanium.Android.Activity.onStop> instead.
  			 */
  def getOnStop(): js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit] = js.native
  /**
  			 * Gets an Android or Application string using the specified Resource ID and optional format arguments.
  			 */
  def getString(resourceId: Double, format: js.Any): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.Activity.supportToolbar> property.
  			 * @deprecated Access <Titanium.Android.Activity.supportToolbar> instead.
  			 */
  def getSupportToolbar(): Toolbar = js.native
  /**
  			 * Declares that the option menu has changed and should be recreated.
  			 */
  def invalidateOptionsMenu(): Unit = js.native
  /**
  			 * Callback function called when the Android activity is created.
  			 */
  def onCreate(param0: ActivityLifecycleCallbackObject): Unit = js.native
  /**
  			 * Callback function called to initially create an Android options menu
  			 * for this Activity when the user presses the **Menu** button.
  			 */
  def onCreateOptionsMenu(param0: OptionsMenuCallbackObject): Unit = js.native
  /**
  			 * Callback function called when the Android activity is destroyed.
  			 */
  def onDestroy(param0: ActivityLifecycleCallbackObject): Unit = js.native
  /**
  			 * Callback function called when the Android activity is paused.
  			 */
  def onPause(param0: ActivityLifecycleCallbackObject): Unit = js.native
  /**
  			 * Callback function called to prepare an options menu for display when the user presses
  			 * the **Menu** button.
  			 */
  def onPrepareOptionsMenu(param0: OptionsMenuCallbackObject): Unit = js.native
  /**
  			 * Callback function called when the Android activity is restarted.
  			 */
  def onRestart(param0: ActivityLifecycleCallbackObject): Unit = js.native
  /**
  			 * Callback function called when the Android activity is resumed.
  			 */
  def onResume(param0: ActivityLifecycleCallbackObject): Unit = js.native
  /**
  			 * Callback function called when the Android activity is started.
  			 */
  def onStart(param0: ActivityLifecycleCallbackObject): Unit = js.native
  /**
  			 * Callback function called when the Android activity is stopped.
  			 */
  def onStop(param0: ActivityLifecycleCallbackObject): Unit = js.native
  /**
  			 * Programmatically opens the options menu.
  			 */
  def openOptionsMenu(): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_newintent(
    name: newintent,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ActivityNewintentEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_onIntent(
    name: onIntent,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ActivityOnIntentEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_userinteraction(
    name: userinteraction,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ActivityUserinteractionEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_userleavehint(
    name: userleavehint,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ActivityUserleavehintEvent, Unit]
  ): Unit = js.native
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
  			 * @deprecated Set the value using <Titanium.Android.Activity.onCreate> instead.
  			 */
  def setOnCreate(onCreate: js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onCreateOptionsMenu> property.
  			 * @deprecated Set the value using <Titanium.Android.Activity.onCreateOptionsMenu> instead.
  			 */
  def setOnCreateOptionsMenu(onCreateOptionsMenu: js.Function1[/* param0 */ OptionsMenuCallbackObject, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onDestroy> property.
  			 * @deprecated Set the value using <Titanium.Android.Activity.onDestroy> instead.
  			 */
  def setOnDestroy(onDestroy: js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onPause> property.
  			 * @deprecated Set the value using <Titanium.Android.Activity.onPause> instead.
  			 */
  def setOnPause(onPause: js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onPrepareOptionsMenu> property.
  			 * @deprecated Set the value using <Titanium.Android.Activity.onPrepareOptionsMenu> instead.
  			 */
  def setOnPrepareOptionsMenu(onPrepareOptionsMenu: js.Function1[/* param0 */ OptionsMenuCallbackObject, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onRestart> property.
  			 * @deprecated Set the value using <Titanium.Android.Activity.onRestart> instead.
  			 */
  def setOnRestart(onRestart: js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onResume> property.
  			 * @deprecated Set the value using <Titanium.Android.Activity.onResume> instead.
  			 */
  def setOnResume(onResume: js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onStart> property.
  			 * @deprecated Set the value using <Titanium.Android.Activity.onStart> instead.
  			 */
  def setOnStart(onStart: js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.Activity.onStop> property.
  			 * @deprecated Set the value using <Titanium.Android.Activity.onStop> instead.
  			 */
  def setOnStop(onStop: js.Function1[/* param0 */ ActivityLifecycleCallbackObject, Unit]): Unit = js.native
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
  			 * @deprecated Set the value using <Titanium.Android.Activity.supportToolbar> instead.
  			 */
  def setSupportToolbar(supportToolbar: Toolbar): Unit = js.native
  /**
  			 * Starts a new activity, using the passed in `Intent` as the description.
  			 */
  def startActivity(intent: Intent): Unit = js.native
  /**
  			 * The same as `startActivity`, but also accepts a callback function for handling the result of the started Activity.
  			 */
  def startActivityForResult(intent: Intent, callback: js.Function1[/* param0 */ ActivityResult, Unit]): Unit = js.native
}

